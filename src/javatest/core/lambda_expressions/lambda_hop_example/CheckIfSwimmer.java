package javatest.core.lambda_expressions.lambda_hop_example;


//Not required with lambda

public class CheckIfSwimmer implements CheckTrait{
public boolean test(Animal a) {
	return a.isSwimmer();
}

}
