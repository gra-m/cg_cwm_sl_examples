package javaproblems.strings_numbers._02first_non_repeated_char.booksolutions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Strings {

// http://www.alansofficespace.com/unicode/unicd99.htm
private static final int EXTENDED_ASCII_CODES = 256; // can be increased to 65535

private Strings() {
	throw new AssertionError("Cannot be instantiated");
}


// Slower approach
public static char firstNonRepeatedCharacterV1(String str) {

	if (str == null || str.isBlank()) {
		// or throw IllegalArgumentException
		return Character.MIN_VALUE;
	}

	for (int i = 0; i < str.length(); i++) {

		char ch = str.charAt(i);

		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (ch == str.charAt(j) && i != j) {
				count++;
				break;
			}
		}

		if (count == 0) {
			return ch;
		}
	}

	return Character.MIN_VALUE;
}

// Single traversal approach that works as long as array not extended past MAX_VALUE of char type
//65,535, so unicode chars outside this range are not covered.
public static char firstNonRepeatedCharacterV2(String str) {

	if (str == null || str.isBlank()) {
		// or throw IllegalArgumentException
		return Character.MIN_VALUE;
	}

	int[] flags = new int[EXTENDED_ASCII_CODES];

	for (int i = 0; i < flags.length; i++) {
		flags[i] = -1;
	}

	for (int i = 0; i < str.length(); i++) {

		char ch = str.charAt(i);
		if (flags[ch] == -1) {
			flags[ch] = i;
		} else {
			flags[ch] = -2;
		}
	}

	int position = Integer.MAX_VALUE;
	for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
		if (flags[i] >= 0) {
			position = Math.min(position, flags[i]);
		}
	}

	return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
}


// As LinkedHashMap == maintains insertion order, no duplicate keys.
public static char firstNonRepeatedCharacterV3(String str) {

	if (str == null || str.isBlank()) {
		// or throw IllegalArgumentException
		return Character.MIN_VALUE;
	}

	Map<Character, Integer> chars = new LinkedHashMap<>();

	// or use for(char ch: str.toCharArray()) { ... }
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);

		chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
	}

	for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
		if (entry.getValue() == 1) {
			return entry.getKey();
		}
	}

	return Character.MIN_VALUE;
}

public static char firstNonRepeatedCharacterV4(String str) {

	if (str == null || str.isBlank()) {
		// or throw IllegalArgumentException
		return Character.MIN_VALUE;
	}

	Map<Integer, Long> chs = str.chars() // limited to 65,535
		.mapToObj(cp -> cp)
		.collect(Collectors.groupingBy(Function.identity(),
			LinkedHashMap::new, Collectors.counting()));

	return (char) (int) chs.entrySet().stream()
		.filter(e -> e.getValue() == 1L)
		.findFirst()
		.map(Map.Entry::getKey)
		.orElse(Integer.valueOf(Character.MIN_VALUE));
}


public static String firstNonRepeatedCharacterVCP4(String str) {

	if (str == null || str.isBlank()) {
		// or throw IllegalArgumentException
		return String.valueOf(Character.MIN_VALUE);
	}

	Map<Integer, Long> chs = str.codePoints() // codepoints allow surrogate pairs to represent > 65,535
		.mapToObj(cp -> cp)
		.collect(Collectors.groupingBy(Function.identity(),
			LinkedHashMap::new, Collectors.counting()));

	int cp = chs.entrySet().stream()
		.filter(e -> e.getValue() == 1L)
		.findFirst()
		.map(Map.Entry::getKey)
		.orElse(Integer.valueOf(Character.MIN_VALUE));

	return String.valueOf(Character.toChars(cp));
}
}

