package practice;

public class RevInt {

	public static void main(String[] args) {
		
		
		int N = 1234;
		int result = 0;
		
		while (N !=0) {
			
			int remainder = N % 10;
			result = result*10 + remainder;
			N = N/10;
			
		}
		System.out.print(result);
	}

}
