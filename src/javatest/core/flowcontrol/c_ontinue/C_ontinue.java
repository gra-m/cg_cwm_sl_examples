package javatest.core.flowcontrol.c_ontinue;

import static java.util.Objects.isNull;
import static javatest.utilities.Input.getStringInput;

// Acceptable datatypes for switch elements:  long, byte, short, char, string, enum
public class C_ontinue {

public static void main(String[] args) {

	C_ontinue sswitch = new C_ontinue();
	sswitch.runApp();

}

private void runApp() {
	boolean running = true;
	Integer input = null;

	System.out.println("For best results watch process in debug");

	do {

		while (isNull(input)) {
			input = javatest.utilities.Input.getIntegerInput("\n\n1 nested for loop\n2 if gatekeeps so printed only wnen 2 or b\n3 continue to inner loop\n4 continue to labelled outer loop\n5 quit");
		}


		switch (input) {
			case 1:
				System.out.println("case 1 no if, no continue,\ninner and outer loop fully resolve:\n");
				FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
					for (char x = 'a'; x <= 'c'; x++) {
						System.out.print(" " + a + x);
					}
				}
				break;
			case 2:
				System.out.println("case 2 only if,\nonly if a equals 2 or x equals b, they are printed:\n");
				FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
					for (char x = 'a'; x <= 'c'; x++) {
						if (a == 2 || x == 'b')
							System.out.print(" " + a + x);
					}
				}
				break;
			case 3:
				System.out.println("case 3 if and continue,\n2 and b are excluded from ever being printed:\n");
				FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
					for (char x = 'a'; x <= 'c'; x++) {
						if (a == 2 || x == 'b')
							continue;
							System.out.print(" " + a + x);
					}
				}
				break;
			case 4:
				System.out.println("case 4 if and continue to label,\nresetting to outer loop means 2 is never printed and x is reset to 'a' as soon as it progresses:\n");
				FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
					for (char x = 'a'; x <= 'c'; x++) {
						if (a == 2 || x == 'b')
							continue FIRST_CHAR_LOOP;
						System.out.print(" " + a + x);
					}
				}
				break;
			case 5:
				running = false;
				break;
			default:
				System.out.println("invalid input");
		}

		input = null;

	} while (running);


}
}