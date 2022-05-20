package _03FocusArea.Generics._11InheritanceAndGenericClasses;


/**
 * Created by Gra_m on 2022 05 20
 */

public class Main {
	public static void main(String[] args) {

		User user = new Instructor(13);

		Utils.printUser(user);

		//This is a problem because GenericList<Instructor> is not a subclass of GenericList<User>
		// there is only GenericList<User>.
		var users = new GenericList<Instructor>(10);

		Utils.printListOfUsers(users);




	}
}
