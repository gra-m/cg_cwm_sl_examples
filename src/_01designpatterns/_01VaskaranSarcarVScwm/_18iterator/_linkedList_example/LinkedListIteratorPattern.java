package _01designpatterns._01VaskaranSarcarVScwm._18iterator._linkedList_example;

/**
 * Created by Gra_m on 2022 05 21
 */

public class LinkedListIteratorPattern {
	public static void main(String[] args) {
		System.out.println("***Modified Iterator Pattern with LinkedList***");

		Database employeeList = new EmployeeDatabase();
		EmployeeIterator iteratorForEmployee = employeeList.createIterator();

		System.out.println("\n -----Employee details are as follows-----\n");

		while (iteratorForEmployee.hasNext())
		{
			System.out.println();
			System.out.println(iteratorForEmployee.next());
		}
	}
}
