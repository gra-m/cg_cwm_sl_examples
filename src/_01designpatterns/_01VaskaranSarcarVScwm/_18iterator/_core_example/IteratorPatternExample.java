package _01designpatterns._01VaskaranSarcarVScwm._18iterator._core_example;

/**
 * Created by Gra_m on 2022 05 20
 *
 * GOF:
 * Provide a way to access the elements or an aggregate object sequentially without exposing its underlying representation.
 *
 * IN A NUTSHELL: Enable a client object to traverse a collection of objects from an encapsulated source providing
 * a universal api whatever the type of object collection/container.
 *  -> Used to traverse the nodes of a tree-like structure -> iterator with composite pattern
 *  -> Not just for traversing, iterator can support various requirements.
 *  -> Traversal mechanism is encapsulated
 *
 *  REALWoRLD:
 *  Company A ArrayList of company records : Company B LinkedList of company records
 *                                         : == iterator pattern to transfer
 *
 *  Company A show us those that fit this criteria : Company List of company records
 *										           : == iterator pattern to transfer
 *
 **/

public class IteratorPatternExample {
	public static void main(String[] args) {
		System.out.println("***Iterator Pattern Example***");
		Subjects artsSubjects = new Arts();
		Iterator iteratorForArts = artsSubjects.createIterator();
		System.out.println("\n1. Arts subjects are as follows:");

		while (iteratorForArts.hasNext()) {
			System.out.println(iteratorForArts.next());
		}

		iteratorForArts.first();
		System.out.println("Resetting back to first, pointing to: " +
				iteratorForArts.currentItem());

	}
}
