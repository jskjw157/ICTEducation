import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 2021.07.09. 프로그래밍 -11- 2장 112p 연습문제 12번
		Scanner scanner = new Scanner(System.in);

		System.out.print("연산>> ");
		int op1 = scanner.nextInt(); // 피연산자1 입력 데이터
		String op = scanner.next(); // 연산자 입력 데이터
		int op2 = scanner.nextInt(); // 피연산자1 입력 데이터

		int res = 0;

		if (op.equals("+"))
			res = op1 + op2;
		else if (op.equals("-"))
			res = op1 - op2;
		else if (op.equals("*"))
			res = op1 * op2;
		else if (op.equals("/")) {
			if (op2 == 0) {              // 0으로 나눌때
				System.out.print("0으로 나눌 수 없습니다.");
				scanner.close();
				return; // 메인 함수 종료
			} else
				res = op1 / op2;
		} 
		
		else {
			System.out.print("사칙연산이 아닙니다.");
			scanner.close();
			return; // 메인 함수 종료
		}
		System.out.println(op1 + op + op2 + "의 계산 결과는 " + res);
		scanner.close();

	}

}
