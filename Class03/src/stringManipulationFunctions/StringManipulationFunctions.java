package stringManipulationFunctions;

import java.util.Scanner;

public class StringManipulationFunctions {

	public static void main(String[] args) {
		
//		String toUpperCase () -- returns the string in upper case letter.
//		String length () -----length of the string 
//		String replace () ----returns a string replacing old char to a new char 
//		String charAt () -----returns a char value at the given index number 
//		String concat () ----combines specified string at the end of this string
		
		
       Scanner user = new Scanner (System.in);
       System.out.println("Plese enter a String :");
       String user1 = user.nextLine();
       
       String user2 = user1.toUpperCase();
       System.out.println(user2);
       
       System.out.println(user2.length()); 
       
       String user3 = user2.replace("O", "Z");
       System.out.println(user3);
       
       System.out.println(user3.charAt(user3.length()-1));
       
       System.out.println(user1.concat(" test"));
       
    		   
       
       
      
    		  
      	
     
      	
      	

        		
        
		
        
        

		
		
   
	}

}
