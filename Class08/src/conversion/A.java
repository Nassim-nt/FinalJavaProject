package conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A {

	public static void main(String[] args) {
		
		
		String s = "S123,A456,E456,R894";
		// want to take A456 convert it to 456, than subtract (1000-456)
		
		String [] myArr = s.split(","); //we created a String [] splitting s string at ","
		System.out.println(myArr [1]);
		
		String myValue = myArr [1]; // we created a bucket for myArry[1]
		System.out.println(myValue.substring(1)); // which is A456
		
		
		String my2ndValue = myValue.substring(1); //we created a bucket for substring (1) starting from index 1
		
		
		int myInt = Integer.parseInt(my2ndValue); // here formula to convert string to int
		
		System.out.println(1000-myInt);
		System.out.println(1000-Integer.parseInt(s.split(",") [1].substring(1)));  // this to clean up my codes
		
		
		
		
		// extra
		// convert from int to string
		int a = 50;
		String v = a+"";
		// or if it is object way like:
		Integer b = 65;
		String c = b.toString();
		
		
		double w = 10.5;
		
		int f = (int)w;  // casting; it works only from big to small (in this case double to int)
		
		System.out.println(f);
		
		int i = 10;
		double g = (double) i; // in java it allows us to go from big to small as well, maybe bc we are dealing with primitive data
		System.out.println(g);
		
		
		// date
		
		Date d = new Date();  // this object to print the date
		String todayDate = d.toString();
		System.out.println(d); // Fri Nov 25 15:38:13 CST 2022
		
		System.out.println("===========================");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("MM-DD-yyyy_hh:mm:ss"); // we are creating an object for simple date format
		String date = simpleDateFormat.format(d);
		
		System.out.println(date); //11-329-2022_03:38:13
		
		
		
		
	}

}
