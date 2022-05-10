package cg.interfaces;
/*
Buggy initializeIdAndName
1. Think about what is wrong with the program.
2. Implement the initializeIdAndName method in the User class.
3. The User class's initializeIdAndName method must return a User.
4. Correct the program so it compiles and runs.


Requirements:
1. The DBObject interface must declare, but not implement, the initializeIdAndName method.
2. Implement the initializeIdAndName method in the User class.
3. The User class's initializeIdAndName method must return a User.
4. The initializeIdAndName method must set the User object's id and name fields equal to the passed arguments and then return the object

package com.codegym.task.task13.task1306;

public class Solution {
public static void main(String[] args) throws Exception {
	System.out.println(Matrix.NEO);
	System.out.println(Matrix.TRINITY);
}

static class Matrix {
	public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
	public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
}

interface DBObject {
	DBObject initializeIdAndName(long id, String name) {

		this.id = id;
		this.name = name;
		return this;
	}
}

static class User implements DBObject {
	long id;
	String name;

	@Override
	public String toString() {
		return String.format("The user's name is %s, id = %d", name, id);
	}
}

}

 */

class _2aSolution {

	public static void main(String[] args) throws Exception {
		System.out.println(Matrix.NEO);
		System.out.println(Matrix.TRINITY);
	}

	static class Matrix {
		public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
		public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
	}

	interface DBObject {
		DBObject initializeIdAndName(long id, String name);
	}

	static class User implements DBObject {
		long id;
		String name;

		@Override
		public User initializeIdAndName(long id, String name) {
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
