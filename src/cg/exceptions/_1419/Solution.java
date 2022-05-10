package cg.exceptions._1419;

//region ORIGINAL

/*
package com.codegym.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

//Exception invasion


import java.util.ArrayList;
import java.util.List;

public class Solution {
public static List<Exception> exceptions = new ArrayList<Exception>();

public static void main(String[] args) {
	initExceptions();

	for (Exception exception : exceptions) {
		System.out.println(exception);
	}
}

private static void initExceptions() {   // The first exception
	try {
		float i = 1 / 0;

	} catch (Exception e) {
		exceptions.add(e);
	}

	//write your code here

}
}

 */
//endregion

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
public static List<Exception> exceptions = new ArrayList<Exception>();

public static void main(String[] args) {
	initExceptions();

	for (Exception exception : exceptions) {
		System.out.println(exception);
	}
}

private static void initExceptions() {
	try {
		float i = 1 / 0;

	} catch (Exception e) {
		exceptions.add(e);
	}

	try {
		int[] intArray = {0,1,2,3,4};
		int outOfBounds = intArray[5];

	} catch (Exception e) {
		exceptions.add(e);
	}

	try {
		String fileName = "doesNotExist";
		InputStream inputStream = new FileInputStream("src/inputOutputFiles/" + fileName);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

	} catch (Exception e) {
		exceptions.add(e);
	}

	try {

		List names = new ArrayList<String>();

		names.add("Herbert");
		names.add("Cyril");

		System.out.println(names);

		Iterator namesIterator = names.iterator();

		while(namesIterator.hasNext()) {
			namesIterator.remove();
		}




	} catch (Exception e) {
		exceptions.add(e);
	}

	try {
		List<String> names1 = new ArrayList<String>();

		names1.add("Herbert");
		names1.add("Cyril");

		System.out.println(names1);

		List<String> namesPlus =  names1.stream().map(name -> name + " stream n collect ").collect(Collectors.toList());

		System.out.println("namesPlus is " + namesPlus);

		List<String> beginWithC = names1.stream().filter(name -> name.startsWith("C")).collect(Collectors.toList());

		System.out.println("Begin with C " + beginWithC);


	} catch (Exception e) {
		exceptions.add(e);
	}

	try {
		final Long value = 32412341234L;
		//String classCastException = (String) value; // May as well be checked in ide

	} catch (Exception e) {
		exceptions.add(e);
	}
	try {
		LocalDate localDate = LocalDate.now().plusDays(3) ;
		validDate(localDate);



	} catch (Exception e) {
		exceptions.add(e);
	}
	try {

	} catch (Exception e) {
		exceptions.add(e);
	}
	try {

	} catch (Exception e) {
		exceptions.add(e);
	}

}

public static void validDate(LocalDate localDate) throws IllegalArgumentException {
	if (localDate.isAfter(LocalDate.now()))
		throw new IllegalArgumentException("localDate " + localDate + " cannot be in the future");

}
}
