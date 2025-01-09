# Boilerplate-Maven With Java17 Spring 3.4.0

## 프로젝트 구조
### 좋은 어플리케이션은 만들떈 알수 없다.
### 만들고 나서 수정을 할때 최소한의 작업과 장애 발생 영향도를 최소화 할수 있어야 한다.!
### 무조건 나누고 쪼갠다고 좋은 아키텍처라 할수없다.
### 상황에 맞게 아키텍처를 설계하고 구성해야 한다.
### MSA는 정답이 아니다!!


```html
maven POM으로 구성된 미니 MSA 보일러플레이트 레이어드 MVC 아키텍처 
DDD 도메인 드리븐 디자인 
부모 자식간 계층형 멀티모듈 각 도메인 주도적인 레이어
단위 통합 테스트 구성
소규모 리소스를 기반으로 확장 가능한 구조
```
## 계층 구조 설명
```text
gateway/                   <-- 루트 프로젝트 (Parent)  
├── pom.xml                <-- 부모 POM (공통 설정)  

├── step-hts-server/       <-- 항공,여행,패키지 hts 테스트 서버  
│   ├── pom.xml            <-- 모듈 POM  
│   └── src/main/java      <-- Java 소스 코드


├── app-common/            <-- 웹 공통 도메인 
│   ├── pom.xml            <-- 모듈 POM  
│   └── src/main/java      <-- Java 소스 코드  

├── travel-api/              <-- tour api  
│   ├── pom.xml            <-- 모듈 POM  
│   └── src/main/java      <-- Java 소스 코드 

```

## 멀티모듈 만들기 
생성가능한 artifactId명령어 모음
```text
Choose archetype:

1: internal -> org.apache.maven.archetypes:maven-archetype-archetype (An archetype which contains a sample archetype.)
2: internal -> org.apache.maven.archetypes:maven-archetype-j2ee-simple (An archetype which contains a simplifed sample J2EE application.)
3: internal -> org.apache.maven.archetypes:maven-archetype-plugin (An archetype which contains a sample Maven plugin.)
4: internal -> org.apache.maven.archetypes:maven-archetype-plugin-site (An archetype which contains a sample Maven plugin site.
      This archetype can be layered upon an existing Maven plugin project.)
5: internal -> org.apache.maven.archetypes:maven-archetype-portlet (An archetype which contains a sample JSR-268 Portlet.)
6: internal -> org.apache.maven.archetypes:maven-archetype-profiles ()
7: internal -> org.apache.maven.archetypes:maven-archetype-quickstart (An archetype which contains a sample Maven project.)
8: internal -> org.apache.maven.archetypes:maven-archetype-site (An archetype which contains a sample Maven site which demonstrates
      some of the supported document types like APT, XDoc, and FML and demonstrates how
      to i18n your site. This archetype can be layered upon an existing Maven project.)
9: internal -> org.apache.maven.archetypes:maven-archetype-site-simple (An archetype which contains a sample Maven site.)
10: internal -> org.apache.maven.archetypes:maven-archetype-webapp (An archetype which contains a sample Maven Webapp project.)

```
>mvn archetype:generate -DarchetypeCatalog=internal

## Web Boilerplate
투어, 유저&인증인가, 공통 에러 처리
```
mvn archetype:generate \
    -DgroupId=com.lottecard.travel \
    -DartifactId=travel-api \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false       
    
mvn archetype:generate \
    -DgroupId=com.lottecard.travel \
    -DartifactId=app-common \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
```

## HTS Dummy Server
```text
mvn archetype:generate \
    -DgroupId=com.lottecard.travel \
    -DartifactId=step-hts-server \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
```

# maven 명령어
## maven 기본 클린 및 install
>mvn clean install
## maven 실행 및 에러로그 추가 컴파일
>mvn clean compile -e
## main maven 실행
>mvn clean spring-boot:run


#시나리오 테스트 
```text
partner-gateway 제휴사 게이트웨이
step-hts-server HTS dummy SERVER 구성

```
## hosts 설정
```text
127.0.0.1 partner-gateway.lottecard.co.kr
127.0.0.1 hts.com
```

