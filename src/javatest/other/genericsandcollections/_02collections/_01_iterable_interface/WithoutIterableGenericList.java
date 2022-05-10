package javatest.other.genericsandcollections._02collections._01_iterable_interface;

class WithoutIterableGenericList<T extends Comparable> {
	private int count;
	public T[] items = (T[]) new Comparable[10];

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
