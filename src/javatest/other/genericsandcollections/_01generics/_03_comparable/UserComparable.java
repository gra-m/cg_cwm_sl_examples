package javatest.other.genericsandcollections._01generics._03_comparable;

//07 always specify generic type argument <UserComparable>, otherwise comparison will @ Object level.
class UserComparable implements Comparable<UserComparable>{
	private int points;

	public UserComparable(int points) {
		this.points = points;
	}

@Override
public int compareTo(UserComparable other) {
	// region 08 COMPARETO LOGIC
	// if this < other return negative
	// if this == other return 0
	// if this > other return positive
	// endregion
	return points - other.points;
}
}
