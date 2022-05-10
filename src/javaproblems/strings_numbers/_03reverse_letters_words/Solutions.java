package javaproblems.strings_numbers._03reverse_letters_words;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solutions {
private String inputSentence = "The right to this and for whenever at all as well again that thinking yes.";
private final String SPLIT_CHARACTER = " ";
private static final Pattern PATTERN = Pattern.compile(" +"); //compile regEx pattern


public static void main(String[] args) {


	Solutions solutions = new Solutions();

	System.out.println(solutions.reverseLettersInWords(solutions.inputSentence));

	System.out.println(solutions.reverseLIWLoopMethod(solutions.inputSentence));

	System.out.println(solutions.reverseLettersFunctionalStyle(solutions.inputSentence));

	System.out.println(solutions.reverseLettersAndWords(solutions.inputSentence));
}


private String reverseLettersFunctionalStyle(String inputSentence) {

	return PATTERN.splitAsStream(inputSentence) // pattern " +"
		       .map(word -> new StringBuilder(word).reverse())
		       .collect(Collectors.joining(" "));
}

private String reverseLIWLoopMethod(String inputSentence) {

	String[] splitSentence = inputSentence.split(SPLIT_CHARACTER);
	StringBuilder builder = new StringBuilder("");

	for (String word: splitSentence)	{

		StringBuilder reversedWord = new StringBuilder("");

		for (int charIndex = word.length() -1; charIndex >= 0; charIndex--) {
			reversedWord.append(word.charAt(charIndex));
		}
		builder.append(reversedWord).append(SPLIT_CHARACTER);
	}

	return builder.deleteCharAt(builder.length()-1).toString();
}

private String reverseLettersInWords(String inputSentence) {
	String[] inputSentenceSplit = inputSentence.split(SPLIT_CHARACTER);
	StringBuilder builder = new StringBuilder("");

	for (String str: inputSentenceSplit) {
		StringBuilder temp = new StringBuilder(str);
		temp = temp.reverse();
		builder.append(temp).append(SPLIT_CHARACTER);
	}

	builder.deleteCharAt(builder.length()-1);

	return builder.toString();
}

private String reverseLettersAndWords(String inputSentence) {
return new StringBuilder(inputSentence).reverse().toString();

}


}
