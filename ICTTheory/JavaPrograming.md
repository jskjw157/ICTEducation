

### 프로그래밍 언어
<br/>

+ 컴퓨터와 인간 사이를 연결할 수있는 매개체이며 컴퓨터에 작업을 시키기위한 도구
<br/>

+ 기계어인 저급언어부터 자연어에 가까운 고급언어까지 다양
<br/>

+ 보통 프로그래밍 언어라고 하면 고급 언어를 의미하는데 C,C++,JAVA등
<br/>

+ 고급 언어로 작성한 소스코드는 컴파일러(Compiler)라는 시스템 소프트웨어를 이용해 먼저 기계어로 구성된 실행 코드로 변환
<br/>

***

<br/>

### JDK
<br/>

#### JVM (java virtual machine)
<br/>

+ 개발한경에 맞게 플랫폼의 종속성없이 변환해주는 프로그램
<br/>

+ 자바 가상 머신은 통역관 역할(소스코드를 컴파일해서 서로다른환경에서도 실행 될 수 있다)
<br/>

+ WORA(write once run anywhere) 한번작성하면 어떤환경에서도 실행 될 수 있다.
<br/>

#### JDK (Java Development Kit)
<br/>

+ JDK = JRE[Java Runtime Environment(자바 API = 자바 클래스 라이브러리) + jVM)]
<br/>

+ 자바 API 

  + JDK에 포함된 클래스 라이브러리

  + 주요한기능들을 미리규현한 라이브러리
<br/>

***

<br/>

### 변수
<br/>

+ 기억 공간에 데이터를 보관하는 상자
<br/>

+ 각 기억 공간을 변수(Variable)로 구분
<br/>

```java
double x,y,z; //3개의 변수를 ,로 연결해 선언

int weight; //변수 선언

weight = 50; //변수 초기화

int weight = 50; // 위와 같은 내용 변수를 선언할떄 꼭 값을 대입할 필요는 없다. 선택사항
```

변수 선언 후 초기화를 하지 않으면 null값으로 입력되며, 연산은 불가능 하다.

<br/>

***

<br/>

### Scanner
<br/>

+ system.in
  
  + 키보드로부터 직접 읽는 자바의 표준 입력 스트림
  
  + 키값을 바이트값으로 리턴

+ scanner 클래스
  
  + system.in 에게 데이터를 읽게하고 읽은 바이트를 문자 정수실수 불린 문자열 등 다양한 타입으로 변환하여 리턴
<br/>

```java
import java.util.Scanner; //프로그램의 첫 행에 다음을 추가해 Scanner 클래스의 경로이름을 컴파이러에 알린다.

Scanner a= new Scanner(System.in); // Scanner 객체 생성. 키보드로 데이터를 입력 받기 위해 system.in 객체와 연결된 Scanner 객체를 생성한다.

int x = a.nextInt(); // Scanner 클래스가 제공하는 다양한 메서드를 이용해 키보드로 데이터를 입력 받는다.

a.close(); // 연결된 Scanner 객체 사용 종료
```
<br/>

#### Scanner 클래스의 주요 메서드
<br/>

+ String next() // 다음 토큰을 문자열로 리턴
<br/>

+ int nextInt() // 다음 토큰을 정수 타입으로 리턴
<br/>

+ float nextFloat() // 다음 토큰을 float 타입으로 리턴
<br/>

+ bollean nextBoolean()/ 다음 토큰을 bollean 타입으로 리턴
<br/>

+ void close() // Scanner의 사용 종료
<br/>

***

<br/>

### 비교연산과 논리연산
<br/>

```java
(age >= 20) && (age < 30) //나이(int age)가 20대인 경우
```
```java
(c >= 'A') && (c <= 'Z') // 문자(char c)가 대문자인 경우
```
```java
(age != b || age == c) // age는 b와 같지 않거나 c와 같다.
```
<br/>

***

<br/>

### 조건문
<br/>

+ 조건식이 true면 실행문장1 실행 후 if-else문을 벗어남
<br/>

+ false인 경우에 실행문장2 실행 후 if -else문을 벗어남
<br/>

```
if(조건식) {
  ....실행문장1...
 }
 else {
  ...실행문장2...
 }
```
<br/>

#### 다중 if-else 문
<br/>

+ if-else가 연속되는 모양
<br/>

+ 조건문이 너무 많은 경우, switch 문 사용 권장

```java
if (조건식1) {
  실행문장1 ; // 조건식 1이 참인 경우
}
else if (조건식2) {
  실행문장2 ; // 조건식 2이 참인 경우
}
else if (조건식m) {
  실행문장m ; // 조건식 m이 참인 경우
}
else {
   실행문장n ; // 앞에 모든 조건이 거짓인 경우
}
```
<br/>

#### Switch
<br/>

+ switch 문은 if문과 마찬가지로 조건문의 일종
<br/>

+ 여러 경로 중 하나를 선택할 때 사용
<br/>

+ if문처럼 순서대로 비교해 나갈 필요가 없다 (연산속도가 더 빠르다)
<br/>

+ default문은 생략 가능

```java
switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
			 	break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
```
<br/>

+ void 메소드일 경우 return 명령어 입력시 메소드가 종료된다. 

+ int 메소드일 경우 return 0 명령어 입력시 메소드가 종료된다.

### 반복문
<br/>

#### for 문
<br/>

