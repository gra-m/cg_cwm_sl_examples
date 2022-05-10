package javatest.other.genericsandcollections._01generics._04generic_methods;

class NonGenericUtilClass {

//10 NON-GENERIC
public static int max(int first, int second){
	//return (first > second) ? first : second;
	return Math.max(first, second);
}


//10a declaring a generic method inside a non generic class
// FAILS
/*public static <T> max(T first, T second){
	//return (first > second) ? first : second;
	return Math.max(first, second);
 */

//10b NEEDS CONSTRAINT:
public static <T extends Comparable<T>> T max(T first, T second){
	return (first.compareTo(second) < 0) ? second : first;
}

}
