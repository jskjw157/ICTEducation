import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		int intArray[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("양의 정수 10개를 입력하세요>>");
		for(int i =0; i<intArray.length; i++)
			intArray[i]=scanner.nextInt();
		
		System.out.println("3의 배수는");
		for(int i =0; i<intArray.length; i++)
			if(intArray[i] % 3 == 0)
				System.out.println(intArray[i] + " ");
		
		scanner.close();
	}

}
