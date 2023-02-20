package encapsule;

public class A {

	public static void main(String[] args) {
		
		
		System.out.println(B.getWord()); // brave
		// we created getter method to access private data
		// we created setter method to modify the value.
		B.setWord("ball");
		System.out.println(B.getWord()); // ball
		
		B b = new B();
		System.out.println(b.getNum()); // 10
		b.setNum(55);
		System.out.println(b.getNum()); //55

	}

}
