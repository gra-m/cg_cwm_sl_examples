package javatest.other.genericsandcollections._01generics._03_comparable;

class GenericList <T extends Comparable> {
	private int count;
	//09 The constraint applied by Comparable interface means the below must hold any Comparable rather than any Object
	private T[] items = (T[]) new Comparable[10];

public T[] getItems() {
	return items;
}

public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}
}
