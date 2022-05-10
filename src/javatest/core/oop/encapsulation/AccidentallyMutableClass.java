package javatest.core.oop.encapsulation;

//Encapsulation refers to preventing callers from changing the instance variables
//directly. Immutability refers to preventing callers from changing the instance
// variables at all.

class AccidentallyMutableClass {
private StringBuilder builder;

public AccidentallyMutableClass(StringBuilder b) {
	builder = b;
}
// No Setter - but StringBuilder is mutable

public StringBuilder getBuilder() {
	return builder;
}

// to fix either only ever pass a copy of StringBuilder:
public StringBuilder get_Builder() {
	return new StringBuilder(builder);
}

// or pass back a String
public String getValue() {
	return builder.toString();
}
}

