package cg.inputoutput;

// region ORIGINAL
/*

Writing to a file from the console
1. Read a file name from the console.
2. Read lines from the console until the user enters the "exit".
3. Write all the entered lines to the file, each on a new line.


Requirements:
1. The program must read the file name from the console.
2. Create and use a BufferedWriter object.
3. The program should not read anything from the file system.
4. The program must read lines from the console until the user enters "exit".
5. The program must write absolutely all of the entered lines (including "exit") to the file, each on a new line.
6. The main method should close the BufferedWriter object after using it.




package com.codegym.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {
        // write your code here
    }
}

 */
// endregion

import java.io.*;

public class _05WriteToFileFromConsole {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String destinationFileName;

	destinationFileName = reader.readLine();

	BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));

	StringBuilder holdInput	= new StringBuilder();
	String input = "";

	while(!input.equals("exit")) {
		input = reader.readLine();
		holdInput.append(input + "\n");
	}

	int deleteFrom = holdInput.lastIndexOf("exit");
	holdInput.delete(deleteFrom,holdInput.length());
	writer.write(holdInput.toString());
	writer.close();
}

}
