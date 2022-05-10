package javatest.other.genericsandcollections._01generics._02_constraints;
//04 <T extends Number>
// <T extends Comparable & Cloneable>
// are constraints == bound/ed type parameter

//06 if there are multiple constraints
// instead of <Object> in Bytecode Java will use leftmost one
// <T extends Comparable & Cloneable>
// This is called "TYPE ERASURE" meaning
// Java Compiler erases type parameter and replaces
// with class or interface dependent on the constraints.


class GenericList <T extends Comparable> {
	private int count;
	private T[] items = (T[]) new Object[10];

	public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}
}
