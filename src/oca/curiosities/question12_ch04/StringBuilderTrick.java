package oca.curiosities.question12_ch04;

class StringBuilderTrick {
public static void main(String[] args) {
//	StringBuilder b = "rumble"; // Stringbuilder has to be instantiated.
	String string = "string";
	StringBuilder b1 = new StringBuilder("string");
	//if(string == b1) // String and StringBuilder OBJs cannot be compared
	if(string.equals(b1.toString())) // equality of contents can only be checked if StringBuilder is first changed to string
		System.out.println("This is fine though, back to rumble");
	System.out.println();

	StringBuilder b = new StringBuilder("rumble");
	b.append(4).deleteCharAt(3).delete(3, b.length()-1);
	System.out.println(b);


}
}
