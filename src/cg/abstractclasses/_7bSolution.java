package cg.abstractclasses;

public class _7bSolution {

	public static void main(String[] args) {
		RussianTranslator russianTranslator = new RussianTranslator();
		System.out.println(russianTranslator.translate());
	}

	public static abstract class Translator {
		public abstract String getLanguage();

		public String translate() {
			return "I translate from " + getLanguage();
		}
	}

	public static class RussianTranslator extends Translator {

		@Override
		public String getLanguage() {
			return "Russian";
		}
	}
}

/*
Let's hire a translator
1. Create a RussianTranslator class that inherits the Translator class.
2. Implement all of the abstract methods.
3. Think about what the getLanguage method should return.
4. The program should display "I translate from Russian" when you call the translate method on a RussianTranslator object.


Requirements:
1. The RussianTranslator class must be inside the Solution class.
2. The RussianTranslator class must inherit the Translator class.
3. All the Translator class's inherited abstract methods must be implemented.
4. The getLanguage method must return a String that satisfies the task conditions.
5. The main method should display "I translate from Russian" when you call the translate method on a RussianTranslator object.

package com.codegym.task.task13.task1311;

//Let's hire a translator


public class Solution {
public static void main(String[] args) {
	RussianTranslator russianTranslator = new RussianTranslator();
	System.out.println(russianTranslator.translate());
}

public static abstract class Translator {
	public abstract String getLanguage();

	public String translate() {
		return "I translate from " + getLanguage();
	}
}

}

 */
