package staticKey;

public class A {
	
	
	int a = 5;
	static int b = 6;

	public static void main(String[] args) {
		
		
		A objA = new A();
		System.out.println(objA.a); //5
		
		System.out.println(b); //6
		objA.b = 66;     //because it is b is static the value of b will change everywhere in the copies even in 
		objA.a = 55;      // the original bucket, because it belong to the static line
		System.out.println(objA.a); //55  this object will works only for this method.
		
		A objA2 = new A();
		System.out.println(objA2.a); //5
        System.out.println(objA2.b);
	}

}
