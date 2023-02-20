package inheritance;

public class B extends C{  // if we use final key word before public it will stop it from being inheriting 

      

	public static void B1 () {
		System.out.println("static method B1");
	}

	public void B2 () {
		System.out.println("static method B2");
	}
	
	private static void B3 () {   // we want to stop a particular method from being inheritance 
						  // public is access modifire we have to change it to private wich is not inheritable
		System.out.println("static method B3");
	}
	
	
	// how canwe make sure that method is inheritable but not overridable 
	
	final public static void B4 () {  // final key word stop the method from overriding 
		
		System.out.println("static method B4");
		
		
		// final key word ; stop variable from being change, 
			// stop method from being able to override
		    // stop class from being able to inherit 
	}
	
	}