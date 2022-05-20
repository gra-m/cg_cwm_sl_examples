package _03FocusArea._06ConstrainingTypeParameters;


/**
 * Created by Gra_m on 2022 05 18
 */

public class Main {
	public static void main(String[] args) {
		var list2 = new GenericBoundList<Integer>(50);

		for(int i = 0; i < 50; i++)
			list2.add(i);

		//list.add(5); error now shows as checked exception

		System.out.println(list2);
		try {
			System.out.println(list2.getGenericArray().length);
		}catch(ClassCastException e) {
			System.out.println("ClassCastException caught here");
			e.printStackTrace();
		}finally {
			System.out.println("Getting array then length returned as an object instead:");
			System.out.println(list2.returnGenericArrayAsObjectArray().length);
		}

		







	}
}
