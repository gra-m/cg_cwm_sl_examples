package cg.abstractclasses;
import java.awt.*;

class _14bSolution {
public static void main(String[] args) throws Exception {
}
public interface Animal {
	Color getColor();
	Integer getAge();
}
public abstract static class Fox implements Animal{
	public String getName() {
		return "Fox";
	}
}
}

/*
1. Make Fox inherit the Animal interface.
2. Edit the code so that the getName method is the only method in the Fox class.
3. Don't delete any methods!
Requirements:

    •
    The Fox class must implement the Animal interface.
    •
    The Fox class must only implement one method (getName).
    •
    The Animal interface must declare a getColor method.
    •
    Don't create additional classes or interfaces.

    package com.codegym.task.task13.task1324;

import java.awt.*;

One method in a class

public class Solution {
public static void main(String[] args) throws Exception {
}

public interface Animal {
	Color getColor();

	Integer getAge();
}

public static class Fox {
	public String getName() {
		return "Fox";
	}
}
}

 */