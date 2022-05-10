package javatest.core.javadeclarations.static_vs_instance;

class _01Static {
private String name = "Static class";
public static void first() { }
public static void second() { }
public  void third() { System.out.println(name); }
public static void main(String args[]) {
	first(); // static call 1
	second(); // static call2
	//third(); // static call 3 DOES NOT COMPILE
} }
