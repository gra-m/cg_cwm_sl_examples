package oca.curiosities.exceptions;

public class Mouse_q12 {
public String name;

public void run() {
	System.out.print("1"); // printed
	try {
		System.out.print("2"); // printed
		name.toString(); // throws npe
		System.out.print("3"); // skipped
	} catch (NullPointerException npe) {
		System.out.print("4"); // printed
		throw npe; // this is not caught and so ends the program
	}
	System.out.println("5"); // prog ended line 14
}

public static void main(String[] args) {
	Mouse_q12 jerry = new Mouse_q12();
	jerry.run();
	System.out.println("6"); // prog ended line 14
}
}