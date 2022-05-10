package cg.inputoutput;
//package com.codegym.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Static modifiers: part 2
1. In a static block, read two int variables A and B from the console.
2. Don't forget about the IOException that must be handled in the catch block.
3. Close the input stream with the close() method.


Requirements:
1. Field A must be public and static.
2. Field B must be public and static.
3. The program should read data from the keyboard in a static block.
4. The program must initialize the fields A and B in a static block using the values entered from the keyboard.
5. The program should display the minimum of the values ​​entered from the keyboard.


public class Solution {
    public static int A;
    public static int B;

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}

*/

public class _1515KbInputFromStaticBlock {
public static int A;
public static int B;

static {
	BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));

	try {
		A = Integer.parseInt(isr.readLine());
		B = Integer.parseInt(isr.readLine());
	} catch (IOException e) {
		e.printStackTrace();
	}


}

public static final int MIN = min(A, B);

public static void main(String[] args) {
	System.out.println(MIN);
}

public static int min(int a, int b) {
	return a < b ? a : b;
}
}