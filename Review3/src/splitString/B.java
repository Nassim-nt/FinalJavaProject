package splitString;

public class B extends C {

	
	public static void B1() {
		System.out.println("Static B1");
	}
	
	public void B2() {
		System.out.println("Static B2");
	}
	
	
	public static void C1() {
		System.out.println("Static C1 childB");  //here i am overriding this Static Method.
	}
	
	public void C2() {
		System.out.println("Static C2  childB");
	}
	
}
