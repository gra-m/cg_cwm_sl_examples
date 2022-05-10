package javaproblems.strings_numbers._02first_non_repeated_char;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solutions {
private final String STRING_INPUT = "abcdefghijklmnopqrstuvwxyzabcdabcabcaba%#AC";

public static void main(String[] args) {
	Solutions solutions = new Solutions();

	// My SOLUTION failed as it carried over j + 1 from the previous solution rather than just
	// ensuring that a character was not being checked against itself @ line 33

	Character firstNonRepeated = solutions.myFirstNonRepeated(solutions.STRING_INPUT);

	System.out.println("My solution, print Map version 1:");
	System.out.println(firstNonRepeated);
}


// This is book solution.
public Character myFirstNonRepeated(String stringInput) {

	Character currentChar = 0;

	for (int i = 0; i < stringInput.length(); i++) {

		currentChar = stringInput.charAt(i);

		int count = 0;
		for (int j = 0; j < stringInput.length(); j++) {
			if (currentChar == stringInput.charAt(j) && i != j) {
				count++;
				break;
			}
		}

		if (count == 0)
			return currentChar;

	}
	return Character.MIN_VALUE;
}

}