package javatest.core.lambda_expressions.predicate_examples.built_in_predicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class _A_rray_List {
private static List<String> bunnies = new ArrayList<>();

// todo remove if with more than one argument eg. length and charAt

public static void main(String[] args) {
	bunnies.add("long ear");
	bunnies.add("floppy");
	bunnies.add("hoppy");
	List<String> bunnies2 = new ArrayList<>(bunnies);
	List<String> shaglow = new ArrayList<>(40);
	Collections.copy(bunnies2, shaglow);
	System.out.println("bunnies: " + bunnies); // [long ear, floppy, hoppy]
	bunnies.removeIf(s -> s.charAt(0) != 'h');
	System.out.println("bunnies after charAt(0) != 'h' : " + bunnies); // [hoppy]
	System.out.println("bunnies2: " + bunnies2);
	bunnies2.removeIf(s -> s.contains("ear"));
	System.out.println("bunnies2 after length8 removed: " + bunnies2);
	System.out.println(shaglow);

}


}
