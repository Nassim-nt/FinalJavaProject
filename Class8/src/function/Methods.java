package function;

public class Methods {

	public static void main(String[] args) {
		Methods.test();
        Methods.add(25, "James Bond");
       System.out.println(Multiple(6,3)); 
	}

	
	
public static void test () {
	
	System.out.println("test somthing");
	
	}

public static void add (int age, String name) {
	
	System.out.println("hello"+ name);
	System.out.println("hello"+ age+ "years old");

}


public static int Multiple(int first, int second) {
	if (second != 0)
		return first/second;
	return first/second;
	

	

}

}
