package forLoop;

import java.util.Scanner;

public class ForLoopAssignment {

	public static void main(String[] args) {
		
		
	
		
		System.out.println("Enter N value :");
		Scanner ui= new Scanner(System.in);
		int N=ui.nextInt();
		
		
		for (int i=0; i<=N ; i=i+4) {
			
			if (i==0) {
				System.out.print(i+1);
				continue;
				
			}
			
			System.out.print(", "+i);
			
			}
		
		System.out.println();
		System.out.println("Enter N value");
		
		Scanner ui2 = new Scanner(System.in);
		int N2 = ui2.nextInt();
		
	
			
		for (int i=N2; i>= 0; i=i-1) {
			
			
			if (i==0) {
				
				System.out.print(i);
				
			}
			else {
				System.out.print(i + ", ");
				}
			}

		System.out.println();
		
		
		System.out.println("Enter a String");
		
		Scanner ui3= new Scanner (System.in);
		String a = ui3.nextLine();
		
		
		
		}
		
		
		
		}
		
		

	


