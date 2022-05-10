package javatest.other.genericsandcollections._01generics._07wildcards;

class AppClass {
public static void main(String[] args) {
	User user = new User(20);
	User user1 = new Instructor(50);

	Utils.print(user);
	Utils.print(user1);

	var users = new GenericList<User>();
	var instructors = new GenericList<Instructor>();

	//Utils.printUsers(users);











}
}
