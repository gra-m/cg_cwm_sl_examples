package javatest.core.lambda_expressions.lambda_hop_example;

public class CheckIfHopper implements CheckTrait {
public boolean test(Animal a) {
	return a.isHopper();
}
}
