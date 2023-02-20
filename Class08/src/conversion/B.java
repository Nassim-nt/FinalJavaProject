package conversion;

public class B {

	public static void main(String[] args) {
		
		
		Integer [] a = {62,656,23,49,69,349,36};
		printIntArray(a);
							//int x,y; // declared two variable by default they are =0, because I didn t initial them
							//int b=0, k=5; // i initiated them 
		String[] b = {"james", "Tom", "Jane"};
		printIntArray(b);
		
		Boolean [] c = {true, true, false,false};
		printIntArray(c);
	}

	
	// i want to create a method to print a/ i need to create method out of this method

	/*public static void printIntArray(int[]x) {
		
		for (int item: x) {
			System.out.println(item);
		}
	}
	
	
	public static void printIntArray(String[]x) { // overload method
		
		for (String item: x) {
			System.out.println(item);
		}
	}
	
	public static void printIntArray(boolean[]x) { //overload method
		
		for (boolean item: x) {
			System.out.println(item);
		}
	}*/
	
	//instead of overloading we can create a generic method 
	// but when we use <> the data type has to be String, so we need to go back
	// to line 8 and change int with Integer
	
	//and this is generic Methods
	public static <Z> void printIntArray (Z[]x) {
		for (Z item : x) {
			System.out.println(item);
		}
	}
}
