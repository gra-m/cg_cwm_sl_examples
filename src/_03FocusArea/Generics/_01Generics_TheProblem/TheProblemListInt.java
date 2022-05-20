package _03FocusArea.Generics._01Generics_TheProblem;

/**
 * Created by Gra_m on 2022 05 18
 */

public class TheProblemListInt {
	private int[] intArray;

	private int count;

	public TheProblemListInt(int startSize) {
		intArray = new int[startSize];
	}

	public void add(int addToArray) {
		intArray[count++] = addToArray;
	}

	public int getByIndex(int index) {
		try {
			if (index > count || index < 0)
				throw new IllegalArgumentException();
			else
				return intArray[index];
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public int[] getIntArray() {
		return intArray;
	}


	public int getCount() {
		return count;
	}
}
