package oca.curiosities.enthu;

class StaticStatementsFirst {

static {s1 = sM1("Simply in order of appearance 01");}

static String s1 = sM1("I am a static intitializer statement 02");

String s2 = sM1("I am an instance initializer statement 03");

{s2 = sM1("I am an instance block that updates the initialized value 04");}

public static void main(String[] args) {
	StaticStatementsFirst staticStatementsFirst = new StaticStatementsFirst();
	System.out.println("Value is last given.");
	System.out.println(s1 + " \n" + staticStatementsFirst.s2);
}
private static String sM1(String s) {
	System.out.println(s);
	return s;
}
}
