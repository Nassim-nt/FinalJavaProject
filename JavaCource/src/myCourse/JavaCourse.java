package myCourse;

public class JavaCourse {
	
	//java starts running program from main method 
	//from which line in the main method
	//where program ends? my program end at the last line of main method
	public static void main(String[] args) {
	int r= add(150,20);
	
	System.out.println(r);
		
	}
	
	
	public static int add(int num1, int num2) {
		int result = 0;
				result = num1+ num2;
				return result;
		
	}
	
	
	
	// does this method has a parameters? No, because the parentheses are empty.
   public static void prnt() {
	   System.out.println("this is a text ");
		System.out.println("this a new text");
	   
	   
   }
   // does this method has parameters? yes, because the string is inside the parentheses.
   // we passed data to the method 
   public static void pr(String str) {
		System.out.println(str);
		prnt();
		
		
	}
	
	
   public static void abc() {
	   System.out.println(1);
	   System.out.println(2);
	   System.out.println(3);
   }
}