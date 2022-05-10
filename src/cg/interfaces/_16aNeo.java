package cg.interfaces;

// region BRIEF

/*
Neo
1. Implement the DBObject interface in the User class.
2. Implement the initializeIdAndName method so that the program runs and displays "The user's name is Neo, id = 1".
3. Don't change the toString and main methods.
4. Think about what the User class's initializeIdAndName method should return.


Requirements:
1. The User class must implement the DBObject interface.
2. The initializeIdAndName method must return a valid User object, specifically, the object on which the method was called (this).
3. The initializeIdAndName method must set the id and name fields using the arguments passed to it.
4. The program must display the following: "The user's name is Neo, id = 1".
5. Don't change the toString method.
6. Don't change the main method


 */

// endregion

//region ORIGINAL CODE

/*
package com.codegym.task.task13.task1320;


public class Solution {
public static void main(String[] args) throws Exception {
	System.out.println(Matrix.NEO);
}

static class Matrix {
	public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
}

interface DBObject {
	DBObject initializeIdAndName(long id, String name);
}

static class User {
	long id;
	String name;

	@Override
	public String toString() {
		return String.format("The user's name is %s, id = %d", name, id);
	}
}
}

 */

// endregion


public class _16aNeo {
public static void main(String[] args) throws Exception {
	System.out.println(Matrix.NEO);
}
static class Matrix {
	public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
}
interface DBObject{
	DBObject initializeIdAndName(long id, String name);
}
static class User implements DBObject {
	long id;
	String name;

	@Override
	public User initializeIdAndName(long id, String name)	{
		this.id = id;
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return String.format("The user's name is %s, id = %d", name, id);
	}

}
}
