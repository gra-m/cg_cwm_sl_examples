package oca.curiosities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchAndSort {
public static void main(String[] args) {
	List hex = Arrays.asList("30", "8", "3A", "FF");

	Collections.sort(hex);
	System.out.println("Numbers sort before letters and Strings sort alphabetically so:\n 30, 8 , 3A, FF becomes:\n" + hex);

	int x = Collections.binarySearch(hex, "8");
	int y = Collections.binarySearch(hex, "3A");
	int z = Collections.binarySearch(hex, "4F");
	System.out.println(x + " " + y +  " " + z);

}
}
