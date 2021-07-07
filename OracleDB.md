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

+ 구문 : SELECT 컬럼명 FROM 테이블명
```sql
SELECT DEPTNO, ENAME, MGR FROM EMP;
```
<br/>

+ select뒤 컬럼명에 산술 연산자를 사용 할 수 있다.
```sql
SELECT ENAME, SAL*12, COMM FROM EMP;
```
<br/>

***

<br/>

#### 연산자
<br/>

+ 산술연산자 : 
<br/>

+ 관계연산자
<br/>

+ 논리연산자
```sql
select empno, ename, sal from emp where job = 'clerk' and sal > 1000;
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
          
