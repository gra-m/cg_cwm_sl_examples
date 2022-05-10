package javatest.other.other_oca;

import java.util.Arrays;

class MultiDimensionalArrays {

public static void main(String[] args) {
	String[][] rectangularMDA = new String[3][2];

	for(String[] s: rectangularMDA)
		for(int i = 0; i < s.length; i++){
			s[i] = "String" + i;
		}

	// There is no easy way to sort a multidim array in java
	// this is interesting link: https://www.java67.com/2014/08/4-examples-to-sort-array-in-java.html
	//Arrays.sort(rectangularMDA);

	// toString on MD doesn't seem to work:

	System.out.println("s.toString(): ");
	for(String[] s: rectangularMDA)
		System.out.println(s.toString());

	System.out.println("Print MDA with trad for loops:");

	for(int i = 0; i < rectangularMDA.length; i++) {
		for (int j = 0; j < rectangularMDA[i].length; j++)
			System.out.print(rectangularMDA[i][j] + " ");
		System.out.println();

	}


	System.out.println("Print MDA with hybrid");

	for(String[] s: rectangularMDA) {
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
		System.out.println();
	}


	System.out.println("Print with enhanced for loop");

	for(String[] inner: rectangularMDA) {
		for(String s: inner)
			System.out.print(s + " ");
		System.out.println();
	}

	System.out.println("\n\nMultiDimensional Arrays don't have to be rectangular\n" +
		                   "int[][] nonRectangularMDA = { {1,4,5,7}, {0}, {2,3,6}};\n" +
		                   "or\n" +
		                   "int [][] args = new int[4][];\n" +
		                   "args[0] = new int[5];\n" +
		                   "args[1] = new int[3];");



	int[][] nonRectangularMDA = { {1,4,5,7}, {0}, {2,3,6}};

	for(int[] inner: nonRectangularMDA){
		for(int i: inner)
			System.out.print(i + " ");
		System.out.println();
	}
}

}
