package oca.curiosities;

@FunctionalInterface
interface Climb {
	// (1) Defines the parameters involved.
boolean isTooHigh(int height, int limit);

//if you add another abstract method the interface is broken
//boolean assWiper(long height, int shages);
}

public class Climber{
 public static void main(String[] args) {
	 int heightInputByUser = 10;

	 // (2) Defines how the parameters will be tested by passing to check Java knows
	 // the first parameter must be Climb climb and that the
	 // boolean value is to be resolved using h > l (true).
	 check((h, l) -> h > l, heightInputByUser);
	 }


	 // (3) the lambda hits method as a known 'Climb' with the instruction on how to use what
// is defined in climb.
private static void check(Climb climb, int height) {
	 // climb.isTooHigh is called and for the first time the height and limit are together.
	if (climb.isTooHigh(height, 9))
		System.out.println("too high");
	else
		System.out.println("ok");
}
}
