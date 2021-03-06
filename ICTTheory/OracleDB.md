### 데이터베이스의 개념
<br/>

+ 데이터베이스란 방대한 데이터를 효율적으로 관리하기 위해 컴퓨터에 통합저장한것
<br/>

+ 데이터베이스 관리 시스템 DBMS이라는 프로그램을 이용하여 관리
<br/>

+ 모든 조직에는 데이터베이스가 있다.
<br/>

#### 데이터베이스 관리 시스템(DBMS)
<br/>

+ 사용자와 응용프로그램에 편리하고 효율적인 데이터베이스 사용 환경을 제공하는 소프트웨어
<br/>

#### SQL(구조적 질의어)
<br/>

+ 테이블 튜플을 식별할 수 있는 기본키 PRIMARY KEY
<br/>

+ 외래키 FREGIN KEY 다른 릴레이션과 연결하는 속성
<br/>

***

<br/>

### select문
<br/>

+ 특정 칼럼의 내용 검색을 하는 구문
<br/>

+ 구문 : SELECT 칼럼명 FROM 테이블명
```sql
SELECT DEPTNO, ENAME, MGR FROM EMP;
```
<br/>

+ select뒤 칼럼명에 산술 연산자를 사용 할 수 있다.
```sql
SELECT ENAME, SAL*12, COMM FROM EMP;
```
<br/>

#### 연산자
<br/>

+ 산술연산자 : +, -, *, /
```sql
select ename, sal*12, comm from emp;

ENAME          SAL*12       COMM
---------- ---------- ----------
SMITH            9600
ALLEN           19200        300
WARD            15000        500
JONES           35700
MARTIN          15000       1400
BLAKE           34200
CLARK           29400
SCOTT           36000
KING            60000
TURNER          18000          0
ADAMS           13200
```
<br/>

+ 관계연산자 : 
<br/>

+ 논리연산자
```sql
select empno, ename, sal from emp where job = 'clerk' and sal > 1000;
```
<br/>

+ 연결 연산자 : ||

  + 원하는 칼럼들을 서로 연결시키거나
  
  + 칼럼들을 산술 표현식 또는 상수 값과 연결하여 하나의 문자 형태로 표현한다.
  
```sql
select ename||job
from emp;

ENAME||JOB
-------------------
SMITHCLERK
ALLENSALESMAN
WARDSALESMAN
JONESMANAGER
MARTINSALESMAN
BLAKEMANAGER
CLARKMANAGER
SCOTTANALYST
KINGPRESIDENT
TURNERSALESMAN
ADAMSCLERK
```
```sql
select ename||job "사원별업무" from emp;

사원별업무
-------------------
SMITHCLERK
ALLENSALESMAN
WARDSALESMAN
JONESMANAGER
MARTINSALESMAN
BLAKEMANAGER
CLARKMANAGER
SCOTTANALYST
KINGPRESIDENT
TURNERSALESMAN
ADAMSCLERK
```
<br/>

#### ALIAS(별칭)
<br/>

+ 칼럼명을 변경하기 위해 별칭을 사용한다.
<br/>

+ 기본적으로 selcet 절에 소문자로 별칭을 준 경우에도, 결과로 나타나는 heading은 항상 대문자 이다.
<br/>

