package _03FocusArea.Generics._08ComparableInterface;


/**
 * Created by Gra_m on 2022 05 18
 */

public class Main {
	public static void main(String[] args) {
		User user1 = new User(10);
		User user2 = new User(20);

		System.out.println(user1.compareTo(user2));

		if(user1.compareTo(user2) == 0)
			System.out.println("They are equal");
		else if(user1.compareTo(user2) > 0)
			System.out.println("user1 greater than user2");
		else
			System.out.println("user1 less than user2");
		}
	}
