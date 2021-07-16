
public class Ex07_01 {

	public static void main(String[] args) {
		int[] tenArray = new int[10];
				
		
		System.out.println(tenArray.length);
		
		int sum =0;
		for(int i= 0; i<10; i++) {
			tenArray[i] = i + 1;
			sum += tenArray[i];
		}
		System.out.println(sum);

	}

}
