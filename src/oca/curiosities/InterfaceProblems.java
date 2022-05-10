package oca.curiosities;

public abstract interface InterfaceProblems { // Always implicit public abstract
int amount = 4; // always public static final
public static final int  AMOUNT_2 = 4;

//public static void eatGrass(); // static methods need to have body/ be implemented.

static boolean eatingGrass() { // public implicit.
	return true;
}

/*public int chew() { // must be marked as default explicitly
	return 13;
}*/

public default int chew() {
	return 13;
}

}
