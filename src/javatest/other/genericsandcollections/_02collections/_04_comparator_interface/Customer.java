package javatest.other.genericsandcollections._02collections._04_comparator_interface;

class Customer implements Comparable<Customer>{
private String name;
private String email;
private static final String E_MAIL = "DefaultEmail@company.com";

public Customer(String name, String email) {
	this.name = name;
	this.email = email;
}

public Customer() {
	this("NoParamMadeMe");
}

public Customer(String name) {
	this.name = name;
	this.email = E_MAIL;
}

@Override
public int compareTo(Customer other) {
	return this.name.compareTo(other.name);
}

@Override
public String toString(){
	return "\n" + this.name + " " + this.email;
}

public String getEmail() {
	return email;
}
}
