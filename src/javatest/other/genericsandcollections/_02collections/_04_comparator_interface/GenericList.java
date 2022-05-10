package javatest.other.genericsandcollections._02collections._04_comparator_interface;

import java.util.Iterator;

class GenericList<T extends Comparable> implements Iterable{
	private int count;
	public T[] items = (T[]) new Comparable[10];  // D. now change this to Array list only place change == in B:

public T[] getItems() {
	return items;
}

public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}


	// A. We use a nested class to implement the iterator method
@Override
public Iterator iterator() {
	return new ListIterator(this); //C. create iterator passing this WithIterableGenericList
}

// B. In this way the  implementation is hidden.
private class ListIterator implements Iterator<T> {
	private GenericList<T> list;
	private int index;

	public ListIterator(GenericList<T> list){
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return (index < list.count);
	}

	@Override
	public T next() {
		return list.items[index++];
	}
}

}
