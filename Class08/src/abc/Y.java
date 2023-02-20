package abc;

public interface Y extends Z{
	
	public static void abc() { // Y is interface, it will contain only abstract methods, but it allows static method.
		System.out.println("this is class Y");
	}
	
	
	public void Zero (); 
	public void one (); // when I implemented this method, I mean when I put {}, it was erroring out and saying:
						 // 1- remove method body it 2- change it to static 3 change it to default
	public default void jkl() {
		System.out.println("jkl");
	}	


}
