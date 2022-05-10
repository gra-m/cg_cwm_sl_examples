package javatest.core.flowcontrol.$witch;

import java.util.Locale;

import static java.util.Objects.isNull;
import static javatest.utilities.Input.*;

// Acceptable datatypes for switch elements:  long, byte, short, char, string, enum
public class _$tring$witch {

public static void main(String[] args) {

	_$tring$witch sswitch = new _$tring$witch();
	sswitch.runApp();

}

private void runApp() {
	boolean running = true;
	String input = null;

	do {

		while (isNull(input)) {
			input = getStringInput("Enter case for switch one-four");
		}

		input = input.toLowerCase();

		switch (input) {
			case "one":
				System.out.println("user entered one");
				break;
			case "two":
				System.out.println("user entered two");
				break;
			case "three":
				System.out.println("user entered three");
				break;
			case "four":
				System.out.println("user entered four");
				break;
			default:
				running = false;
		}

		input = null;

	} while (running);


}
}