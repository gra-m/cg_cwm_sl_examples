package _03FocusArea.Generics._09GenericUtilityMethods;


/**
 * Created by Gra_m on 2022 05 18
 */

public class Main {
	public static void main(String[] args) {
		var max = Utils.max(46, 45);

		System.out.println(max);

		var maxUser = Utils.max(new User(10), new User(20));

		System.out.println(maxUser.toString());

	}
}
