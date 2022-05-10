package cg.inputoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _06SortEvenNumbersFromFile {

// use or create sort_even_numbers.txt with WriteToFileFromConsole

public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String inputFile = reader.readLine();
	Scanner scanner	= new Scanner(new FileInputStream(inputFile));
	List<Integer> evensOnly = new ArrayList<>();


	while(scanner.hasNext()) {
		int value = scanner.nextInt();
		if (value % 2 == 0) evensOnly.add(value);
	}

	Collections.sort(evensOnly);

	for (Integer integer: evensOnly)
		System.out.println(integer);


	scanner.close();
	reader.close();

}


}
