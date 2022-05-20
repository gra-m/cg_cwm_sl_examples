package _03FocusArea.Generics._06ConstrainingTypeParameters;

import java.util.Arrays;

/**
 * Created by Gra_m on 2022 05 18
 */

// Class Parameter Constraint: Type must extend Number
class GenericBoundList<T extends Number> {

	private T[] genericArray;

	private int count;

	public GenericBoundList(int startSize) {
		genericArray = (T[]) new Number[startSize];
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
