package javatest.core.memorymanagement.garbagecollection;

public class Scope {
public static void main(String[] args) {
	String one, two; // two string vars one and two
	one = new String("a"); // reference one now has String object with value "a"
	two = new String("b"); // reference two now has String object with value "b"
	one = two; //both one and two now refer to String object "b" //String object a no longer has any references and is eligible for gc
	String three = one; // String three also refers to object "b"
	one = null; // three and two still refer to object "b"
} // object b with its two references is finally ready for gc when it is out of scope at end of method
}

