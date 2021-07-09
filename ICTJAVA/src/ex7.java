import java.util.Scanner;

public class ex7 {
	
	public static void main(String[] args) {
		// 2021.07.07. 프로그래밍 -7- 실습
		
		double w;
		double h;
		double area;
		double perimeter;
	 	
 	    Scanner input = new Scanner(System.in);
 	    System.out.print("사각형의 가로를 입력하시오: ");
	    w = input.nextDouble();     // "w"의 타입이 "double"이기에 "nextDouble()" 메소드 사용
	    System.out.print("사각형의 세로를 입력하시오: ");
	    h = input.nextDouble();
        area = w * h;
        perimeter = 2.0 * (w + h);
        
        System.out.println("사각형의 넓이는 " + area);  	
        System.out.println("사각형의 둘레는 " + perimeter);  	
	
        input.close();
        
	}

}
