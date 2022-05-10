package javaproblems.strings_numbers._04isdigit;

public class Solutions {

private final String LOCAL_DELIMITER = ".";

public static void main(String[] args) {
	Solutions solutions = new Solutions();

	//Fastest solution
	System.out.println(solutions.digitOnlyString1("1234234234"));

	//Checking local delimiter is within a digit only string without caring where it is:
	System.out.println(solutions.isLocallyDelimitedDecimalString("12.34234234"));

	//Checking local delimiter has exactly four digits after it:
	System.out.println(solutions.isLocallyDelimitedDecFourPlaces("12342.3.4234"));


}

private Boolean digitOnlyString1(String inputString) {

	for (int i = 0; i < inputString.length(); i++) {
		if(!Character.isDigit(inputString.charAt(i)))
			return false;
	}
	return true;
}

private Boolean isLocallyDelimitedDecimalString(String inputString) {

	return digitOnlyString1(inputString.replaceFirst("\\" + LOCAL_DELIMITER, "")); //  duplicate delimiters covered, "\\" to escape special  regEx chars \ ^ $ . | ? * + {} [] ()

}

private Boolean isLocallyDelimitedDecFourPlaces(String inputString)  {

	try {
		if (!isLocallyDelimitedDecimalString(inputString))
			throw new IllegalArgumentException("Non standard input String");
	} catch(IllegalArgumentException ie) {
		System.out.println("Non standard input String passed");
		return null;
	}

	if (inputString.charAt((inputString.length()) - 5) == LOCAL_DELIMITER.charAt(0))
		return true;

	return false;

}


}
