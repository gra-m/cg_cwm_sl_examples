package javatest.other.genericsandcollections._01generics._04generic_methods;

class AppClass {
public static void main(String[] args) {
	//11a uses int method
	var max = NonGenericUtilClass.max(1,2);
	System.out.println(max);

	//11b uses generic method
	var max1 = NonGenericUtilClass.max(1L, 85L);
	System.out.println(max1);

	//11c uses generic method, only because UserComparable implements Comparable
	var max2 = NonGenericUtilClass.max(new UserComparable(500), new UserComparable(499));
	System.out.println(max2);


}
}