```java
for(초기문; 조건식; 반복 후 작업) {
	...작업문...
}
```
+ for문의 특이한 형태
```java
for(초기문; true; 반복 후 작업') { //반복 조건이 true이면 무한반복
	...작업문...
}
```
```java
for(초기문; ; 반복 후 작업;) { //반복 조건이 비어 있으면 true로 간주, 무한반복
	...작업문...
}
```
<br/>

#### while 문
<br/>

```java
whlie(조건식){
	...작업문...
}

i = 0;
while(i<10){
	System.out.print(i);
	i++;
}
```
<br/>

### Array(배열)
<br/>

+ 배열선언
```java
int i [] = new int[10]; // O 10개의 정수 공간 배열 생성, 배열의 이름은 1
int i [10] = new int[10]; // X 선언문에는 값을 대입 할 수 없다.
```
<br/>

+ 배열의 반복문 활용
```java
for(sum = 0, i =0; i<10; i++)
	sum += n[i];
```
<br/>

+ 배열 초기화
```java
int array[] = {1,2,3,4}
char array[] = {a,b,c,d}
```
<br/>

+ 래퍼런스 치환과 배열 공유
```java
int intArray[] = new int[5];
int myArray[] = intArray; // 레퍼런스 치환, myArray는 intArray와 동일한 배열 참조
```
<br/>

+ 배열과 for-each문
```java
int [] n = {1,2,3,4,5}
int sum =0;
for( int k : n){
	sum += k;
}
system.out.println("합은"+sum+"입니다.")
```
<br/>

+ 2차원 배열
```java
int intArray [][] = new int[3][3];
intArray = { {0,1,2}, {3,4,5}, {6,7,8} };
```
<br/>

### 클래스와 객체
<br/>

#### 객체 지향언어
<br/>

+ 상속, 다형성, 객체, 캡슐화 등 소프트웨어 재사용을 위한 여러 장치 내장
<br/>

+ 소프트웨어 재사용과 부분 수정 빠름
<br/>

+ 소프트웨어를 다시 만드는 부담 대폭 줄임
<br/>

+ 소프트웨어 생산성 향상
<br/>

#### 실세계에 대한 쉬운 모델링
<br/>

+ 컴퓨터 초기 시대의 프로그래밍
	
	+ 수학 계산/통계 처리를 하는 등 처리 과정, 계산 절차 중요
<br/>

+ 현대의 프로그래밍

	+ 컴퓨터가 산업 전반에 활용
	
	+ 실세계에서 발생하는 일을 프로그래밍
	
	+ 실세계에서는 절차나 과정보다는 물체(객체)들의 상호 작용으로 묘사하는 것이 용이
<br/>

+ 객체지향언어 
	
	+ 실세계의 일을 보다 쉽게 프로그래밍하기 위한 객체 중심적 언어
<br/>

#### 절차지향 프로그래밍과 객체 지향 프로그래밍
<br/>

+ 절차지향프로그래밍

	+ 작업순서표현
	
	+ 작업을 함수로 작성한, 함수들의 집합
<br/>

+ 객체 지향 프로그래밍

	+ 객체들간의 상호 작용으로 표현
	
	+ 클래스 혹은 객체들의 집합으로 프로그램 작성
<br/>

#### 객체
<br/>

+ 실세계 객체의 특징

	+ 객체마다 고유한 특성와 행동을 가짐

	+ 다른 객체들과 정보를 주고받는 등, 상호작용하면서 존재
<br/>

+ 컴퓨터 프로그램에서 객체 사례

	+ 테트리스 게임의 각 블록들

	+ 한글프로그램의 메뉴나 버튼들
<br/>

+ 객체가 갖는 맴버

	+ 상태(속성) > 필드 > 멤버 변수
	
	+ 동작 > 메소드 > 맴버 함수
<br/>

#### 객체 지향의 3대 특징
<br/>

+ 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것

	+ 필드(속성) + 알고리즘(메소드)을 합친 캡슐

	+ 외부의 접근으로부터 객체 보호

	+ 정보은닉은 객체를 캡슐로 싸서 객체의 내부를 보호하는 것이다. 즉 객체의 실제 구현 내용을 외부에 감추는 것이다.

	+ 클래스 객체 모양을 선언한 틀(캡슐화) : 메소드(맴버 함수)와 필드(멤버 변수)는 모두 클래스 내에 구현

	+ 객체 : 클래스의 모양대로 생성된 실체(instance)

	+ 객체 내 데이터에 대한 보호, 외부 접근 제한 : 객체 외부에서는 비공개 맴버(필드, 메소드)에 직접 접근할 수 없음, 객체 외부에서는 공개된 메소드를 통해 비공개 맴버 접근
<br/>

+ 상속

+ 다형성

<br/>

#### 클래스 구성
<br/>

```java
public class circle { //접근권한, 클래스 선언, 클래스 이름
	public int radius;
	public String name;
	
	public Circle() { // 원의 생성자 메소드
	}
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
}
```
<br/>

#### 객체 생성 및 접근
<br/>

+ 객체 생성
	
	+ 반드시 new 키워드(new는 객체의 생성자 호출)를 이용하여 생성
<br/>

+ 객체 생성 과정
	
	+ 객체에 대한 레퍼런스 변수 선언
	
	+ 객체 생성
		
		+  클래스 타입 크기의 메모리 할당
		
		+  객체 내 생성자 코드 실행
<br/>

+ 객체의 맴버 접근
	
	+ 객체 레퍼런스.맴버 
```java
public static void main(String[] args) {
	Circle pizza;
	pizza = new Circle();
	
	pizza.radius = 10;
	pizza.name = "자바피자";
	
}
```
<br/>
