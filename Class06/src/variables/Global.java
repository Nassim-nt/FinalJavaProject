package variables;

public class Global {
	
	
	int a =55; //global (inside the class/outside of the method)

	public static void main(String[] args) {
		// non static variable will be called by no static method if they are in the same class.
		//if they are in different class we need to create an object
		//also, to call no static variable in a static method , we need to creat object
		//in each method we need to create an object.
		
		 // local (inside the method)
		Global gl = new Global ();
		int a = 99;            // the system always execute the local one.
		System.out.println(gl.a); // we use className.variable name to execute the global one.
								  // if it is not static variable and create object like in this case.
		
	}

	public static void test () {
		Global gl = new Global ();
		System.out.println(gl.a);
	}
	
	public void hello() {
		System.out.println(a);
	}
}
