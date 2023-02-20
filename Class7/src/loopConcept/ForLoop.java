package loopConcept;

public class ForLoop {

	public static void main(String[] args) {
		
	        String a = "apple";
	
	        // int x = 2;
			
	        
	        System.out.println(a.charAt(0)); //----------a
		
		    System.out.println( "hello".indexOf("lo")); //-----3
	        
	        System.out.println(a.contains("v"));  //-----false
	        
	        System.out.println(a.concat("55abc").concat("apple").length());//----12

	        System.out.println(a.equals("Apple")); //---false it doesn't ignore the case

	        System.out.println(a.equalsIgnoreCase("Apple")); //----true
	
	        System.out.println(a.replace("e", "E")); //-----AppE
	        System.out.println(a.trim()); //------it eliminates the space in front and back of the string
	        // two types of substring;
	           //1- you pick index value and you go all the way to the end. //System.out.println(a.substring(2)); ----ple
	           // 2- you have a range of index; begin and end (the end java will not include it in range. 	        //System.out.println(a.substring(2, 4)); ------pl
	        
	        
	    	int x= 5;
			int y= 99;
			for (int i=x ; i <=y; i=i+5) {
				System.out.println(i);
			}

	        
	         
	}

}
