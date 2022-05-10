package cg.interfaces._08a_nested_userloserprogrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class App {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	Person1 person = null;
	String key;

	while(true) {
		key = reader.readLine();
		boolean u = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer");
		if(!u) break;

		switch (key) {
			case "user":
				person = new Person1.User();
				break;
			case "loser":
				person = new Person1.Loser();
				break;
			case "coder":
				person = new Person1.Coder();
				break;
			case "programmer":
				person = new Person1.Programmer();
				break;
		}
		doWork(person);
	}

}
public static void doWork(Person1 person) {
	if (person instanceof Person1.User) {
		((Person1.User) person).live();
	}else if (person instanceof Person1.Loser) {
		((Person1.Loser)person).doNothing();
	}else if (person instanceof Person1.Coder) {
		((Person1.Coder) person).writeCode();
	} else if (person instanceof Person1.Programmer){
		((Person1.Programmer) person).enjoy();
	}
}

}

