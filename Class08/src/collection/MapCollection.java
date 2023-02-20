package collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		
		
		Map<String, Integer> myC = new HashMap<String, Integer>();
			//key    //value
		
		myC.put("A", 55);
		myC.put("B", 35);
		myC.put("c", 46);
		myC.put("D", 82);
		myC.put("A", 55);
		myC.put("A", 64);
		
		System.out.println(myC.size()); // it will print 4 because A doublicated 3 times
		System.out.println(myC.get("A")); // 64 because last one is 64.
		
		System.out.println("==================================");
		// if we want to print out all the values.
		
		for (Integer item : myC.values()){
			
			System.out.println(item); // the will be printed randomly because HashMap
		}
		
		System.out.println("==================================");
		
		for (String item : myC.keySet()){
			
			System.out.println(item); // it will print key in order, HashMap only for key
		}
		
		// if I want to print my collection (key and value) i just do this
		System.out.println(myC); //{A=64, B=35, c=46, D=82}
		
		System.out.println("==================================");
		
		// if I want to print my keys and values using for loop
		
		for (String name: myC.keySet()) {
		    String key = name.toString();
		    String value = myC.get(name).toString();
		    System.out.println(key + " " + value);
		}
		
	}
	

}
