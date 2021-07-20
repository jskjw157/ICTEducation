
public class Circle {
	
	int radius;
	String  name;
	
	public Circle() {
		this(1,"");
	}
	
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; name = n; // 매개 변수로 필드 초기화
	}

	public double getArea() {
		return 3.14*radius*radius;

	}
}
