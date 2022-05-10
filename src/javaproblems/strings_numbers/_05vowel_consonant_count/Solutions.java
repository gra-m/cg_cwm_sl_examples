package javaproblems.strings_numbers._05vowel_consonant_count;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Objects.isNull;
import static java.util.stream.Collectors.*;

public class Solutions {
private String input = "a;knvoineriqvoiqjepjpnvpqcm/.dmcasldjoasdfjlasdv alsdjv";
private String inputCheck = "aeioucdfgh";
private static final Set<Character>  ENGLISH_VOWELS = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

public static void main(String[] args) {
	Solutions solutions = new Solutions();
	System.out.println(solutions.fMCountVowelsConsonants(solutions.input));

	if (solutions.fMCountVowelsConsonants(solutions.input).equals(Map.entry(13,38)))
		System.out.println("It's a match");

	System.out.println(solutions.countVowelsConsonants(solutions.input));


	System.out.println(solutions.countVowelsConsonantsV2(solutions.input));

}

// uses created Pair class in book solutions.
private Map.Entry<Integer, Integer> fMCountVowelsConsonants(String input) {
	input = input.toLowerCase();
	Integer vowels = 0;
	Integer consonants = 0;

	for(int i = 0; i < input.length(); i++) {
		if(ENGLISH_VOWELS.contains(input.charAt(i)))
			vowels++;
		else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
			consonants++;
	}

	return Map.entry(vowels,consonants);

}


// from book but explored here uses .chars() to create IntStream then IntStream.filter(predicate) method:
private Map.Entry<Long, Long> countVowelsConsonants(String input) {

	if (isNull(input) || input.isBlank())
		return Map.entry(-1L, -1L);

	input = input.toLowerCase();

	Long vowels = input.chars()
		              .filter(c -> ENGLISH_VOWELS.contains((char) c))
		              .count();

	Long consonants = input.chars()
		                  .filter(c -> !(ENGLISH_VOWELS.contains((char) c)))
		                  .filter(ch -> (ch >= 'a' && ch <= 'z'))
		                  .count();

	return Map.entry(vowels, consonants);

}

private Map.Entry<Long, Long> countVowelsConsonantsV2(String input) {

	if (isNull(input) || input.isBlank())
		return Map.entry(-1L, -1L);

	input = input.toLowerCase();

	Map<Boolean, Long> result = input.chars()
		                            .mapToObj(c ->(char) c) // cast each char representing int in IntStream to char
		                            .filter(ch -> (ch >= 'a' && ch <= 'z')) // filter so we are only concerned with chars a-z
		                            .collect(partitioningBy(c -> ENGLISH_VOWELS.contains(c), counting())); // partition and count each char based on whether it exists in vowel list (true) or not.


	return Map.entry(result.get(true), result.get(false));

}
}
