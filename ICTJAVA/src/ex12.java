import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// 2021.07.09. 프로그래밍 -10- if-else문 학점매기기
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>> ");
		int op1 = scanner.nextInt(); // 피연산자1 입력 데이터
		String op = scanner.next(); // 연산자 입력 데이터
		int op2 = scanner.nextInt(); // 피연산자1 입력 데이터

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
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}

			res = op1 / op2;
			break;

		default:
			System.out.print("사칙연산이 아닙니다.");
			scanner.close();
			return; // 메인 함수 종료
		}

		System.out.println(op1 + op + op2 + "의 계산 결과는 " + res);
		scanner.close();

	}

}
