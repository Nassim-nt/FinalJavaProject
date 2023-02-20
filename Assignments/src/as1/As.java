package as1;

import java.util.Scanner;

public class As {
	public static void main(String[] args) {
	
	
	
	
	
	Scanner ui = new Scanner (System.in);
	
	
    System.out.println("what is your name?");
          String name = ui.nextLine();
	
	
	System.out.println("How old are you?");
          int age = ui.nextInt();
	
	
	System.out.println("What is your gender?");
          String gender= ui.nextLine();
	
	
	System.out.println("Where are you from?");
          String location = ui.nextLine();
          
    System.out.println("Where do you live now?");
          String location2 = ui.nextLine();
	
	System.out.println("Where do you work?");
          String companyname = ui.nextLine();



	System.out.println("What is your job role?");
          String role = ui.nextLine();

	System.out.println("What is your salary?");
	double salary = ui.nextDouble();

	System.out.println("How much raise you are getting next year?");
	double raise = ui.nextDouble();
	double totalsalary = salary + raise;

	
	
	System.out.println("My name is "+ name +". I am "+ age +" years old, "+ gender +". I work at "+ companyname+" as "+ role + ". I currently live in "+ location2 + ". I am originally from "+ location +". I make " + salary + " dollar. I will get " + raise + " as annual raise so my total salary would be "+ totalsalary + " dollar next year.");

	}

}
