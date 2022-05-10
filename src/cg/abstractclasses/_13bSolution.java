package cg.abstractclasses;

import java.awt.*;

class _13bSolution {

public static void main(String[] args) throws Exception {
	Fox bigFox = new BigFox();
	System.out.println(bigFox.getName());
	System.out.println(bigFox.getColor());
}

public interface Animal {
	Color getColor();
}

public static abstract class Fox implements Animal {
	public String getName() {
		return "Fox";
	}
}

public static class BigFox extends Fox {
	public Color getColor() {
		return Color.GRAY;
	}
}
}

/*
1. Fix the Fox and BigFox classes so that the program compiles.
This task does not involve creating instances of the base class.
2. Don't change the main method.
Requirements:

    •
    The Fox class must implement the Animal interface.
    •
    The Fox class must only implement one method (getName).
    •
    The Animal interface must declare a getColor method.
    •
    The BigFox class must inherit the Fox class.
    •
    The Fox class must be abstract.
    /////////////////////////////
package com.codegym.task.task13.task1325;

import java.awt.*;

Compiling the program



    public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public abstract static class BigFox {

    }

}
 */

