package oca.curiosities.exceptions;

public class Laptop_q9 {
public void start() {
	try {
		System.out.print("Starting up ");
		throw new Exception();
	} catch (Exception e) {
		System.out.print("Problem ");
		System.exit(0); // instantaneous JVM shutdown
	} finally {
		System.out.print("Shutting down ");
	}
}

public static void main(String[] args) {
	new Laptop_q9().start();
}
}
