
public class Ex08_03 {

	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);
		
		Circle donut = new Circle();
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������" + +area);

	}

}
