package splitString;

public class A {

	public static void main(String[] args) {
		
		
		C objc = new B(); // we are taking parent class and making object out of B. we cannot reverse the formula.
		
		
		
		objc.C2();  // this one will execute the child one because it is not static
		objc.C1();  // this one will execute the parent one because it is static 
		            // (that's what they mean a static method cannot be overriding) it is one it come to mix of polymorphism and inheretance
	} 

}
