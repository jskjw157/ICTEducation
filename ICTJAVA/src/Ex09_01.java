import java.util.Scanner;

public class Ex09_01 {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		scanner.close();
		
		int result = 0;
		
		if(c.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
		}
		else if(c.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
		}
		else if(c.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
		}
		else if(c.equals("/")) {
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
		}
		
		System.out.println(result);
	}

}
