import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 2021.07.09. ���α׷��� -11- 2�� 112p �������� 12��
		Scanner scanner = new Scanner(System.in);

		System.out.print("����>> ");
		int op1 = scanner.nextInt(); // �ǿ�����1 �Է� ������
		String op = scanner.next(); // ������ �Է� ������
		int op2 = scanner.nextInt(); // �ǿ�����1 �Է� ������

		int res = 0;

		if (op.equals("+"))
			res = op1 + op2;
		else if (op.equals("-"))
			res = op1 - op2;
		else if (op.equals("*"))
			res = op1 * op2;
		else if (op.equals("/")) {
			if (op2 == 0) {              // 0���� ������
				System.out.print("0���� ���� �� �����ϴ�.");
				scanner.close();
				return; // ���� �Լ� ����
			} else
				res = op1 / op2;
		} 
		
		else {
			System.out.print("��Ģ������ �ƴմϴ�.");
			scanner.close();
			return; // ���� �Լ� ����
		}
		System.out.println(op1 + op + op2 + "�� ��� ����� " + res);
		scanner.close();

	}

}
