package javaproblems.strings_numbers._01count_duplicate_chars;
/*
* My solution -> map.putIfAbsent saves a lot of work
* The solutions here work for the original unicode character size that Java works with == 16-bit char
* Unicode's maximum value is larger than this now, surrogate pairs are used to represent unicode chars
* with values greater than 65,535.
* charpoints are used instead of char. Any character above 65,535 would need to be checked for in my solution.
* */

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solutions {
private Map<Character, Integer> countMap = new HashMap<>();
private Map<Character, Long> countMap1 = new HashMap<>();
private final String STRING_INPUT = "abcdefghijklmnopqrstuvwxyzabcdabcaba%#AC";

public static void main(String[] args) {
	Solutions solutions = new Solutions();

	// My SOLUTION
	solutions.countMap = solutions.myAttempt(solutions.STRING_INPUT);

	System.out.println("My solution, print Map version 1:" );
	for(Character key: solutions.countMap.keySet())
		System.out.println(key + " " + solutions.countMap.get(key));


	System.out.println("\nMy solution, print Map version 2:" );
	solutions.countMap.entrySet().forEach(
		entry -> {
			System.out.print(entry.getKey() + "" + entry.getValue() + " ");
		}
	);

	// Solution using map.compute and lambda

	solutions.countMap = solutions.countDupeCharsWithComputeLambda(solutions.STRING_INPUT);

	System.out.println("\n\nBook Solution 01, print Map version 3:" );
	//System.out.println(solutions.countMap);
	//System.out.println(Arrays.asList(solutions.countMap));
	System.out.println(Collections.singletonList(solutions.countMap));


	// Solution using Stream

	System.out.println("\nFirst this is what the IntStream integer representation of our string looks like using\ntoArray() -> Arrays.toString:");

	IntStream integerRepresentationOfCharsInString  = solutions.STRING_INPUT.chars();
	System.out.println(Arrays.toString(integerRepresentationOfCharsInString.toArray()));


	solutions.countMap1 = solutions.countDupeCharsWithStream(solutions.STRING_INPUT);

	System.out.println("\n\nBook Solution 02, print Map version 4 BiConsumer:" );

	BiConsumer<Character, Long> biConsumer = (key, val) ->
		                                         System.out.println(key + " = " + val);

	solutions.countMap1.forEach(biConsumer);

}


public Map<Character, Integer> myAttempt(String stringInput) {
	Map<Character, Integer> countMap = new HashMap<>();
	Character currentChar;
	Integer countOfChar = 1;

	for(int i = 0; i < stringInput.length(); i++) {
		currentChar = stringInput.charAt(i);
		for(int j = (i + 1); j < stringInput.length(); j++) {
			if(stringInput.charAt(j) == currentChar) {
				countOfChar++;
			}
		}
		countMap.putIfAbsent(currentChar,countOfChar);
		countOfChar = 1;
	}

	return countMap;
}

public Map<Character, Integer> countDupeCharsWithComputeLambda(String str) {

	Map<Character, Integer> result = new HashMap<>();

	// or use for(char ch: str.toCharArray()) { ... }
	for (int i = 0; i<str.length(); i++) {
		char ch = str.charAt(i);

		result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
	}

	return result;
}

public Map<Character, Long> countDupeCharsWithStream(String str) {

	Map<Character, Long> result = str.chars() // str.chars() returns an IntStream containing an integer representation of the characters from the given string
		.mapToObj(c -> (char) c)  // Transforms the IntStream integer representation back to human-friendly character form.
		.collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Group by character and count.

	return result;
}

}
