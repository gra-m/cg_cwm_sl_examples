package _03FocusArea.Generics._02BadSolution01;

/**
 * Created by Gra_m on 2022 05 18
 */

class TheTooGenericList {
	private Object[] anyObjectArray;

	private int count;

	public TheTooGenericList(int startSize) {
		anyObjectArray = new Object[startSize];
	}

	public void add(Object addToArray) {
		anyObjectArray[count++] = addToArray;
	}

	public Object getByIndex(int index) {
		try {
			if (index > count || index < 0)
				throw new IllegalArgumentException();
			else
				return anyObjectArray[index];
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public Object[] getAnyObjectArray() {
		return anyObjectArray;
	}

	public int getCount() {
		return count;
	}
}
