package exercice;

public class StringComp {

	public static void main(String[] args) {
		
		
		//interview question; what is the difference between == & .equal.>>> back to notes
		
		String a = "apple";
		String b = "apple";
		
		
		String c = new String ("apple");
		String d = new String ("apple");
		
		int x=5;
		int y=5;
		
		
		if (d==c)  {
			System.out.println("they are equal");
		}else {
			System.out.println("not equal");
		}

	}

}
