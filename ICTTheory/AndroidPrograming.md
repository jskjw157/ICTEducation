# Android

### 스마트폰의 개요

+ 스마트폰 

  + 통화기능 + 컴퓨터 + 다양한 기능 내장(MP3, 카메라 DMB, GPS등).
<br/>

+ 스마트폰의 역사

  + 1992년 IBM사의 사이먼
  
  + 1996년 노키아 9000
  
  + 2002년 마이크로소프트 포켓PC
  
  + 2007년 아이폰
  
  + 2008년 안드로이드 폰
  
  + 2010년 윈도폰7
  <br/>

+ 스마트폰의 운영체제

  + 2020년 2분기 기준 세계시장 점유율 : 안드로이드 74%, 아이폰 25%, 윈도폰 0.01%
  <br/>
  
### 안드로이드의 개요
<br/>

+ 개발언어 : Java, Kotlin(코드가 짧음, 자바와호환, null포인터(Java보다 더 안정적 이다) )
<br/>

+ 개발 운영체제 : Window, Linux, Mac OS
<br/>

+ 개발 툴 : Eclipse, Android Studio
<br/>

+ 지원 장치 : 안드로이드폰, 안드로이드 태블릿, 안드로이드 스마트워치, 안드로이드 TV
<br/>

+ 대표 제품 : 삼성 갤럭시 S/노트 시리즈
<br/>

#### 안드로이드의 주요 기능
<br/>

+ 어플리케이션 프레임워크를 통해서 제공하는 API를 사용함으로써 코드를 재사용하여 효율적으로 빠른 어플리케이션개발 가능함
<br/>

+ 모바일 기기에 최적화된 달빅(Dalvik) 또는 아트런타임(ART)를 제공함
<br/>

+ 2d그래픽 및 삼차원 그래픽을 최적화하여 표현함
<br/>

+ 모바일용 데이트베이스인 SQLite를 제공함
<br/>

+ 각종오디오 비디오 및이미지 형식을 제공함
<br/>

+ 모바일 기기에 내장된 각종 하드웨어(블루투스, 카메라, 나침반, 와이파이 등)을 잘 지원한다.
<br/>

#### 안드로이드의 특징
<br/>

+ 안드로이드의 핵심 커널은 Linux로 구성되어 있다.
<br/>

+ 안드로이드 어플리케이션 개발 언어로 Java를 주로 사용한다.(최근 Kotlin 언어로 개발이 늘어나고 있다. Gogle에서 개발하는 것을 적극적으로 권장하고 있다.)
<br/>

+ 안드로이드 SDK에 많은 라이브러리를 포함하고 있어서 쉽게 개발할 수 있다. 특히 SQLite, OpenGL 등도 지원해서 별도로 설치할 필요가 없다.
<br/>

+ 오픈소스이다.
<br/>

### 안드로이드의 개발 환경
<br/>

+ Windows Linux mac 환경에서 개발 가능
<br/>

+ windows 개발 환경이 가장 보편적
<br/>

+ 안드로이드 개발환경을 구축하면 가상의 안드로이드 장치의 AVD(Android Virtual Device)제공
<br/>

+ 실제 안드로이드 장비 없이도 안드로이드 장비가 있는 것처럼 작업 가능
<br/>

+ Android Studio 4.1버전은 windows 운영체제의 64bit만 설치할 수있으며 32bit windows는 지원하지 않음
<br/>

#### 안드로이드의 개발 환경 구성
<br/>

1. JDK가 android studio 2.2부터는 OPEN JDK가 내장되어 잇음
<br/>

2. 안드로이드 SDK(응용프로그램 개발 API)가 별도의 폴더에 추가로 다운받아야 한다.
<br/>

3. android studio와 SDK를 연결하기 위하 플러그인 ADT(Android Development Tools)가 내부적으로 필요하다.
<br/>

4. 안드로이드 SKD가 설정된 경로가 지정되어 있어야 한다.
<br/>

5. 가상의 안드로이드 장치의 AVD(Android Virtual Device)를 별도로 다운받는다.
<br/>

#### 인텔 HAXM
<br/>

+ AVD는 가상의 스마트폰을 추가로 부팅하는 방식이기 떄문에 매우 느리며, 부팅 후에도 반응 속도가 느릴 수 밖에 없다. 이를 극복하기 위해 인텔의 CPU를 사용하면 하드웨어 가속 실행 관리자(Hardware Accelerated eXecution Manager, HAXM)을 사용할 수 있다.
<br/>

#### AVD(Android Virtual Device)
<br/>

+ 안드로이드폰의 기능을 90% 정도 사용할 수 있지만 실제 안드로이드폰보다 느리다는 것을 감수해야 한다.
<br/>

### android studio
<br/>

#### java file
<br/>

+ AppCompatActivity class : 안드로이드 기본 화면을 구현하는데 사용되는 클래스
<br/>

+ setContentView() : xml 파일을 연결해주는 함수
<br/>

