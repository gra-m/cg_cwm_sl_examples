package javatest.other.genericsandcollections._01generics._06_generics_and_inheritance;

class Utils {

public static <T extends Comparable<T>> T max(T first, T second){
	return (first.compareTo(second) < 0) ? second : first;
}

public static <K, V> void print(K key, V value) {
	System.out.print("K, V generic -> ");
	System.out.println(key + " = " + value);
}

public static void print(User user) {
	System.out.println(user.toString());
}

public static void printUsers(GenericList<User> userList) {

}
}
