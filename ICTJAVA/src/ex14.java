public class ex14 {

	public static void main(String[] args) {
		// 2021.07.09. 프로그래밍 -14- 161p 이론문제 1번
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

}
