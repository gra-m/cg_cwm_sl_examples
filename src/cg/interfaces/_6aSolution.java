package cg.interfaces;

class _6aSolution {

	public static void main(String[] args) {
	}

	interface Person {
		void use(Person person);

		void startToWork();
	}

	interface HasManagementPotential {
		boolean inspiresOthersToWork();
	}

	interface Secretary extends Person {
	}

	interface Boss extends Person, HasManagementPotential{
	}

	class Manager implements Boss {
		public void use(Person person) {
			person.startToWork();
		}

		public void startToWork() {
		}

		public boolean inspiresOthersToWork() {
			return true;
		}
	}

	class Subordinate implements Secretary{
		public void use(Person person) {
		}

		public void startToWork() {
		}
	}
}

// Original
/*
Who's that smarty?
1. Add the Secretary and Boss interfaces to the Manager and Subordinate classes. One interface for each class. Think about which interface should go to each class.
2. Make the Secretary and Boss interfaces inherit the Person and HasManagementPotential interfaces so
that all of the methods in the Manager and Subordinate classes are declared in one of the interfaces.


Requirements:
1. The Manager class must implement the appropriate interface (Secretary or Boss).
2. The Subordinate class must implement the appropriate interface (Secretary or Boss).
3. A Secretary is a Person.
4. A Boss is a Person who can get others to work hard (HasManagementPotential).
*/

/*
public class Solution {
public static void main(String[] args) {
}

interface Person {
	void use(Person person);

	void startToWork();
}

interface HasManagementPotential {
	boolean inspiresOthersToWork();
}

interface Secretary {
}

interface Boss {
}

class Manager {
	public void use(Person person) {
		person.startToWork();
	}

	public void startToWork() {
	}

	public boolean inspiresOthersToWork() {
		return true;
	}
}*/
