package exercice;

import java.util.Scanner;

public class SumUp {    // given a number, start from 1 and add numbers up to 5. 1+2+3+4+5

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Enter a Number:");
		
		Scanner ui = new Scanner (System.in);
		int A = ui.nextInt();
		
		int result = 0; // here we need to create variable for that result we will get from add. (if it was string it will ="")
		for (int i = 0; i<= A; i++) {
			result = result+i; // r = r+i, it start by 0+1 than it will save it in result, then next r=1+2, then it will save r =3, then r
						// r=3+3 so on so on
		}
		
		System.out.println(result);
		
		
	}
	
	
	

}
