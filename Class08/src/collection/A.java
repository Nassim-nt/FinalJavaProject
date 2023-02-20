package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		
		int [] xy = new int [3]; 
		
		xy[0]= 55;
		xy[1]= 99;
		xy[2]= 33;
		
		System.out.println(xy[0]); //55
		System.out.println(xy[1]); //99
		System.out.println(xy[2]); //33
		System.out.println("=======================");
		
		xy = new int [4];
		
		xy[3]= 66;
		
		System.out.println(xy[0]); //0 because in line 18 we created a new object
		System.out.println(xy[1]); //0 these three lines will print default value
		System.out.println(xy[2]); //0 which is o. if it was string, it will print out null. thats why we say arry in jave is static
		System.out.println(xy[3]); //66
	
	
	//Java collection: 
		//list: ArryList, LinkedList.
		//set: HashSet, LinkedHashSet, TreeSet
		//Map: HashMap, Linked HashMap, TreeMap
		
		
		// formula to create the collection;
		// collection<ObjectDataType>objectVariable = new collectionType<ObjectDataType> ();
		//or
		//CollectionType<ObjectDataType> objectVariable = new collectionType<ObjectdataType();
		
		//List<String> xyz = new ArrayList<String> (); // list is interface, out of that interface we are implementing ArrayList
			// inside <> it has to be no primitive data type, that is why the formula says object data type										 
		// so for boulean we sould do <Boulean>
		// for int <Integer>
		//for Cha <Character>
	
		
		System.out.println("=========");
		
		List<Integer> xyz = new ArrayList<Integer>();
		xyz.add(55); // here we are adding integer.value 
					// of(55) which is object
		xyz.add(35);
		xyz.add(34);
		xyz.add(55);
		xyz.add(76);
		xyz.add(25);
		xyz.add(98);
		xyz.add(57);
		xyz.add(55);
		xyz.add(23);
		
		
		System.out.println(xyz.size()); // in ArrayList we use size for lenght
		
		System.out.println(xyz.get(0));
		System.out.println(xyz.get(1));
		System.out.println(xyz.get(2));
		System.out.println(xyz.get(3));
		
		System.out.println("==========");
		xyz.remove(3);
		
		System.out.println(xyz.get(0));
		System.out.println(xyz.get(1));
		System.out.println(xyz.get(2));
		System.out.println(xyz.get(3));
		
		System.out.println("===================");
		
		for (Integer item : xyz) {
			System.out.println(item);
		}
		
		System.out.println(xyz); // it will print out all what i have in list, and this is only for collection object.
		
		
		// the only way to print by index number, we need to convert xyzz to array
		Object [] myArray = xyz.toArray();
		System.out.println(myArray[0]);
		
		
		
	}
	

}
