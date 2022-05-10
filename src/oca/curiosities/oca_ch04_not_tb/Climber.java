package oca.curiosities.oca_ch04_not_tb;


interface Climb {
	boolean isTooHigh(int height, int limit);
}

public class Climber {
public static void main(String[] args) {
	//check((h,l) -> h.append(l).isEmpty(), 5);
}

private static void check(Climb climb, int height) {
	if(climb.isTooHigh(height, 10))
		System.out.println("too high");
	else
		System.out.println("OK");
}
}
