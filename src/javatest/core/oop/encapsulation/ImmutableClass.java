package javatest.core.oop.encapsulation;

//Encapsulation refers to preventing callers from changing the instance variables
//directly. Immutability refers to preventing callers from changing the instance
// variables at all.

class ImmutableClass {
private int numberEggs;

public ImmutableClass(int numberEggs) {
	this.numberEggs = numberEggs;
}

//There is no setter.

public int getNumberEggs() {
	return numberEggs;
}
}

