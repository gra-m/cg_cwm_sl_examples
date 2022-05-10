package oca.curiosities.exceptions;
// Duplicate throw only last runs.
// Only one catch block is ever entered.
public class OnlyCaughtOnce {
public static void main(String[] args) {
	System.out.print("a");
	try {
		System.out.print("b");
		throw new IllegalArgumentException();
	} catch (IllegalArgumentException iae) {
		System.out.print("c");
		throw new RuntimeException("1");
	} catch (RuntimeException re) {
		System.out.print("d");
		throw new RuntimeException("2");
	} finally {
		System.out.print("e");
		throw new RuntimeException("3");
	}

}

public static Error wigwam() {
	return null;
}

public static Runtime anyType() {
	return null;
}


}
