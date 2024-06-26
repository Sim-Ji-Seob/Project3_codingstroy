package org.spring.codingStory.board.employee.repository;

import org.spring.codingStory.board.employee.entity.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    @Modifying
    @Query(value = " update EmployeeEntity b set b.empHit=b.empHit+1  where b.id= :id ")
    void updateEmpHit(@Param("id") Long id);


    Page<EmployeeEntity> findByCategoryInAndEmpTitleContains(List<String> categories, String search, Pageable pageable);

    Page<EmployeeEntity> findByCategoryInAndEmpContentContains(List<String> categories, String search, Pageable pageable);

    List<EmployeeEntity> findTop5ByOrderByEmpHitDesc();
}
