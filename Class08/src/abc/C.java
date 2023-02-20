package abc;

public class C extends B {

	public static void main(String[] args) {
		
		C objectC = new C();
		objectC.abc();
		objectC.sum(0, 0);

	}

	@Override
	public void abc() {
		System.out.println("this is class");
		
	}

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
	}

}
