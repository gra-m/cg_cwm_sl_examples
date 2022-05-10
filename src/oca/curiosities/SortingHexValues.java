package oca.curiosities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingHexValues {
public static void main(String[] args) {
	int hexAsInt = 0x3A;
	int hexAsInt2 = 0xFF;



	List hex = Arrays.asList(30, 8, hexAsInt, hexAsInt2);
	Collections.sort(hex);

	System.out.println(hex);

	List theQuestionHex = Arrays.asList("30", "8", "3A", "3Z", "4D", "FF");
	Collections.sort(theQuestionHex);

	System.out.println(theQuestionHex);
}
}
