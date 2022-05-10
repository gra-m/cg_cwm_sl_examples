package cg.type_casting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// region ORIGINAL
/*
package com.codegym.task.task14.task1404;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "feral":
                    cat = new MeanCat("Claws");
                    break;
                case "miss":
                    cat = new NiceCat("Missy");
                    break;
                case "smudge":
                    cat = new NiceCat("Smudgey");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "I'm " + getName() + ", an alley cat";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm " + getName() + ", and I'm going to claw your eyes out";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm a nice kitten named " + getName();
        }
    }
}



1. Read strings (parameters) from the console until the user enters an empty string (Enter).
2. Each parameter corresponds to the name of a cat.

For each parameter:
3. Create a Cat object equal to the cat from getCatByKey(String parameter).
4. Display the result of cat.toString().
Requirements:

    •
    The program must read data from the keyboard.
    •
    The program should stop reading data after an empty string is entered.
    •
    The program should display a description of each cat (cat.toString).
    •
    The program must use the getCatByKey method to create a Cat object for each cat name entered (each string read from the keyboard).
 */
// endregion
public class _02Cats {

public static void main(String[] args) throws Exception {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	boolean carryOn = true;
	String input = "";

	do {

		input = bufferedReader.readLine();
		if(!input.isEmpty())
			System.out.println(CatFactory.getCatByKey(input));
			else
				carryOn = false;

	}while(carryOn);

}

static class CatFactory {
	static Cat getCatByKey(String key) {
		Cat cat;
		switch (key) {
			case "feral":
				cat = new MeanCat("Claws");
				break;
			case "miss":
				cat = new NiceCat("Missy");
				break;
			case "smudge":
				cat = new NiceCat("Smudgey");
				break;
			default:
				cat = new Cat(key);
				break;
		}
		return cat;
	}
}

static class Cat {
	private String name;

	protected Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "I'm " + getName() + ", an alley cat";
	}
}

static class MeanCat extends Cat {
	MeanCat(String name) {
		super(name);
	}

	public String toString() {
		return "I'm " + getName() + ", and I'm going to claw your eyes out";
	}
}

static class NiceCat extends Cat {
	NiceCat(String name) {
		super(name);
	}

	public String toString() {
		return "I'm a nice kitten named " + getName();
	}
}
}

