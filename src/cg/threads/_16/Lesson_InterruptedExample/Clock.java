package cg.threads._16.Lesson_InterruptedExample;

//region Notes about Interrupt()

	/*When interrupt is called on a thread:
	1. If the object was in the waiting state, for example, due to the `join` or `sleep`
	methods, then the wait will be interrupted and the program will
	throw an `InterruptedException`.
	2. If the thread was in a functioning state, then the boolean **`interrupted`**
	flag will be set on the object.*/

//endregion


public class Clock extends Thread{

public static void main(String[] args) throws InterruptedException {
	Clock clock = new Clock();
	clock.start();

	Thread.sleep(10000);

	clock.interrupt();

}

public void run() {
	Thread current = Thread.currentThread();

	while(!current.isInterrupted()) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// InterruptedException sets isInterruped back to 'false'.
			e.printStackTrace();
			break;
		}
		System.out.println("Tick");
	}

}

}
