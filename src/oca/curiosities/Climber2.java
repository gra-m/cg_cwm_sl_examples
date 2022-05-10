package oca.curiosities;

@FunctionalInterface
interface Climb2 {
	boolean test(Integer height, Integer limit);
}

public class Climber2{
public static void main(String[] args) {
	int heightInputByUser = 5;

	check((h,l) -> h > l, heightInputByUser);

}


private static void check(Climb2 climb2, int height) {

	if(climb2.test(height, 10))
		System.out.println("Height exceeds limit.");
	else
		System.out.println("ok");
}
}
