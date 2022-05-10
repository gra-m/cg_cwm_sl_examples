package javatest.other.genericsandcollections._01generics._04generic_methods;

class UserComparable implements Comparable<UserComparable>{
	private int points;

	public UserComparable(int points) {
		this.points = points;
	}

@Override
public int compareTo(UserComparable other) {
	return points - other.points;
}

@Override
public String toString(){
		return "This User Comparable has " + this.points + " points.";
}
}
