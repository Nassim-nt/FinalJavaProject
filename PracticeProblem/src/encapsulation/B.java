package encapsulation;

public class B {

	
		private int num = 10;
		private static String word = "brave";
		
		
		
		
		public int getNum() {
			return num;
		}
		
		public void setNum(int num) { // in the standards they want us to call 
			this.num = num;  // the input variable same as the the variable name
		}                    // in this case we want to distinguish the variable name
							 // by adding the class name. because it is non-static, we have to crate object 
							 // for less work we are using this key word.	
		public static String getWord() {
			return word;
		}
		
		public static void setWord(String word) {
			B.word = word; 
		}
		
}
	