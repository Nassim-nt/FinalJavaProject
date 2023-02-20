package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateV2 {

	public static void main(String[] args) {
		
		
		// given a string find each duplicated char
		
		String str = "hello world hi"; // [l,o,  ,h] even "  " is included 
		
		Set<Character> myC = new LinkedHashSet<Character>();
		Set<Character> myDuplicateC = new LinkedHashSet<Character>();
		
		
		char [] myArr = str.toCharArray();
		
		for (char item : myArr) {
			if (myC.add(item)) {
				// not duplicate
			}else {
				myDuplicateC.add(item); // we can add this part inside if(!myDuplicateC.add(item))
			}                           
		}
		
		System.out.println(myDuplicateC);
	}

}
