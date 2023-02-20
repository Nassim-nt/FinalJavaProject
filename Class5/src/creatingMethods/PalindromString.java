package creatingMethods;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter a String:");
		Scanner ui = new Scanner(System.in);
		String a = ui.nextLine();
		
		char[] A = a.toCharArray();  // convert the string to car [], so we can print it back word.
		
		String reverse = "";
		for (int i = A.length-1; i>=0; i--) {
			reverse = reverse + A[i];
		}
		System.out.println(reverse+" is the reverse of "+a);
		
		if (a.equals(reverse)){
			System.out.println(a+" is a palindrome");
		}
		else {
			System.out.println(a+ " is not a palindrome");
		}
				
		
		
		


		
	}

}
