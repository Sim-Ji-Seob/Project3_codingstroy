# codingStory

<details>
<summary>3차 프로젝트 기본설정</summary>


프로젝트명 : codingStory

프로그래밍 언어 : JAVA

프레임워크 : Springboot 2.7.11

라이브러리 DI : Spring WEB(MVC), Thymeleaf, Spring Data JPA, Lombok, SpringSecurity5 
               , websocket, validation, OAuth2, security  

데이터베이스 : MySql8

ORM : Spring Data JPA (JAVA(SQL))

개발툴 : IntelliJ

템플릿 엔진 : Thymeleaf (HTML + Data)

빌드 : Gradle

설정 : application.yml, application-oauth2.yml(google,naver,kakao api 키 필요)

기타 설정:
1. setting - gradle<br>
   <img src="src/main/resources/static/images/readme/img_20.png" width="250px" height="150px"/> <br>
2. project Structure - SDK -> 11 <br>
   <img src="src/main/resources/static/images/readme/img_21.png" width="400px" height="50px"/> <br>

</details>

##  📌 프로젝트 Git 다운로드 주소 📌
$git clone https://github.com/Sim-Ji-Seob/Project3_codingstroy.git <br>
branch : master

# 📝프로젝트 개요📝
## 🗓️일정
<img src="src/main/resources/static/images/readme/img.png" width="400" height="130"/> <br>


## 📝개요
<details>
<summary>프로젝트 개요</summary>
3차 프로젝트는 OPEN API DATA를 이용하는 과제입니다.<br>
영화, 날씨, 버스 API가 과제이고 저는 영화 API를 담당했습니다. 영화진흥원뿐만 아니라 TMDB라는
해외 API 사이트도 이용해서 데이터를 가져왔습니다. 또한 가져온 데이터를 DB에 저장하여 챗봇에도 사용했습니다.
</details><br>


## 🖱️개발 환경🖱️
### <span style="color: white;">💻 프로그램 💻</span> <br>
<p>
<img src="https://img.shields.io/badge/notion-white?style=flat-square&logo=notion&logoColor=gray"/>
<img src="https://img.shields.io/badge/mysql-2E64FE?style=flat-square&logo=mysql&logoColor=white"/>
<img src="https://img.shields.io/badge/visualstudiocode-81BEF7?style=flat-square&logo=visualstudiocode&logoColor=blue"/>
<img src="https://img.shields.io/badge/intellijidea-navy?style=flat-square&logo=intellijidea&logoColor=white"/>
<img src="https://img.shields.io/badge/github-black?style=-square&logo=github&logoColor=white"/>
<img src="https://img.shields.io/badge/eclipseide-darkblue?style=flat-square&logo=eclipseide&logoColor=white"/>
</p>

### <span style="color: white;">🛠 개발 환경 🛠</span> <br>
<p>
<img src="https://img.shields.io/badge/html5-green?style=flat-square&logo=html5&logoColor=white"/>
<img src="https://img.shields.io/badge/css3-blue?style=flat-square&logo=css3&logoColor=white"/>
<img src="https://img.shields.io/badge/auth0-ccc?style=flat-square&logo=auth0&logoColor=white"/>
<img src="https://img.shields.io/badge/chatbot-orange?style=flat-square&logo=chatbot&logoColor=white"/>
<img src="https://img.shields.io/badge/javascript-yellow?style=flat-square&logo=javascript&logoColor=white"/>
<img src="https://img.shields.io/badge/jquery-light?style=flat-square&logo=jquery&logoColor=white"/>
<img src="https://img.shields.io/badge/json-purple?style=flat-square&logo=json&logoColor=white"/>
<img src="https://img.shields.io/badge/openapiinitiative-FA5858?style=flat-square&logo=openapiinitiative&logoColor=white"/>
<img src="https://img.shields.io/badge/thymeleaf-0B610B?style=flat-square&logo=thymeleaf&logoColor=white"/>
<img src="https://img.shields.io/badge/spring-0B610B?style=flat-square&logo=spring&logoColor=white"/>
<img src="src/main/resources/static/images/readme/oAuth2.png" width="20" height="20"/> <br>
</p>

