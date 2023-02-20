package abc;

public class A extends B {

	public static void main(String[] args) {
		B.test();
		
		//B objectB = new B(); // we cannot create an instant of class B in class A
		//objectB.xyz();       // because class B is instant 
		
		// now, we will extend A to B, so we can create object for class A, and call non static methods 
		 
		A objectA = new A();
		objectA.xyz();
		objectA.abc();
		objectA.sum(8, 5);
		
		
	}
	
	// now, we extended the class to B, and because B is Abstract class and has abstract method.
			// it is erorring out
			// so, the way to fix this we need to add unimplemented method here 
			// and implement it by adding the body {}
			//Unimplemented method is the abstract method, and this class is no abstract. 
			// so here it has to be non abstract 
	// the second way to fix the extends error is by switching A to abstract method, but
	//if we fix it that way, we will not be able to create object for class A anymore in line 13
	// because it will be came abstract class
	
	public  void abc() { // now we created it the error goes out in line 3
		// we overrided the abstract method and we implemented it.
		System.out.println("xs");
		// in the class after this, we created another class C which is inheriting from B as well, and we added another abstract method in B
		// just to make example more clear.
		// than after that we were able to print different values of these methods from B when we run A and C. and this is the use of Abstraction concept.
									// and, also, we were able to print whatever we want in those methods because I implemented them
	
		
	}

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}

}
