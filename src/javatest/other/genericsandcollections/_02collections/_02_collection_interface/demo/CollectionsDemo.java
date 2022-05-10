package javatest.other.genericsandcollections._02collections._02_collection_interface.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

public static void showCollectionInterfaceWithArrayList() {
	System.out.println("______________________Collection<String> collection = new ArrayList<>();___________");
	Collection<String> collection = new ArrayList<>();
	collection.add("a");
	collection.add("b");
	collection.add("c");
	System.out.println(collection);
	Collections.addAll(collection,"a", "b", "c"); // Collections = utility class
	System.out.println(collection);
	System.out.println("The size of collection is: " + collection.size());
	collection.remove("a");
	System.out.println("collection.remove(\"a\") : " + collection);
	System.out.println("collection.contains(\"a\"): " + collection.contains("a"));
	collection.clear();
	System.out.println("collection.clear() " + collection);

	// add stuff back into it:
	Collections.addAll(collection,"a", "b", "c", "x", "y" , "z"); // Collections = utility class
	var strings = new String[0]; // creates matching capacity.
	System.out.println("collection.toArray(strings); "
		                   + collection.toArray(strings));

	Collection<String> collection1 = new ArrayList<>();
	Collection<String> other = new ArrayList<>();
	Collections.addAll(collection1,"a", "b", "c", "x", "y" , "z");
	other.addAll(collection1);

	System.out.println("collection == other = false as diff objects " + (collection1 == other));

	System.out.println("collection.equals(other) = true as same content  " + (collection1.equals(other)));




}


public static void showListInterfaceWithArrayList() {

	System.out.println("______________________List<String> list = new ArrayList<>();___________");
	List<String> list = new ArrayList<>();
	Collections.addAll(list, "a", "b", "c", "d", "x", "y", "z");

	System.out.println("list.indexOf(\"x\") : " + list.indexOf("x"));
	list.set(0, list.get(0) +list.indexOf("x"));
	System.out.println("list.set(0, list.get(0) +list.indexOf(\"x\")); : " + list.get(0));
	list.remove(0);
	System.out.println("list.remove(0)); " + list);
	System.out.println("list.subList(4,list.size()-1)" + list.subList(3,list.size()));
}





}
