package textFile;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner ui = new Scanner(System.in);
		System.out.println("give me a number");
		int n = ui.nextInt();
		if (n<5) {
			throw new ArithmeticException();   // he the programmer wants to throw an error. wants to stop a program in purpose 
		}

	}

}
