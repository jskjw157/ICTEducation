import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��� 5���� �Է����ּ���.");
		
		int[] array = new int[5];
		for(int i =0;i<5;i++) {
			int number = scan.nextInt();
			array[i] = number;
		}
		scan.close();
		
		int max = 0;
		for(int i =0;i<5;i++) {
			if(max < array[i])
				max = array[i];
		}
		System.out.println(max);
	}

}
