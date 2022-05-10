package cg.abstractclasses;

class _8bSolution {

	public static void main(String[] args) {
		Translator translator = new Translator();
		System.out.println(translator.translate());
	}

	public static class Translator {
		public String translate() {
			return "I translate from Russian";
		}
	}
}

/*
Fix the code so that the program runs and displays "I translate from Russian".
Don't change the main method!
Requirements:

    •
    The program should display "I translate from Russian".
    •
    The translate method should return "I translate from Russian".
    •
    The program must run without errors.
    •
    The main method must display the result of calling the Translator object's translate method.

    package com.codegym.task.task13.task1312;

//Code doesn't fix itself


public class Solution {
public static void main(String[] args) {
	Translator translator = new Translator();
	System.out.println(translator.translate());
}

public abstract static class Translator {
	public String translate() {
		return "I translate from Russian";
	}
}


}

 */

