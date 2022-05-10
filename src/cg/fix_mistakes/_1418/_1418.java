package cg.fix_mistakes._1418;

//region ORIGINAL

/*
package com.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

//Fix four mistakes

public class Solution {
public static void main(String[] args) {
	List<Number> list = new LinkedList<>();
	// 3
	list.add(new Double(1000f));
	list.add(new Double("123e-445632"));
	list.add(new Float(-90 / -3));
	list.remove(new Double("123e-445632"));

	// 4 - Correct 2 bugs
	for (int i = 0; i <= list.size(); i--) {
		System.out.println(list.get(i));
	}

	// 5
	for (Number object : list) {
		// Correct 2 bugs
		if (object instanceof Float) {
			Double a = (Double) object;
			System.out.println("Is float defined? " + !(a.isNaN()));
		} else if (object instanceof Double) {
			Float a = (Float) object;
			System.out.println("Is double infinite? " + a.isInfinite());
		}
	}
}
}
 */

// endregion

import java.util.LinkedList;
import java.util.List;

public class _1418 {

public static void main(String[] args) {

	List<Number> list = new LinkedList<>();
	initList(list);
	printListValues(list);
	processCastObjects(list);



}

static void initList(List<Number> list) {
	// 3
	list.add(new Double(1000f));
	list.add(new Double("123e-445632"));
	list.add(new Float(-90 / -3));
	list.remove(new Double("123e-445632"));
}

static void printListValues(List<Number> list){
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
}


static void processCastObjects(List<Number> list) {
	for (Number object : list) {
		if (object instanceof Float) {
			Float a = (Float) object;
			System.out.println("Is float defined? " + !(a.isNaN()) );
		} else if (object instanceof Double) {
			Double a = (Double) object;
			System.out.println("Is double infinite? " + a.isInfinite());
		}
	}
}


}
