package _03FocusArea.Generics._02BadSolution01;


/**
 * Created by Gra_m on 2022 05 18
 */

public class Main {
	public static void main(String[] args) {
		var list = new TheTooGenericList(10);
		System.out.println(list.getAnyObjectArray().length);


		list.add(5);
		list.add("hello");

		System.out.println(list.getAnyObjectArray());



	}
}
