package javatest.core.oop.encapsulation;

// Encapsulation refers to preventing callers from changing the instance variables
//	directly. Immutability refers to preventing callers from changing the instance
//	variables at all.


class AccidentallyMutableApp {
public static void main(String[] args) {
	StringBuilder stringBuilder = new StringBuilder("Initial");
	AccidentallyMutableClass accidentallyMutableClass = new AccidentallyMutableClass(stringBuilder);

	StringBuilder addWhatIWantToIt = accidentallyMutableClass.getBuilder();
	System.out.println(addWhatIWantToIt);
	addWhatIWantToIt.append(" That's f*$$ed it!");
	System.out.println(addWhatIWantToIt);
}
}
