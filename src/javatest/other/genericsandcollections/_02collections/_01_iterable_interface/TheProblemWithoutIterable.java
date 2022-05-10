package javatest.other.genericsandcollections._02collections._01_iterable_interface;



class TheProblemWithoutIterable {
public static void main(String[] args) {

	var list = new WithoutIterableGenericList<String>();
	list.add("a");
	list.add("b");

	// we cannot iterate over list
//	for (var item: list)
//		System.out.println(item);

	// unless we allow access to its implementation detail:
	for (var item: list.items)
		System.out.println(item);

	// if we changed the implementation our code would break...


	// instead GenericList should implement Iterable.

}
}
