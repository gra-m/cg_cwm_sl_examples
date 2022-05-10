package javatest.other.genericsandcollections._01generics._07wildcards;

class User implements Comparable<User> {
private int points;

public User(int points) {
	this.points = points;
}

@Override
public int compareTo(User other) {
	return points - other.points;
}

@Override
public String toString() {
	return "This User Comparable has " + this.points + " points.";
}
}
