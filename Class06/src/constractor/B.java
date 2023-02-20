package constractor;

public class B {
	
	
	public static void A1() {
		System.out.println("print me");
	}
	
	public static void A2() {
		System.out.println();
	}		
		
		public B() {            //this is a default constructor 
			this(5, "hi");
			System.out.println("this is a constructor1");
		}
		public B(int a) { 
			                 //parametheres constructor 
			System.out.println("this is a overload constructor2");
		}
		
		public B(int a, String b) { 
			  this(5);                            //parametheres constructor 
			System.out.println("this is a overload constructor3");
		}
		
		public B(String b, int a) {  
			this();                      //parametheres constructor 
			System.out.println("this is a overload constructor4");
		}


	//what is a constructor?
	//its like a special method: but it has 3 creterias:
	//1. same name as class name
	//2.no return type
	//3. non Static

}