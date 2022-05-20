package _03FocusArea.Generics._11InheritanceAndGenericClasses;

/**
 * Created by Gra_m on 2022 05 20
 */

public class Utils {

	public static <T extends Comparable<T>> T max(T first, T second) {
		// ;) replace with Math.max() call
		//return (first > second) ? first:second;
		// replace with compareTo
		return first.compareTo(second) < 0 ? second : first;
	}

	public static <K, V> void print(K key, V value){
		System.out.println(key + " = " + value);
	}

	public static void printUser(User user) {
		System.out.println("Printing user" + user);
	}

	//<?> creates a anon T under the hood a 'capture class'
	// To restrict to User or any of its subtypes: <? extends User>
	// Java compiler will create CAP#1 extends User to match
	public static void printListOfUsers(GenericList<? super User> users) {
		System.out.println(users);
		// cannot retrieve as User anymore, Java Compiler does not know if compatible:
		//User x = users.getByIndex(0);
	//Does know compatible with Object though
		Object x = users.getByIndex(0);

		// but we can now add to it:
		users.add(new Instructor(34));

	}

}
