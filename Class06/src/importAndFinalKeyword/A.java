package importAndFinalKeyword;


import variables.XY; //import the package to connect it with another package.
                      // this happened when we called XY in line 23. now we can creat an object to call no static method
                      // if we have many classes in a package for example variables package
					 // contains many classes and we want to call them her
					// we can create this import (import variables.*;)
import variables.*;


public class A {

	public static void main(String[] args) {
		
		
		final int a = 10;     // final word make this variable fix and not able to be changed in 12 and 16
		
		System.out.println(a); //10
		
		//a = 55;   // it is erroring out because a is final in line 8
		
		System.out.println(a); //55
		
		//a = 66;
		
		System.out.println(a);  //66
		
	
		
		XY.XY1();

	}

}
