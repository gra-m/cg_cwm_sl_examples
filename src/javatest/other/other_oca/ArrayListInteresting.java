package javatest.other.other_oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListInteresting {
public static void main(String[] args) {

	System.out.println("Create a quick List:\nList<String> list = Arrays.asList(\"one\", \"two\", \"three\", \"four\");");

	List<String> list = Arrays.asList("one", "two", "three", "four");
	System.out.println(list);

	System.out.println("\nConvert from ArrayList to Array:");

	ArrayList<String> list1 = new ArrayList<>(list);

	System.out.println("Array List: " + list1);

	System.out.println("\nString[] stringArray = list1.toArray(new String[0]);");

	String[] stringArray = list1.toArray(new String[0]);


	System.out.println("\nConvert from Array to List:\nList<String> list2 = Arrays.asList(stringArray);");

	List<String> list2 = Arrays.asList(stringArray);

	System.out.println("\nList and array stay linked! Have same source, changed contents reflected in both\n" +
		                   "\nCannot change size of list.");




}


}
