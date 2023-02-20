package loopConcept;

import java.util.Scanner;

public class ForLoop7 {

	public static void main(String[] args) {
		
		
		
		Scanner ui = new Scanner (System.in);
		
	
		System.out.println("Give me N value (less than 100)");
		int N = ui.nextInt();
		
		
		if (N>=100) {
			
			System.out.println("Wrong input");
		}
		else for (int i=100; i>=N; i = i-5) {
			System.out.println(i);
			System.out.println("hi");
			System.out.println("bye");

		}

	}

}
