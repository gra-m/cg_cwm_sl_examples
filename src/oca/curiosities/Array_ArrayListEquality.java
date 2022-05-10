package oca.curiosities;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ArrayListEquality {
public static void main(String[] args) {
	ArrayList<Integer> integerArrayList = new ArrayList<>();
	integerArrayList.add(1);
	integerArrayList.add(2);
	ArrayList<Integer> integerArrayList1 = new ArrayList<>();
	integerArrayList1.add(1);
	integerArrayList1.add(2);
	int[] intArray = new int[]{1, 2, 3, 4};
	int[] intArray1 = new int[]{1, 2, 3, 4};

	if (integerArrayList.equals(integerArrayList1))
	System.out.println("OK Array List Content same");

	if (integerArrayList == integerArrayList1)
	System.out.println("They are the same object");

	if (intArray.equals(intArray1))
		System.out.println("This will never print");
	System.out.println("An array does not override equals() for content like ArrayList does, you have to use Arrays.equals");

	if (Arrays.equals(intArray, intArray1)) // To compare content of two arrays: Use static Arrays.equals(array1, array2) method.
		System.out.println("When you do: OK Array content same");

	intArray = intArray1;

	if (intArray == intArray1)
		System.out.println("Because you just made them the same object");

// ArrayList java does not know empty until runtime so this will compile but error:

ArrayList<Integer> empty = new ArrayList<>();
empty.remove(0); // runtime IndexOutOfBoundsException

}
}
