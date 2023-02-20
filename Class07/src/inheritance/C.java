package inheritance;

import inheritanceTwo.D; // we had to import the package because D is in the different package 

public class C extends D{
	
	
	public static void C1 () {
		C1();
		System.out.println("static method C1");
	}

	public void C2 () {
		System.out.println("static method C2");
	}

}
