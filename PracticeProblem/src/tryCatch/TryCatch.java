package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		
		System.out.println("give me a number to divide 10");
		
		Scanner ui = new Scanner (System.in);
		
		try {
		int num = ui.nextInt();
		System.out.println(10/num);
		}
		catch(InputMismatchException e){
			System.out.println("why are you giving me string!");
		}
		catch(ArithmeticException e) {
			System.out.println("oh don t give me 0, bc i cannt divide by zero");
		}
		
		// also, we can use just one catch by using standrd word catch (Exception e)
		System.out.println("i am learning Java");
		
		System.out.println("it is hard but i am getting it");
		

	}

}
