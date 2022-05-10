package oca.curiosities;

public class StringAndStringBuilder {
public static void main(String[] args) {
	String string = "Java";
	StringBuilder stringBuilder = new StringBuilder("Java");

	if (!(string.equals(stringBuilder)))
	System.out.println("string.equals(stringbuilder) == ok but does not compare contents\nStringBuilder inherits Equals from Object so answer is " + string.equals(stringBuilder));

	if(string.equals(stringBuilder.toString()))
		System.out.println("string.equals(stringBuilder.toString() works to compare contents");

	if(!(string == stringBuilder.toString()))
		System.out.println("if(!(string == stringBuilder.toString())) shows that toString creates a completely\n" +
			                   "new string object, otherwise it would have to search the entire StringPool," +
			                   "\nfind string and... you get it..");
}
}
