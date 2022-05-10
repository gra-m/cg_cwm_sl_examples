package oca.curiosities;

public class StringPool {
public static void main(String[] args) {
	String poolMember = "inQuotation";
	String separateObject = new String ("inQuotation");

	System.out.println(poolMember.equals(separateObject)); // true
	System.out.println(poolMember == separateObject); //false
	System.out.println(poolMember.equals("inQuotation")); // true
	System.out.println(poolMember == "inQuotation"); // true as Stringpool same object


	StringBuilder stringBuilder = new StringBuilder("inQuotation");

	System.out.println(poolMember.equals(stringBuilder)); // even if contents same always false
	// does not compile System.out.println(stringBuilder == poolMember);
}
}
