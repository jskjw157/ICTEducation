import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// 2021.07.09. ���α׷��� -10- if-else�� �����ű��
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>> ");
		int op1 = scanner.nextInt(); // �ǿ�����1 �Է� ������
		String op = scanner.next(); // ������ �Է� ������
		int op2 = scanner.nextInt(); // �ǿ�����1 �Է� ������

		int res = 0;

		switch (op) {
		case "+":
			res = op1 + op2;
			break;
		case "-":
			res = op1 - op2;
			break;
		case "*":
			res = op1 * op2;
			break;
		case "/":
			if (op2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}

			res = op1 / op2;
			break;

		default:
			System.out.print("��Ģ������ �ƴմϴ�.");
			scanner.close();
			return; // ���� �Լ� ����
		}

		System.out.println(op1 + op + op2 + "�� ��� ����� " + res);
		scanner.close();

	}

}
