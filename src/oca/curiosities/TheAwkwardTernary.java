package oca.curiosities;

public class TheAwkwardTernary {

public static void main(String[] args) {

	// to see awkward ternary change message to String.
	Object message;
	int x =0;
	while(x++ < 11) {
		message = x > 10 ? "Greater than" : false;
		System.out.println(message + " , " + x);
	}

}
}
