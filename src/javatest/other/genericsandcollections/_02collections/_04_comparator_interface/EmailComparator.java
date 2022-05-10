package javatest.other.genericsandcollections._02collections._04_comparator_interface;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {

@Override
public int compare(Customer o1, Customer o2) {
	return o1.getEmail().compareTo(o2.getEmail());

}
}
