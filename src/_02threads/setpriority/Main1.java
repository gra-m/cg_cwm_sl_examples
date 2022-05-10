package _02threads.setpriority;

class Main1 {

public static void main(String[] args) {

	Main1 app = new Main1();
	app.runApp();
}

void runApp() {
	Name name = new Name();
	name.setPriority(1);

	Welcome welcome = new Welcome();
	welcome.setPriority(10);

	// This order has more effect that the above pants example.
	// About 1/10 == welcome message first.
	name.start();
	welcome.start();
}

class Welcome extends Thread {
	@Override
	public void run() {
		System.out.println("Welcome!");
	}
}

class Name extends Thread {
	@Override
	public void run() {
		System.out.println("Please enter your name");
	}

}
}
