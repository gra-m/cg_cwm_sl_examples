package javatest.core.stringsformattingparsing.immutable;

public class StringImmutable {

public static void main(String[] args) {
	String immutable = "this is what I am";

	System.out.println(immutable);
	System.out.println(immutable.length());
	System.out.println("_" + immutable.charAt(4) + "_charAt(4) is blank");
	System.out.println("_" + immutable.charAt(5) + "_charAt(5) is i");
	System.out.println("first index of blank is: " + immutable.indexOf(" "));
	System.out.println("last index of blank is: " + immutable.lastIndexOf(" "));
	System.out.println("first index of i is: " + immutable.indexOf("i"));
	System.out.println("last index of i is: " + immutable.lastIndexOf("i"));

	System.out.println();
	System.out.println(immutable.startsWith("t"));
	System.out.println(immutable.endsWith("m"));
	System.out.println(immutable.startsWith("x"));
	System.out.println(immutable.endsWith("z"));

	System.out.println();
	System.out.println(immutable.contains("what"));
	System.out.println(immutable.contains("asdf"));


	// Because String is immutable methods like these actually create a new String.
	System.out.println(immutable.substring(5));
	System.out.println(immutable.substring(5, 14));

	System.out.println(immutable.toLowerCase());
	System.out.println(immutable.toUpperCase());

	System.out.println(immutable.replace('I', 'A'));
	System.out.println(immutable.replace('a', 'o'));

	System.out.println("The inefficiency of String\na new string is created with every iteration");

	String inefficient = "";

	for (char current ='a'; current <= 'z'; current++)
		inefficient += current;
	System.out.println(inefficient);

	StringBuilder efficient = new StringBuilder();

	System.out.println("The StringBuilder is mutable, so the append happens to the original object");

	for(char current = 'a'; current <= 'z'; current++)
		efficient.append(current);
	System.out.println(efficient);


	System.out.println("Immutable String length and capacity always the same, Stringbuilder length can\n" +
		                   "be smaller than capacity, showing only what is occupied so far.\n" +
		                   "StringBuffer is like StringBuilder (OCA level) but ThreadSafe");

}
}
