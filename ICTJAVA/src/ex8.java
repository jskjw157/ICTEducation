import java.util.Scanner;

public class ex8 {
	
	public static void main(String[] args) {
		// 2021.07.07. 프로그래밍 -8- 실습
		
 	    Scanner in = new Scanner(System.in);
 	    System.out.print("수를 입력하시오: ");
	    int number = in.nextInt();
	    
	    if (number % 2 == 0) {

	    System.out.println("짝수!");
	    }
	    else {
	    System.out.println("홀수!");
	    }
	    System.out.println("종료");
        in.close();
        
	}

}
