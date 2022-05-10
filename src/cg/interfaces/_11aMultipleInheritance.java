package cg.interfaces;

class _11aMultipleInheritance {

	public static void main(String[] args) {
	}
	public interface CanMove {
		void move();
	}
	public interface Edible {
		void beEaten();
	}
	public interface CanEat {
		void eat();
	}
	public static class Dog implements CanMove, CanEat {
		public void move(){};
		public void eat(){};
	}
	public static class Cat implements CanMove, CanEat, Edible {
		public void move(){};
		public void eat(){};
		public void beEaten(){};
	}
	public static class Mouse implements CanMove, Edible {
		public void move(){};
		public void beEaten(){};
	}
}

/*
1. Create Dog, Cat, and Mouse classes.
2. Implement interfaces for the added classes, considering the following:
- A cat can move, can eat someone, and can be eaten.
- A mouse can move and be eaten.
- A dog can move and eat someone.
Requirements:

    •
    The Cat class must be inside the Solution class.
    •
    The Dog class must be inside the Solution class.
    •
    The Mouse class must be inside the Solution class.
    •
    A cat can move, can eat someone, and can be eaten.
    •
    A mouse can move and be eaten.
    •
    A dog can move and eat someone.

package com.codegym.task.task13.task1315;

//Tom, Jerry and Spike


public class Solution {
public static void main(String[] args) {

}

// Can move
public interface CanMove {
	void move();
}

// Can be eaten
public interface Edible {
	void beEaten();
}

// Can eat
public interface CanEat {
	void eat();
}
}

 */
