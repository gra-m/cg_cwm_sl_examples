package javatest.core.lambda_expressions.predicate_examples.basic_boolean_test;

import java.util.ArrayList;
import java.util.List;

class PredicateTest {

public static void main(String[] args) {
	List<LifeForm> lifeForms = new ArrayList<>();
	lifeForms.add(new Animal("fish", true, false, true));
	lifeForms.add(new Animal("fash", false, true, true));
	lifeForms.add(new Human("fush", true, true, true));
	lifeForms.add(new Animal("fesh", true, true, false));

	print(lifeForms, a -> a.isHappy());
}
// todo make generic collections -> instead of relying on interface

private static void print(List<LifeForm> lifeForms, Predicate<LifeForm> checker) {
	for (LifeForm lifeForm : lifeForms) {
		if (checker.test(lifeForm))
			System.out.print(lifeForm.className() + " " + lifeForm + " ");
	}
	System.out.println();
}
}