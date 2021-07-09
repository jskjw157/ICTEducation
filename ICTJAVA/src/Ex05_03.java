
public class Ex05_03 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while (i < 10) {
			i++;
			sum += i;
			System.out.print(i + " ");
			if(i <= 9) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum);
			}
			
			
		}

	}

}
