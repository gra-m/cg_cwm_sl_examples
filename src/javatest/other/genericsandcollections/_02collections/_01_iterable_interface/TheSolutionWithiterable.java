package javatest.other.genericsandcollections._02collections._01_iterable_interface;

class TheSolutionWithiterable {
public static void main(String[] args) {
	var list = new WithIterableGenericList<String>();
	list.add("a");
	list.add("b");
	var iterator = list.iterator();

	while (iterator.hasNext()) {
		var current = iterator.next();
		System.out.println(current);
	}

}
}
