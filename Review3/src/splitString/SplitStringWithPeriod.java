package splitString;

public class SplitStringWithPeriod {

	public static void main(String[] args) {
		
		
		
		String welcomeMsg = "Welcome; James Bond";
		
		String [] msgArry = welcomeMsg.split("\\; "); // we need to add \\ ; to split String into 2 index.
		
		System.out.println(msgArry[1]);
		
		divide(1,2);
		
	}

	
	public static int divide(int firstOperand, int secondOperrand) {
		
				return firstOperand + secondOperrand;
	
		
			
		
		
	}
}
