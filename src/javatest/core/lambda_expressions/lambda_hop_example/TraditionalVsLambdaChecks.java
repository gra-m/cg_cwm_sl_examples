package javatest.core.lambda_expressions.lambda_hop_example;

import java.util.ArrayList;
import java.util.List;

class TraditionalVsLambdaChecks {

public static void main(String[] args) {

	//create list of animals:
	List<Animal> animals = new ArrayList<>();
	animals.add(new Animal("fish", false, true, false));
	animals.add(new Animal("kangaroo", true, false, true));
	animals.add(new Animal("rabbit", true, false, false));
	animals.add(new Animal("turtle", false, true, true));

	// You have to create a class inheriting check criteria interface for each check...
	// Traditional Checks:
	System.out.println("traditional checks: ");
	System.out.println("hoppers");
	print(animals, new CheckIfHopper());
	System.out.println("swimmers");
	print(animals, new CheckIfSwimmer());

	// Using lambdas you do not need the classes the lambda is the class.
	System.out.println("lambda checks");
	System.out.println("hoppers");
	print(animals, a -> a.isHopper());
	System.out.println("swimmers");
	print(animals, a -> a.isSwimmer());
	// There is no class for this but it still works:
	System.out.println("happy");
	print(animals, a -> a.isHappy());


}

private static void print(List<Animal> animals, CheckTrait checker) {
	for (Animal animal: animals) {
		// the general check:
		if(checker.test(animal))
			System.out.println(animal);
	}
	System.out.println();
}

}
