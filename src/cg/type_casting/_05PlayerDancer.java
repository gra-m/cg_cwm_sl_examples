package cg.type_casting;


// region ORIGINAL
/*
Player and Dancer
1. Think about what the program is doing.
2. Change the haveFun method so that it calls:
- the play method if the person is a Player.
- the dance method if the person is a Dancer.


Requirements:
1. The Player class must implement the Person interface.
2. The Dancer class must implement the Person interface.
3. The haveFun method should call the play method if the passed object is a Player.
4. The haveFun method should call the dance method if the passed object is a Dancer.
5. The main method must read data from the keyboard.
6. The main method should stop reading data from the keyboard if the input string is "exit".





////////////////////
package com.codegym.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        //write your code here
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
 */
// endregion

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _05PlayerDancer {
public static void main(String[] args) throws Exception {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	Person person = null;
	String key;
	while (!(key = reader.readLine()).equals("exit")) {
		if ("player".equals(key)) {
			person = new Player();
		} else if ("dancer".equals(key)) {
			person = new Dancer();
		}
		haveFun(person);
	}
}

public static void haveFun(Person person) {
	if(person instanceof Player)
		((Player) person).play();
	else
		((Dancer) person).dance();
}

interface Person {
}

static class Player implements Person {
	void play() {
		System.out.println("playing");
	}
}

static class Dancer implements Person {
	void dance() {
		System.out.println("dancing");
	}
}
}