[![Top Langs](https://github-readme-stats.vercel.app/api/top-langs/?username=Sim)](https://github.com/Sim/github-readme-stats)

# ⚡ 팀원별 역할 ⚡
- [ ] 왕** (팀장) : 날씨 API, 날씨 Chat-Bo
- [x] <span style='color:green'>_**심지섭 (팀원) : 영화 API, 영화 Chat-Bot**_</span>
- [ ] 이** (팀원) : 영화 API, 영화 Chat-Bot
- [ ] 박** (팀원) : 버스 Chat-Bot
- [ ] 조** (팀원) : 버스 API

#  🚀 주요 기능 🚀

| 기능             | 설명                                    | 
|----------------|---------------------------------------|
| API 데이터 불러오기   | Open API 데이터를 불러와서 출력(일일/주말/주중 박스오피스) |
| API 데이터 DB에 저장 | 가져온 데이터를 DB에 저장(박스오피스 정보/ 영화 상세정보)    |
| API 데이터로 영화 검색 | TMDB API 통해서 전체 영화 검색                 |
| Chat-Bot       | DB에서 데이터를 불러와 채팅창에 출력                 |

# 📁 프로젝트 상세
### 목차
1. [API 데이터 가져오기](#1-api-데이터-가져오기)
2. [영화 검색](#2-영화-검색)
3. [API 데이터 DB에 저장](#2-api-데이터-db에-저장)
4. [Chat-Bot](#3-chat-bot)

# 1️⃣ API 데이터 가져오기
일일 박스오피스<br>
   <img src="src/main/resources/static/images/readme/img_1.png" width="400" height="200"/> <br>
주말 박스오피스<br>
   <img src="src/main/resources/static/images/readme/img_2.png" width="400" height="200"/> <br>
주중 박스오피스<br>
   <img src="src/main/resources/static/images/readme/img_3.png" width="400" height="200"/> <br>
영화 상세정보<br>
   <img src="src/main/resources/static/images/readme/img_7.png" width="500" height="250"/> <br>

| API 주소    | 설명                            | 
|-----------|-------------------------------|
| 한국 영화 진흥원 | 일일/주말/주중 박스오피스 데이터 <br>영화 상세정보 |
| TMDB      | 영화 포스터, 영화 줄거리(한/영)           |

![3차 박스오피스+상세정보](https://github.com/Sim-Ji-Seob/Project3_codingstroy/assets/154939602/995a55ff-40c4-400e-836a-36f763441948)

# 2️⃣ 영화 검색
TMDB API 를 활용하여 전체 영화를 검색할 수 있다.<br>
검색하는 키워드가 포함된 모든 영화를 검색하여 보여준다.<br>
![3차 영화 검색](https://github.com/Sim-Ji-Seob/Project3_codingstroy/assets/154939602/a1993023-ac28-4fe9-9142-2344c851b1c4)


# 3️⃣ API 데이터 DB에 저장
 Open API 주소를 통해 가져온 데이터를 DB에 저장하기 위해 URL 경로를 컨트롤러로 바꿔주어 저장 매서드를 사용<br>
영화 박스오피스 DB<br>
<img src="src/main/resources/static/images/readme/img_4.png" width="300" height="150"/> <br>

영화 상세정보 DB<br>
<img src="src/main/resources/static/images/readme/img_5.png" width="600" height="150"/> 
<img src="src/main/resources/static/images/readme/img_6.png" width="300" height="150"/> <br>

# 4️⃣ Chat-Bot
챗봇에 처음 접속하게 되면 메세지가 자동으로 출력<br>
해당 메세지에 오늘/주중/주말 박스오피스 정보가 나오는 버튼 설정<br>
클릭시 해당 박스오피스 순위를 출력<br>
영화의 제목을 입력시 해당 영화의 상세정보를 DB에서 가져와 출력<br>
<img src="src/main/resources/static/images/readme/img_8.png" width="220" height="380"/> 
<img src="src/main/resources/static/images/readme/img_9.png" width="220" height="380"/> <br>

해당 정보가 없을시 출력되는 메세지<br>
<img src="src/main/resources/static/images/readme/img_10.png" width="220" height="380"/> <br>

![3차 챗봇 확대](https://github.com/Sim-Ji-Seob/Project3_codingstroy/assets/154939602/3354786a-8ac1-4d90-bf7f-16c2b4ea2474)


[⬆⬆맨위로⬆⬆](#codingstory)
