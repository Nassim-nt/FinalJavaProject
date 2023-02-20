package inheritance;

public class A extends B {   //A can inherit only from one class

	public static void main(String[] args) {
		
		                    ////.. I stopped in 1:20
		A1();
		A.A1();
		
		
		A.B1(); // before we extends A to B this line was erroring out 
		
		A a = new A();
		
		a.A2();
		a.B2(); // before we extends A to B this line was erroring out
		
		A.C1();
		a.C2();
		
		B.B1();  //inheritance >> NO, because we have method override if we want to call B1 from parent class 
					// we need to call it with B class name.
		
		
		// super  only non-static method, that's why i am gonna use it in line 36
		// this   only non-static method
		
	}
	
	public static void A1 () {
		System.out.println("static method A1");
		
	}

	public void A2 () {
		B1(); // this will call B1 in subclass 
		B.B1(); // if I do this, that means I am not using inheritance 
		super.B1(); // so pertty much the key word super is used to call B1 in superclass
		 			// if we need to call it, we have to call A2() in main method
					
		System.out.println("static method A2");
	}
	
	
	
	public static void B1() {
		
		System.out.println("static b1 from class 1 "); // this is method override in inheritance
														// it allows a subclass to provide a specific implementation 
														// of method that is already provided by one of its superclass
														// the purpose is  allows a class to inherit from a superclass whose behavior is 
														// "close enough" and then to modify behavior as needed
	}
}
