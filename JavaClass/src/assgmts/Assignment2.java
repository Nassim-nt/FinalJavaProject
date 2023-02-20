package assgmts;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner ui = new Scanner (System.in);
		Scanner ui2 = new Scanner (System.in);
		
		
		
        System.out.println("what is your name?");
              String name = ui.nextLine();
		
		
		System.out.println("How old are you?");
              int age = ui2.nextInt();
        
		
		System.out.println("what is your gender?");
             String gender = ui.nextLine();
		
		
		System.out.println("Where are you from?");
              String location = ui.nextLine();
              
              
        System.out.println("Where do you live now?");
              String location2 = ui.nextLine();
		
              
		System.out.println("Where do you work?");
             String company = ui.nextLine();
             
             
        System.out.println("what is your role?");
		      String role = ui.nextLine();
		
             
         System.out.println("What is your salary?");
				double salary = ui2.nextDouble();

				
		 System.out.println("How much raise you are getting next year?");
				double raise = ui2.nextDouble();
				double totalsalary = salary + raise;
             
				System.out.println("My name is " + name + ". I am " + age + " years old, " + gender + ". I work at " + company + " as " + role + ". I currently live in " + location2 + ". I am originally from "+ location + ". I make " + salary + " dollar. I will get " + raise + " as annual raise so my total salary would be " + totalsalary + " dollar next year.");   
             
          

		

	}

}
