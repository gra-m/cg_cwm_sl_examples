package javatest.other.genericsandcollections._02collections._04_comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortingWithComparatorApp {
public static void main(String[] args) {

	List<CustomerDifferentNotUsed> nonComparables = new ArrayList<>();
	Collections.addAll(nonComparables,
		new CustomerDifferentNotUsed("Allen", "Wensleydale@email.com"),
		new CustomerDifferentNotUsed("Cearl", "Blogger@email.com"),
		new CustomerDifferentNotUsed("Binger", "HotFrot@email.com"));

	// Collections.sort(nonComparables); // does not implement Comparable interface.

// ISSUE, the sort is only implemented on Name, what if changes in the future?
	List<Customer> customers = new ArrayList<>();
	Collections.addAll(customers,
		new Customer("AllenA", "e3"),
		new Customer("CearlC", "e2"),
		new Customer("BingerB", "e1"));

 Collections.sort(customers);

	System.out.println(customers);

	Collections.sort(customers, new EmailComparator());
	System.out.println(customers);
}
}
