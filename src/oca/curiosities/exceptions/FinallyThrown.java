package oca.curiosities.exceptions;
// Wanted to know what printed if finally does not throw same exception
//again
public class FinallyThrown {
public static void main(String[] args) {
	System.out.print("a");
	try {
		System.out.print("b");
		throw new IllegalArgumentException();
	} catch (IllegalArgumentException iae){
		System.out.print("c");
		throw new RuntimeException("1");
	} catch (RuntimeException re) {
		System.out.print("d");
		throw new RuntimeException("2");
	} finally {
		System.out.print("e");
		//throw new RuntimeException("3");
	}
}
}
