import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] Array = new int[5];
		int sum = 0;
		
		for(int i = 0; i < Array.length; i++) {
			Array[i] = scanner.nextInt();
			sum += Array[i];
		}
		scanner.close();
		
		int avg = sum/Array.length;
		System.out.println(avg);
		
	}

}
