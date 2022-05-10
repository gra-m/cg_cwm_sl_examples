package cg.interfaces._08userlosercodeprogrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class App {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	Person person = null;
	String key;

	while(true) {
		key = reader.readLine();
		boolean u = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer");
		if(!u) break;

		switch (key) {
			case "user":
				person = new User();
				break;
			case "loser":
				person = new Loser();
				break;
			case "coder":
				person = new Coder();
				break;
			case "programmer":
				person = new Programmer();
				break;
		}
		doWork(person);
	}

}
public static void doWork(Person person) {
	if (person instanceof User) {
		((User) person).live();
	}else if (person instanceof Loser) {
		((Loser)person).doNothing();
	}else if (person instanceof Coder) {
		((Coder) person).writeCode();
	} else if (person instanceof Programmer){
		((Programmer) person).enjoy();
	}
}

}

