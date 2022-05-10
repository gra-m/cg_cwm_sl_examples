package cg.abstractclasses;

import java.awt.*;

class _9bSolution {

	public static void main(String[] args) throws Exception {
	}

	public interface Animal {
		Color getColor();
	}

	public static abstract class Fox implements Animal{
		public String getName() {
			return "Fox";
		}
	}
}

/*
A fox is an animal
1. Make the Fox class implement the Animal interface.
2. Edit the code so that the getName method is the only method in the Fox class.
3. Don't create additional classes or delete any methods!

Requirements:
1. The Fox class must implement the Animal interface.
2. The Fox class must only implement one method (getName).
3. The Animal interface must declare a getColor method.
4. Don't create additional classes or interfaces.

package com.codegym.task.task13.task1313;

import java.awt.*;

//A fox is an animal


public class Solution {
public static void main(String[] args) throws Exception {
}

public interface Animal {
	Color getColor();
}

public static class Fox {
	public String getName() {
		return "Fox";
	}
}
}
*/

