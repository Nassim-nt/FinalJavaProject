package homeWork;

public class ClassTwo {
	
		
		 public ClassTwo() {
			this(10);
			System.out.println("this is default constructor");
		}
		
		public ClassTwo(int a) {
			System.out.println("this is parameterazed constructor1");
		}
		
		public ClassTwo(String b) {
			this(10, "b");
			System.out.println("this is parameterized constructor2");
		}
		
		public ClassTwo(int a, String b) {
			this();
			System.out.println("this is parameterized constructor3");
		}
		
		public ClassTwo(String b, int a) {
			this("b");
			System.out.println("this is parameterized constructor4");
		}
		
		

}



