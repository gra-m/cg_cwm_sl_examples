package _03FocusArea._03GenericSolution01;



/**
 * Created by Gra_m on 2022 05 18
 */

public class Main {
	public static void main(String[] args) {
		var list = new GenericList<String>(10);
		var list2 = new GenericList<Integer>(50);

		for(int i = 0; i < 50; i++)
			list2.add(i);

		//list.add(5); error now shows as checked exception

		System.out.println(list2);
		System.out.println(list2.getGenericArray().length);

		







	}
}
