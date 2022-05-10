package oca.curiosities;

public class LocalVarUninitialisedTrick {

static String chair, table = "metal"; // you can have uninitialised class and instance variables.

public static void main(String[] args) {
	//String chair, table = "metal"; // but not local variables
	chair = chair + table;
	System.out.println(chair);
}
}
