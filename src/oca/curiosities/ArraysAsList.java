package oca.curiosities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

class ArraysAsList {
public static void main(String[] args) {
	String names[] = {"Tom", "Dick", "Harry"};
	// incorrect List list = names.asList();
	List list = Arrays.asList(names);
	list.set(0, "Sue");
	System.out.println("The original array and the Arrays.asList are the same object:\n" + names[0]);

	int a = names.length;
	int b = list.size();




}
}
