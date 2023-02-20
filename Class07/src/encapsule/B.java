package encapsule;

public class B {

	private int num = 10;
	private static String word = "brave";

	/*
	 * public int getNum () { // this is getter method. in standards we use N.
	 * return num; //returnning integer because we are deling with int value }
	 * 
	 * public void setNum(int num) { // this is setter method. it has purpose of
	 * mchanging the variable this.num = num; // we use void because it is not
	 * returnning anything. } // in JAVA standards we use same name as variable name
	 * for input variable. // for non static method, we add this to distinguish the
	 * variable name. public static String getWord() { return word; }
	 * 
	 * public static void setWord(String word) { B.word = word; // for static we use
	 * class name "." to distinguish the variable name.
	 * 
	 * }
	 */

	// we can generate getter and setter methods by
	// 1- right click
	// 2- source
	// 3- generate getter&setter

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getWord() {
		return word;
	}

	public static void setWord(String word) {
		B.word = word;
	}

}