+ 별칭 사용 방법

  + 공백 사용

  + AS 키워드 사용

  + 이중 인용부호(" ") 사용 (별칭에 공백 또는 특수문자(#,_)와 한글을 포함하거나 대소문자구분이 필요한 경우 사용)
<br/>

```SQL
select ename, sal, sal*12 Annual_Salary
from emp;


ENAME                       SAL ANNUAL_SALARY
-------------------- ---------- -------------
SMITH                       800          9600
ALLEN                      1600         19200
WARD                       1250         15000
JONES                      2975         35700
MARTIN                     1250         15000
BLAKE                      2850         34200
CLARK                      2450         29400
KING                       5000         60000
TURNER                     1500         18000
JAMES                       950         11400
FORD                       3000         36000

ENAME                       SAL ANNUAL_SALARY
-------------------- ---------- -------------
MILLER                     1300         15600
```
<br/>


#### SQL 연산자
<br/>

+ between (
```sql
select ename from emp where hiredate between '1981/05/09' and '1981/12/17';
```

+ LIKE 연산자 (~와 같은)

  + 와일드 카드 문자 %          
```sql
select ename from emp where ename like 'M%';
```
ename 앞에 문자가 M인 ename 검색하라.
```sql
ENAME
----------
MARTIN
MILLER
```

  + 와일드카드 문자 _
```sql
select ename from emp where ename like '_L%';
```
ename의 처음 문자 뒤에 'L'이 있고, 뒤에는 0개 이상의 문자가 있는 ename을 검색하라.
```sql
ENAME
----------
ALLEN
BLAKE
CLARK
```

+ IS NULL 연산자
+ select ename, job, sal from emp where comm is null;
ENAME      JOB              SAL
---------- --------- ----------
SMITH      CLERK            800
JONES      MANAGER         2975
BLAKE      MANAGER         2850
CLARK      MANAGER         2450
SCOTT      ANALYST         3000
KING       PRESIDENT       5000
ADAMS      CLERK           1100
JAMES      CLERK            950
FORD       ANALYST         3000
MILLER     CLERK           1300

+ order by 구문

SQL> select ename, deptno, hiredate from emp order by hiredate desc;
ENAME          DEPTNO HIREDATE
---------- ---------- --------
ADAMS              20 87/05/23
SCOTT              20 87/04/19
MILLER             10 82/01/23
FORD               20 81/12/03
JAMES              30 81/12/03
KING               10 81/11/17
MARTIN             30 81/09/28
TURNER             30 81/09/08
CLARK              10 81/06/09
BLAKE              30 81/05/01
JONES              20 81/04/02

SQL> select ename, sal*12 from emp order by sal*12;

ENAME          SAL*12
---------- ----------
SMITH            9600
JAMES           11400
ADAMS           13200
WARD            15000
MARTIN          15000
MILLER          15600
TURNER          18000
ALLEN           19200
CLARK           29400
BLAKE           34200
JONES           35700

### 함수

#### 문자함수
+LOWER
select lower('ORACLE Example') from dual;
+dual 오라클에서 제공하는 dumy 테이블
+UPPER

+CONACT
select conact('Oracle', 'Example') from dual;

+LENGTH

+INSTR

#### 숫자함수

+ ROUND
+ select round(45.928, 2), round(45.928,0), round(45.928,-1) from dual;

ROUND(45.928,2) ROUND(45.928,0) ROUND(45.928,-1)
--------------- --------------- ----------------
          45.93              46               50
          
          
          |함수|기호|숫자|
          |:---|:---:|---:|
          


### 서브쿼리


#### JOIN

+ 조인은 두 개 이상의 테이블로부터 데이터를 검색하기 위해서 키  두개 이상의 테이블을 연결시키는 것을 말한다.

+ Equi Join
```sql
select empno, ename, sal, dname from emp, dept where emp.deptno = dept.deptno;

 EMPNO ENAME             SAL DNAME
---------- ---------- ---------- --------------
      7369 SMITH             800 RESEARCH
      7499 ALLEN            1600 SALES
      7521 WARD             1250 SALES
      7566 JONES            2975 RESEARCH
      7654 MARTIN           1250 SALES
      7698 BLAKE            2850 SALES
      7782 CLARK            2450 ACCOUNTING
      7788 SCOTT            3000 RESEARCH
      7839 KING             5000 ACCOUNTING
      7844 TURNER           1500 SALES
      7876 ADAMS            1100 RESEARCH
```

***
<br/>



<br/>

### DDL(Data Definition Language)

#### create TABLE (테이블 생성)

+ CREATE TABLE 테이블명 (칼럼명 datatype [ 칼럼명 datatype,....])
```sql
create table emp1
  2  (empno NUMBER(4),
  3  ename VARCHAR2(20),
  4  sal number(8,2),
  5  hiredate date);
```

#### 테이블 무결성 제약조건

+ 테이블에 유효하지 않은 부적절한 데이터가 입력되는 것을 방지하기 위해 테이블을 생성할떄 각 칼럼에 대해 정의하는 규칙.

|제약조건 유형||약어||설명|
|:---:||:---:||:---|
|NOT NULL||NN||칼럼이 NULL 값을 가질 수 없다|
|UNIQUE||UK||칼럼에 값이 중복될 수 없다|
|PRIMARY KEY||PK||테이블의 각 튜플을 유일하게 식별할 수 있는 속성으로, NULL과 중복된 값을 허용하지 않는다(NOT NULL + UNIQUE)|
|FOREIGN||FK||특정 테이블이 다른 테이블을 참조하는 칼럼|
|CHECK||CK||데이터 값의 범위 조건 명시|


#### 서브쿼리를 이용한 테이블 생성

```sql
create table emp3 as select * from emp;
```

#### DESC 명령어 테이블 구조 확인
```sql
desc emp3

이름                                      널?      유형
 ----------------------------------------- -------- ----------------------------
 EMPNO                                              NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)
```

#### ALTER TABLE (테이블 변경)

테이블 구조 변경
컬럼추가
컬럼 길이변경
제약조건의 추가와 삭제

#### ADD (새로운 컬럼 추가)

ALTER TABLE 테이블명
ADD 칼럼명 DATATYPE [DEFAULT 식] [CONSTRAINT 제약조건명 제약조건유형] ;

```SQL
alter table emp1
  2  add deptno number(2) constraint emp1_deptno_nn not null;

```

#### MODIFY (기존 컬럼 변경)

ALTER TABLE 테이블명
MODIFY 칼럼명 DATATYPE [DEFAULT 식] [CONSTRAINT 제약조건명 제약조건유형] ;

```SQL
alter table emp1
  2  modify job varchar2(10) constraint emp1_job_nn not null;
```

```sql
ALTER table emp4
  2  modify job varchar2(5) constraint emp4_job_nn not null;
modify job varchar2(5) constraint emp4_job_nn not null
       *
2행에 오류:
ORA-01441: 일부 값이 너무 커서 열 길이를 줄일 수 없음
```
기존의 데이터의 값이 변경하려는 값의 길이보다 커서 오류 발생

#### DROP TABLE (테이블 구조 삭제)

+ 테이블의 구조와 입력된 데이터를 모두 삭제
+ DROP TABLE 명령은 한 번 실행하면 되돌릴수 없다.

CREATE table EMP_HW 
(ENPNO number(4), 
ENAME varchar2(10), 
JOB varchar2(9), 
MGR NUMBER(4), 
HIREDATE DATE, 
SAL NUMBER(7,2), 
COMM NUMBER(7,2), 
DEPTNO NUMBER(2) );

ALTER TABLE EMP_HW MODIFY BIGO VARCHAR2(30);

ALTER TABLE EMP_HW RENAME COLUMN BIGO TO REMARK;
 
ALTER TABLE EMP_HW  ADD BIGO VARCHAR2(20);


#### DROP (기존 컬럼 삭제)

```sql
 ALTER TABLE emp4
  2  drop column sal;
```

### 뷰(VIEW)
</br>

+ 뷰의 필요성 : 하나의 테이블 혹은 여러 테이블에 대하여 특정 사용자나 조직의 관점에서 디에터를 바라볼 수 있도록 해주는 수단
</br>

+ 가상의 테이블
</br>

+ 뷰의 생성 이유
  
  + 보안성 : 테이블의 특정 열을 노출하고 싶지 않은 경우.

  + 편리성 : select문의 서브쿼리를 굳이 사용 안해도 된다.
</br>

+ 뷰 권한부여

```SQL
GRANT CREATE VIEW to scott;
```
</br>

#### VIEW의 생성 (CREATE VIEW)
</br>

+ 기존 테이블과 칼럼명이 같은 뷰 생성

```SQL
CREATE [OR REPLACE] VIEW 뷰명
AS 서브쿼리;
```
</br>

+ 기본 테이블과 칼럼명이 다른 뷰 생성

```sql
CREATE [OR REPLACE] VIEW 뷰명[(칼럼명,...)]
AS 서브쿼리
```

```SQL
  create view empview30
  2  as
  3  select empno, ename, job
  4  from empcopy
  5  where deptno =30;

  select * from empview30;

     EMPNO ENAME      JOB
---------- ---------- ---------
      7499 ALLEN      SALESMAN
      7521 WARD       SALESMAN
      7654 MARTIN     SALESMAN
      7698 BLAKE      MANAGER
      7844 TURNER     SALESMAN
      7900 JAMES      CLERK
 ```
</br>

***

</br>

### DML(Data Manipulation Language)
</br>

#### INSERT(데이터 추가)
</br>

+ 기본적인 데이터 추가

```sql
INSERT INTO 테이블명(칼럼명, 칼럼명....)
VALUES(값, 값, ...);
```
```SQL
INSERT INTO deptcopy(deptno, dname, loc) VALUES(11, 'Finance', 2);

select * 
from deptcopy;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON
        11 Finance        2
```
</br>

+ NULL 값을 포함한 데이터 추가

```SQL
INSERT INTO deptcopy
VALUES(13, 'Administration', NULL);

SELECT * FROM deptcopy;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON
        11 Finance        2
        13 Administration
 ```
</br>

#### UPDATE(데이터 변경)
</br>

+ 테이블의 모든 행 변경

```sql
 update empcopy
  2  set deptno = 40;
```
</br>

+ 테이블의 특정 행 변경

```sql
update empcopy
set deptno = 30, job ='SALESMAN'
where empno=7369;
```
</br>

+ 서브쿼리를 이용한 변경

```sql
UPDATE 테이블명
SET (칼럼명,칼럼명...) = 서브쿼리
[WHERE 조건;]
```
```sql
UPDATE deptcopy2
SET loc = (SELECT loc
           FROM deptcopy2
           WHERE deptno = 40)
WHERE deptno = 20;

SELECT * FROM deptcopy2;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       BOSTON
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON
        11 Finance        2
        13 Administration
```
</br>

#### DELETE(데이터 삭제)
</br>

+ 테이블의 모든 데이터 삭제

```SQL
DELETE FROM 테이블명
```
```SQL
DELETE FROM test;
```
</br>

+ 특정 데이터 삭제

```sql
DELETE FROM 테이블명
WHERE 조건;
```
```SQL
DELETE FROM empcopy
WHERE deptno = 10;
```
</br>

+ 서브쿼리를 이용한 데이터 삭제

```sql
DELETE FROM 테이블명
WHERE 서브쿼리;
```
```SQL
DELETE FROM empcopy
WHERE deptno = ( SELECT deptno
                 FROM deptcopy
                 WHERE dname = 'ACCOUNTING');
```
</br>

### 트랜잭션(TRANSACTION) 관리
