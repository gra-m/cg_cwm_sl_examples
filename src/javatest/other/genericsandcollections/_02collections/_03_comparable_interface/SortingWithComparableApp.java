package javatest.other.genericsandcollections._02collections._03_comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortingWithComparableApp {
public static void main(String[] args) {

	List<CustomerNonComparable> nonComparables = new ArrayList<>();
	Collections.addAll(nonComparables,
		new CustomerNonComparable("Allen"),
		new CustomerNonComparable("Cearl"),
		new CustomerNonComparable("Binger"));

	// Collections.sort(nonComparables); // does not implement Comparable interface.

// ISSUE, the sort is only implemented on Name, what if changes in the future?
	List<Customer> customers = new ArrayList<>();
	Collections.addAll(customers,
		new Customer("AllenA"),
		new Customer("CearlC"),
		new Customer("BingerB"));

 Collections.sort(customers);

	System.out.println(customers);
}
}
