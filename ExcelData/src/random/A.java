package random;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class A {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		Random rn = new Random();
		// int answer = rn.nextInt(999 - 100 +1)+100;

		//System.out.println(rn.nextInt(999 - 100 + 1) + 100);

		while (set.size() != 500) {

			set.add(rn.nextInt(999 - 100 + 1) + 100);
		}

		System.out.println(set.size());
		System.out.println(set);
	}

}
