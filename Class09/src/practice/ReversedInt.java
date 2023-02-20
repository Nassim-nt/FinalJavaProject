package practice;

public class ReversedInt {

	public static void main(String[] args) {
		
		
		int N = 789;
		String newN = N+"";
		
		char [] myArry = newN.toCharArray();
		
		String result= "";
		for (int i= myArry.length-1; i>=0; i--) {

			result = result+ myArry[i];
			
		}
		
	int reversedInt = Integer.parseInt(result);
	
	System.out.println(reversedInt);
	}
}
