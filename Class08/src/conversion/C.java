package conversion;

public class C {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		sum(a,b);
		
		a= 60;
		System.out.println(a);
		sum(a,b,55);

	}

	private static void sum(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public static void sum(int a, int b, int c) {
		
		c = a;
		c= b;
		System.out.println(c+a);
	}

}
