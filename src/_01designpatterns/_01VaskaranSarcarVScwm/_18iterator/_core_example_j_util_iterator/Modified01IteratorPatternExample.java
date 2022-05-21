package _01designpatterns._01VaskaranSarcarVScwm._18iterator._core_example_j_util_iterator;


/**
 * Created by Gra_m on 2022 05 20
 *
 * This version using java.util.iterator interface, and casting to ArtsIterator in order to use additional methods:
 * first
 *
 **/

public class Modified01IteratorPatternExample {
	public static void main(String[] args) {
		System.out.println("***Iterator Pattern Example***");
		Subjects artsSubjects = new Arts();
		ArtsIterator iteratorForArts = (ArtsIterator) artsSubjects.createIterator();
		System.out.println("\n1. Arts subjects are as follows:");

		while (iteratorForArts.hasNext()) {
			System.out.println(iteratorForArts.next());
		}

		iteratorForArts.first();
		System.out.println("Resetting back to first, pointing to: " +
				iteratorForArts.currentItem());

	}
}
