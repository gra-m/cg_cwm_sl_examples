package _03FocusArea.Generics._01Generics_TheProblem;

/**
 * Created by Gra_m on 2022 05 18
 */

class TheProblemListUser {
	int startSize;
	private User[] userArray = new User[startSize];
	private int count;

	public TheProblemListUser(int startSize) {
		this.startSize = startSize;
	}

	public void add(User addToArray) {
		userArray[count++] = addToArray;
	}

	public User getByIndex(int index) {
		try {
			if (index > count || index < 0)
				throw new IllegalArgumentException();
			else
				return userArray[index];
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}

	public User[] getIntArray() {
		return userArray;
	}

	public int getStartSize() {
		return startSize;
	}

	public int getCount() {
		return count;
	}
}
