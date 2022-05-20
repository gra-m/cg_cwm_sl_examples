package _03FocusArea._03GenericSolution01;

import java.util.Arrays;

/**
 * Created by Gra_m on 2022 05 18
 */

public class GenericList<T> {

	private T[] genericArray;

	private int count;

	public GenericList(int startSize) {
		genericArray = (T[]) new Object[startSize];
	}

	public void add(T addToArray) {
		genericArray[count++] = addToArray;
	}

	public T getByIndex(int index) {
		try {
			if (index > count || index < 0)
				throw new IllegalArgumentException();
			else
				return genericArray[index];
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}

	//public T[] causes ClassCastException
	public T[] getGenericArray() {
		return genericArray;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "GenericList{" +
				"genericArray=" + Arrays.toString(genericArray) +
				'}';
	}

	public Object[] returnGenericArrayAsObjectArray() {
		return genericArray;
	}
}
