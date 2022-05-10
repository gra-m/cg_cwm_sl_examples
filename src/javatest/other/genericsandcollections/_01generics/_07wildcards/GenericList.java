package javatest.other.genericsandcollections._01generics._07wildcards;

class GenericList <T extends Comparable> {
	private int count;
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
