package oca.curiosities.exceptions;

import java.io.IOException;

public class CarefulWhatYouCatch {
public static void main(String[] args) {
	try {
		System.out.println("work real hard");
		//throw new IOException("Weird");
	} catch (StackOverflowError ioe) {

	} catch (RuntimeException re) {

	}
}
}
