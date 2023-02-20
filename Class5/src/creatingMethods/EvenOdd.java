package creatingMethods;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
			
		System.out.println("Eneter number A:");
		Scanner ui = new Scanner (System.in);
		int A = ui.nextInt();
		
		if ( A % 2 == 0) {
			System.out.println(A +" is EVEN");
		}
		else if (A % 2 != 0) {System.out.println(A + " is ODD");
		
		}

	}

}
