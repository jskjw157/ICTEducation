import java.util.Scanner;

public class ex8 {
	
	public static void main(String[] args) {
		// 2021.07.07. ���α׷��� -8- �ǽ�
		
 	    Scanner in = new Scanner(System.in);
 	    System.out.print("���� �Է��Ͻÿ�: ");
	    int number = in.nextInt();
	    
	    if (number % 2 == 0) {

	    System.out.println("¦��!");
	    }
	    else {
	    System.out.println("Ȧ��!");
	    }
	    System.out.println("����");
        in.close();
        
	}

}
