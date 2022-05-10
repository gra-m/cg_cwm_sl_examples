package javatest.other.genericsandcollections._01generics._02_constraints;

class AppClass {
public static void main(String[] args) {

	// var list = new GenericList<User>(); //05 user does not implement comparable
	var list = new GenericList<UserComparable>();
	list.add(new UserComparable());

	UserComparable userClassThatImplementsComparable = list.get(0);
}
}
