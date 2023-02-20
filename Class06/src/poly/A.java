package poly;

public class A {

	public static void main(String[] args) {
		
		test();
		test(5);// the concept of polymarphisim is here because we have 2 methods with same name
		test("b",5);         // under polymarphisim method overloading is happening 
	
	
	}		 

	
		
		
		public static void test () {
			
			System.out.println("test");
		}
		
		public static void test (int a) {
			System.out.println("hello");
		}
		
		public static void test (String a) {
			System.out.println("hello");
		}
		
		public static void test (String a, int b) {
			System.out.println("hello");
		}
	     
		public static void test (int b, String a) {
			System.out.println("hello");
		} 
		
}