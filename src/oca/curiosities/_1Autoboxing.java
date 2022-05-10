package oca.curiosities;

import java.util.ArrayList;
import java.util.List;

class _1Autoboxing {
public static void main(String[] args) {
	List<Integer> ages = new ArrayList<>();
	ages.add(Integer.parseInt("5")); // parseInt returns an int that is autoboxed to an Integer to be added to ages
	ages.add(Integer.valueOf("6")); // valueOf returns Integer so autoboxing is not required
	ages.add(7);  // int 7 is autoboxed
	ages.add(null); // provides a NullPointerException

	// The following will quite happily print null
	for (Integer age: ages) // unboxing of Integers into ints
		System.out.println(age);
	System.out.println();

	for (int age: ages) // unboxing of Integers into ints == NullPointerException
		System.out.println(age);
}
}
