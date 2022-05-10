package javatest.other.genericsandcollections._01generics._05_multiple_type_parameters;

class NonGenericUtilClass {

public static <T extends Comparable<T>> T max(T first, T second){
	return (first.compareTo(second) < 0) ? second : first;
}

//12 PROBLEM restrained to int:
public static void print(int key, int value) {
	System.out.print("12 -> ");
	System.out.println(key + " = " + value);
}

//12a Single Type parameter still binds us to an int value
public static <T> void print(T key, int value) {
	System.out.print("12a-> ");
	System.out.println(key + " = " + value);
}

//12b Single Type parameter still binds us to an int value
public static <K, V> void print(K key, V value) {
	System.out.print("K, V generic -> ");
	System.out.println(key + " = " + value);
}
}
