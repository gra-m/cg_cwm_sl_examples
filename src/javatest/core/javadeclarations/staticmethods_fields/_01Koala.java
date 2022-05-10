package javatest.core.javadeclarations.staticmethods_fields;
/*
*In addition to main() methods, static methods have two main purposes:
1. For utility or helper methods that don’t require any object state. Since there is no need
	to access instance variables, having static methods eliminates the need for the caller to
	instantiate the object just to call the method.
*
2. For state that is shared by all instances of a class, like a counter. All instances must
	share the same state. Methods that merely use that state should be static as well.
*
* */
public class _01Koala {
public static int count = 0; // static variable
public static void main(String[] args) { // static method
	System.out.println(count);
}
}

class _02KoalaTester {
public static void main(String[] args) {
	_01Koala.main(new String[0]); // calling _01Koala's static main method
}

}