+ findViewById() : id 해당되는 뷰를 찾는 함수
<br/>

***

<br/>

### 뷰와 뷰그룹
<br/>

#### view 클래스
<br/>

+ 안드로이드 화면에서 실제로 사용되는 것들은 모두 view클래스 상속을 받음
<br/>

+ 다른말로 위젯이라고도함
<br/>

+ 다른위젯을 담을수있는위젯은 레이아웃이라고함
<br/>

+ 레이아웃은 ViewGroup 클래스 아래존재
<br/>

+ 레이아웃도 크게 보면 위젯도 포함됨
<br/>

#### id 속성
<br/>

+ id속성은 모든위젯의 아이디를 나타냄
<br/>

+ java코드에서 위젯에 접근할떄 id속성에 저장한 아이디 사용
<br/>

+ 위젯에 아이디를 새로 부여하는 개념이므로 "@+id"

```xml
<LinearLayout
  ~~~~중간생략~~~~~
    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="안녕하세요!"
         />
</LinearLayout>
  ```
```java
Button button1;
button1 = (Button) findViewById(R.id.btn1);
```
<br/>

#### layout_width, layout_height속성
<br/>

+ match_parent :자신의 부모(대개는 레이아웃)에 폭이나 높이를 맞춤
<br/>

+ wrap_content : 자신의 폭이나 높이를 자신안의 글자가 들어갈 정도로만 설정

```xml
<LinearLayout
  ~~~~중간생략~~~~~
    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="안녕하세요!"
         />
</LinearLayout>
  ```
<br/>

#### background속성
<br/>

+ 속성은 위젯의 색상을 주로 #RRGGBB 값으로 지정
<br/>

+ 각 값은 빨간색 , 초록색, 파란색을 의미함
<br/>

#### view클래스의 xml속성

+ padding 속성 : 레이아웃 안의 요소들이 경계선에서 떨어져서 출력되는 요소

```xml
<LinearLayout
              android:padding = '30dp'>
    <TextView
              android:hint='여기에 채우세요' />
    <Button
            android:text='확인 />
</LinearLayout>
```

+ layout_margin 속성 : 위젯과 위젯 사이에 여유를 두고 싶다면 layout_margin

```xml
<LinearLayout
              android:padding = '30dp'>
    <TextView
              android:layout_margin='20dp'
              android:hint='여기에 채우세요' />
    <Button
            android:layout_margin='20dp'
            android:text='확인 />
</LinearLayout>
```
+ visibillity속성

속성은 위젯을 보일것인지 여부를 설정
세가지 값을 지정할 수 있다
visible 보이는 상태
invisible 보이지 않을 뿐 원래의 자리를 계속 유지
gone 보이지 않고 그 자리까지 아예내놓는다.
```xml
<button
        android:text = "버튼 1"/>
<button
        android:visibility = "invisible"
        android:text = "버튼 2"/>
<button
        android:visibility= "visible"
        android:text = "버튼 3"/>
<button
        android:visibility= "gone"
        android:text = "버튼 4"/>

```
+ enabled, clickable 속성

enabled : 위젯의 동작 여부
clickable : 클릭이나 터치가 가능하도록 함
true와 false로 지정(디폴트:true)
xml보다 java 코드에서 주로 사용함
```xml
<button
        android:text = "버튼 1"/>
<button
        android:enabled= "false"
        android:text = "버튼 2"/>
<button
        android:clickable= "false"
        android:text = "버튼 3"/>
```

+ rotaion 속성
rotaion은 위젯을 회전시켜서 출력
값은 각도로 지정

### 위젯 다루기

#### 텍스트뷰
```java
java.lang.Object
  android.view.view
    android.widget.TextView
 ```
 text:텍스트뷰에 나타나는 문자열 표현
 textColor:글자의 색상을지정, #RRGBB나 #aarrggbb형식
 textSize:글자의 크기를 지정
 textStyle: 글자의 스타일을 지정
 typeface : 글자의 글꼴을 지정
 singleLine : 글이 길어 줄이 넘어갈 경우 강제로 한 줄까지만 출력하고 문자열의 맨 뒤에 "..."을 표시
 
 #### 버튼을 클릭했을 때 동작한는 Java 코드 3단계
 
 버튼 변수 선언
 Button mybutton;
 변수에 버튼 위젯 대입
 mybutton = (Button)findViewById(R.id.button1);
 버튼을 클릭할때 동작하는 클래스 정의
 mybutton.setOnClickListener(new View.onClickListener() {
      public void onClick(View v){
      //동작 내용을 이 부분에 코딩
      }
)};

#### 에디트텍스트의 값을 가져오는 java코드 3단계
에디트텍스트 변수선언
EditText myEdit;
변수에 에디트텍스트 위젯 대입
myEdit = (EditText) findViewById(R.id.edittext1);
에디트텍스트에 입력된 값 가져오기 주로버튼 클릭 이벤트 리스너 안에 삽입
String byStr = byEdit.getText().toString();
