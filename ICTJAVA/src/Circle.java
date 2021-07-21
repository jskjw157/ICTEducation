
public class Circle {
	
	int radius;
	String  name;
	
	public Circle() {
		this(0,"");
	}
	
	public Circle(int radius) {
		this(radius,"");
	}
	
	public Circle(int radius, String name) { 
		this.radius = radius; 
		this.name = name;
	}
	
	public double getArea(){
		return 3.14*radius*radius;
	}
	
	public void show() {
		double result = getArea();
		System.out.println(result);

	}
	
	public static void main(String[] args) {
		Circle javaone = new Circle(20,"자바원");
		javaone.show();
		Circle javaPiza = new Circle(30,"자바피자");
		javaPiza.show();
		Circle non = new Circle(40);
		non.show();
	}
}
