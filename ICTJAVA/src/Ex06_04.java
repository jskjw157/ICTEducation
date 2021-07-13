
public class Ex06_04 {

	public static void main(String[] args) {
		int i = 0 ,sum = 0;
		
		while(i <= 100) {
			i ++;
			if(i % 3 != 0)
				continue;
			else
				sum += i;
		}
		System.out.println(sum);
	}

}
