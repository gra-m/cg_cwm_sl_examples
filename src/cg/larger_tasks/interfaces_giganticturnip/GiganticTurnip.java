package cg.larger_tasks.interfaces_giganticturnip;

import java.util.ArrayList;
import java.util.List;

class GiganticTurnip {
public static void main(String[] args) {
	List<Person> plot = new ArrayList<>();
	plot.add(new Person("Turnip"));
	plot.add(new Person("Grandpa"));
	plot.add(new Person("Grandma"));
	plot.add(new Person("Granddaughter"));
	TurnipStory.tell(plot);
}
}

/*

The Gigantic Turnip:
1. Make the Person class implement the TurnipItem interface.
2. Implement the pull(Person person) method in the Person class so that it displays a phrase like '<name> behind <person>'.

Example:
Grandma behind Grandpa
Grandpa behind Turnip

3. Fix the bug in the logic of the loop in the TurnipStory class's tell method.
4. Run the main method and enjoy the story!
Requirements:

    •
    The Person class must implement the TurnipItem interface.
    •
    The Person class must have a pull method with one Person parameter.
    •
    The Person class's pull method must display a phrase like '<name> behind <person>'. For example: Grandma behind Grandpa.
    •
    The main method should display a condensed version of The Gigantic Turnip on the screen.
package com.codegym.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

//Turnip


public class Solution {
public static void main(String[] args) {
	List<Person> plot = new ArrayList<>();
	plot.add(new Person("Turnip"));
	plot.add(new Person("Grandpa"));
	plot.add(new Person("Grandma"));
	plot.add(new Person("Granddaughter"));
	TurnipStory.tell(plot);
}
}
 */