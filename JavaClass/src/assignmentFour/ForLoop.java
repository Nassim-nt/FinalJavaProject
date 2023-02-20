package assignmentFour;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		
		Scanner ui1 = new Scanner (System.in);
		Scanner ui2 = new Scanner (System.in);
		Scanner ui3 = new Scanner (System.in);
		
		System.out.println("Enter N1:");
int N1 = ui1.nextInt();
		
		for (int i=0;i<=N1 ;i=i+4) {
			if (i==0) {
				System.out.print(1);
				continue;
			}
			System.out.print(", "+i);
		}
		
		System.out.println();
		
		System.out.println("Enter N2:");
int N2 = ui2.nextInt();
		
		for (int x=N2; x>=0 ; x=x-1) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		System.out.println("Enter a String :");
String A = ui3.next();
char[]A2 = A.toCharArray();
		
		for (char e : A2) {
			
			System.out.print(e+" ");
		}
		
		
		
		
		}

			
	}
		
		
		
		
				
		
	
	

	
	
	
	
	
	
	
	
	
	

		
	
	
		
	
	
	
		
		
			
			
			
			
	
				
		
			
		
		
		
		

		
		
	
	

		
	
				
		
		
		
		
		
	


