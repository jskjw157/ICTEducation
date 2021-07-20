import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}

}
