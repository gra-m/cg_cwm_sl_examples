package cg.interfaces._08a_nested_userloserprogrammer;

public interface Person1 {

class User implements Person1 {
	void live(){
		System.out.println("I usually just live");
	}
}

class Loser implements Person1 {
	void doNothing() {
		System.out.println("I usually do nothing.");
	}
}

class Coder implements Person1 {
	void writeCode() {
		System.out.println("I usually write code.");
	}
}

class Programmer implements Person1 {
	void enjoy() {
		System.out.println("It's a wonderful life!");
	}
}

}
