package problemsPractice;

public class Pro {

	
	int firstOperand = 0;
	int secondOperrand = 0;
	
	public void main(String[] args) {
		
		divide(2,5);
		
	}

	public String twoChar(String str1, int index) {
		
		
		if (str1.length()<= index+1 || index<0) {
			return str1.substring(0,2);
		}else
				return str1.substring(index, index+2);
		
	}
	
	
	public  int divide(int firstOperand, int secondOperrand) {
		
		 if (secondOperrand !=0) { 
			
		
		 } 
				return firstOperand / secondOperrand;
	
		
			
		
		
	}


}
