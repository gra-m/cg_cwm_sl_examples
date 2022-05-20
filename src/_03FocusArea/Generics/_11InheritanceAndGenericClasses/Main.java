package _03FocusArea.Generics._11InheritanceAndGenericClasses;


/**
 * Created by Gra_m on 2022 05 20
 */

public class Main {
	public static void main(String[] args) {

		User user = new Instructor(13);

		Utils.printUser(user);

		// Object and super so we can add to list in printListOfUsers method.
		var users = new GenericList<Object>(10);

		Utils.printListOfUsers(users);




	}
}
