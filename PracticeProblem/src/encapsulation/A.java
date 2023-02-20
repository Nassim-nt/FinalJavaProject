package encapsulation;

public class A {

	public static void main(String[] args) {
		
		System.out.println(B.getWord());
		B.setWord("caramel");
		System.out.println(B.getWord());
		
		B b = new B();
		System.out.println(b.getNum());
		b.setNum(12);
		System.out.println(b.getNum());

	}

}
