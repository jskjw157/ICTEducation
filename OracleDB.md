### 데이터베이스의 개념
</br>

+ 데이터베이스란 방대한 데이터를 효율적으로 관리하기 위해 컴퓨터에 통합저장한것
</br>

+ 데이터베이스 관리 시스템 DBMS이라는 프로그램을 이용하여 관리
</br>

+ 모든 조직에는 데이터베이스가 있다.
</br>

#### 데이터베이스 관리 시스템(DBMS)
</br>

+ 사용자와 응용프로그램에 편리하고 효율적인 데이터베이스 사용 환경을 제공하는 소프트웨어
</br>

#### SQL(구조적 질의어)
</br>

+ 테이블 튜플을 식별할 수 있는 기본키 PRIMARY KEY
</br>

+ 외래키 FREGIN KEY 다른 릴레이션과 연결하는 속성
</br>

#### select문
</br>

+ 특정 칼럼의 내용 검색을 하는 구문

  + 구문 : SELECT 컬럼명 FROM 테이블명 ex) SELECT DEPTNO, ENAME, MGR FROM EMP;
  
  + select뒤 컬럼명에 산술 연산자를 사용 할 수 있다. ex) SELECT ENAME, SAL*12, COMM FROM EMP;
</br>

  

