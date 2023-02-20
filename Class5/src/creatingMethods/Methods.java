package creatingMethods;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
System.out.println("Enter Number A:");
Scanner ui = new Scanner (System.in);
int A = ui.nextInt();

System.out.println("Enter Number B:");
Scanner ui2 = new Scanner (System.in);
int B = ui2.nextInt();

System.out.println("Enter operation (ADD, SUB, MULTI or DIV):");
Scanner ui3 = new Scanner (System.in);
String op = ui3.nextLine();

MathMethods math = new MathMethods();

switch (op.toUpperCase()) {

case "ADD" : System.out.println(MathMethods.add(A, B));
break;

case "SUB" : System.out.println(MathMethods.sub(A, B));
break;

case "MULTI" : System.out.println(math.multi(A, B));
break;

case "DIV" : System.out.println(math.div(A, B));
break;

default : System.out.println("Wrong input!");

}


		
		
		
		
		}
		
}



	



	


