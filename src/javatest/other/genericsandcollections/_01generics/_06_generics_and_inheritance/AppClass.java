package javatest.other.genericsandcollections._01generics._06_generics_and_inheritance;

class AppClass {
public static void main(String[] args) {
	User user = new User(20);
	User user1 = new Instructor(50);

	Utils.print(user);
	Utils.print(user1);

	var users = new GenericList<User>();
	var instructors = new GenericList<Instructor>();

	//OK
	Utils.printUsers(users);
	//14 ERROR! Because GenericList<Instructor> is not a subtype of GenericList<User>
	//Utils.printUsers(instructors);

	//14a Without using WILDCARDS we would have to loop through
	// and convert all of our Instructors to Users before passing to
	// Utils.printUsers()









}
}
