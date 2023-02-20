package x;

import y.A; // this is happen after i moved A to Y package

public class MyMain  {

	public static void main(String[] args) {
		
		// what happen if the are all in same class/// nothing within same class we can do what ever we want

		
		A.A1();
		A.A2(); // if we are dealing with methods within different classes, and there is no inheritance, and  those classes belong to same class,
		A.A3(); // everything is acceceble except private method
		A.A4();
		
		A.A1();
		A.A2(); // if we are dealing with methods within different classes, and there is inheritance, and  those classes belong to same class,
		A.A3(); // everything is acceceble except private method
		A.A4();
		
		// after these two example I will move classe A to package y
		
		A.A1();
		A.A2(); // if we are dealing with methods within different classes, and there is inheritance, and  those classes belong to different class,
		A.A3(); // private method and default are not accecible.
		A.A4();
		
		
		// after that I will cancel the inheritance 
		
		A.A1();
		A.A2(); // if we are dealing with methods within different classes, and there is no inheritance, and  those classes belong to different class,
		A.A3(); // only public will be accecible.
		A.A4();
		
		// default access modfiers, we use it only if we want to keep accessible only in same package
		
	}

	
}
