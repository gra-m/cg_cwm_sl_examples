package javatest.core.javadeclarations.pass_by_value;

// pass by value means that assignments made in the method do not affect the caller
// variable assignments in methods do nothing to the calling value.
public class _01Sparky {

public static void main(String[] args) {
	String name = "Webby";
	StringBuilder canCallMethodOnParameter = new StringBuilder();

	speak(name); // 01. this does nothing -> name is just reassigning a copy of name to another object.
	System.out.println(name);

	name = speakReturnAssigned(name); // 03.But if you assign the returned value it takes
	System.out.println(name);

	appendingOk(canCallMethodOnParameter); // 04. calling method on this

	System.out.println(canCallMethodOnParameter);

}
public static void speak(String name) { // 02.this is just a local method parameter value, changes do not affect value of caller.
	name = "Sparky";
}

public static String speakReturnAssigned(String name) {
	name = "Sparky";
	return name;
}

public static void appendingOk(StringBuilder stringBuilder) { // copy of canCallMethod On Parameter works though.
	stringBuilder.append("okey-dokey"); // both canCallMethodOnParameter and stringBuilder references point to the same object with the same methods available.
}

}