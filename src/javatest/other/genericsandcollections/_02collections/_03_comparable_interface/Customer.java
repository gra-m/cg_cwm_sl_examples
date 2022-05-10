package javatest.other.genericsandcollections._02collections._03_comparable_interface;

class Customer implements Comparable<Customer>{
private String name;

public Customer(String name) {
	this.name = name;
}

@Override
public int compareTo(Customer other) {
	//this < other return -
	//this == other return 0
	//this > other return +
	return this.name.compareTo(other.name);
}

@Override
public String toString(){
	return this.name;
}

}
