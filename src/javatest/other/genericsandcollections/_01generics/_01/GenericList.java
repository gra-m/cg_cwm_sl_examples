package javatest.other.genericsandcollections._01generics._01;

class GenericList <T> {
	private int count;
	//private T[] items = new T[10]; //01 fails cos compiler does not know T
	private T[] items = (T[]) new Object[10]; //02 so cast it to T[] but this is unchecked

	public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}
}
