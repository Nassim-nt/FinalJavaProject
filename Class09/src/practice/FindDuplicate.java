package practice;

public class FindDuplicate {

	public static void main(String[] args) {
		
		// given a string and given char
		// tell me how many times does that char repeat in a string
		
		String str = "happyBirthday";
		char c = 'h';
		
		char [] myArr = str.toCharArray();
		
		int count = 0;
		for(int i = 0; i< myArr.length; i++) {
			
			if (myArr[i]== c){
				count++;
			}
		}
		
		System.out.println(count);

	}

}
