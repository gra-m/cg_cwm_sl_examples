package cg.threads._17._02_WithoutSynchronised;

// region Original
/*
1. Understand what we're dealing with and how it works.
2. Create a public static SortThread class, whose run method uses the sort method to sort the static array testArray.
Requirements:

    •
    The Solution class must contain the public static SortThread class.
    •
    The SortThread class must be a thread.
    •
    The SortThread class's run method must call the sort() method, passing testArray as an argument.
    •
    The program should display text on the screen.
//////////////////////////////

package com.codegym.task.task17.task1702;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public static int threadCount = 10;
public static int[] testArray = new int[1000];

static {
	for (int i = 0; i < Solution.testArray.length; i++) {
		testArray[i] = i;
	}
}

public static void main(String[] args) throws InterruptedException {
	StringBuffer expectedResult = new StringBuffer();
	for (int i = 1000 - 1; i >= 0; i--) {
		expectedResult.append(i).append(" ");
	}

	initThreads();

	StringBuffer result = new StringBuffer();
	for (int i = 0; i < testArray.length; i++) {
		result.append(testArray[i]).append(" ");
	}
	System.out.println(result);
	System.out.println((result.toString()).equals(expectedResult.toString()));
}

public static void initThreads() throws InterruptedException {
	List<Thread> threads = new ArrayList<Thread>(threadCount);
	for (int i = 0; i < threadCount; i++) threads.add(new SortThread());
	for (Thread thread : threads) thread.start();
	for (Thread thread : threads) thread.join();
}

public static void sort(int[] array) {
	for (int i = 0; i < array.length - 1; i++) {
		for (int j = i + 1; j < array.length; j++) {
			if (array[i] < array[j]) {
				int k = array[i];
				array[i] = array[j];
				array[j] = k;
			}
		}
	}
}
}




*/
// endregion

import java.util.ArrayList;
import java.util.List;

public class Solution {

public static int threadCount = 10;
public static int[] testArray = new int[1000];

static {
	for (int i = 0; i < Solution.testArray.length; i++) {
		testArray[i] = i;
	}
}

public static void main(String[] args) throws InterruptedException {
	StringBuffer expectedResult = new StringBuffer();
	for (int i = 1000 - 1; i >= 0; i--) {
		expectedResult.append(i).append(" ");
	}

	initThreads();

	StringBuffer result = new StringBuffer();
	for (int i = 0; i < testArray.length; i++) {
		result.append(testArray[i]).append(" ");
	}
	System.out.println(result);
	System.out.println((result.toString()).equals(expectedResult.toString()));
}

public static void initThreads() throws InterruptedException {
	List<Thread> threads = new ArrayList<Thread>(threadCount);
	for (int i = 0; i < threadCount; i++) threads.add(new SortThread());
	for (Thread thread : threads) thread.start();
	for (Thread thread : threads) thread.join();
}

public static void sort(int[] array) {
	for (int i = 0; i < array.length - 1; i++) {
		for (int j = i + 1; j < array.length; j++) {
			if (array[i] < array[j]) {
				int k = array[i];
				array[i] = array[j];
				array[j] = k;
			}
		}
	}
}

public static class SortThread extends Thread {

	public void run() {
		sort(testArray);

	}
}




}

