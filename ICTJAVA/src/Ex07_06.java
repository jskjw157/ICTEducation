import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		int intArray[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� 10���� �Է��ϼ���>>");
		for(int i =0; i<intArray.length; i++)
			intArray[i]=scanner.nextInt();
		
		System.out.println("3�� �����");
		for(int i =0; i<intArray.length; i++)
			if(intArray[i] % 3 == 0)
				System.out.println(intArray[i] + " ");
		
		scanner.close();
	}

}
