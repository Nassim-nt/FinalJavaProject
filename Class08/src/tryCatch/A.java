package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		System.out.println("give me number to divide 10");
		
		
		Scanner ui = new Scanner (System.in);
		
		
		try {
		int num = ui.nextInt();	
		System.out.println(10/num); 
		}
		catch (ArithmeticException e) {   // here we can use only one catch as well by using generic one
										  // by coding catch (Exception e), but this will not allow us to get the right exception	
			System.out.println("oh, dont give me exception, cause I can't divide by zero");
		}
		catch (InputMismatchException e) {
			System.out.println("plese give me integer value");
		}
		
		finally {     // this is like safety net, no matter what happens to the program, it will always execute.
		System.out.println("i am learning Java"); // in this class if we don't catch the exception, the program will still execute this line
		}
		
		
		System.out.println("it is hard but i am getting it slowly");
		
		
	}

	
	
			// Errors = Exceptions 
				// there are two types of exception:
	               // 1- checked exception / this we can see it during compaylation
	 			   // 2- unchecked exception / during execution 
}
