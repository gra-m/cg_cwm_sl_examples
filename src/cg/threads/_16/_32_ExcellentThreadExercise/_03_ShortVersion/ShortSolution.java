package cg.threads._16._32_ExcellentThreadExercise._03_ShortVersion;

import java.util.ArrayList;
import java.util.List;

class ShortSolution {
List<Thread> threadsList = new ArrayList<>(5);
//private static Thread t4NeedsAVariable;

{
	threadsList.add(new Thread1());
	threadsList.add(new Thread2());
	//threadsList.add(new Thread3());
	threadsList.add(new Thread4());
	// no it doesn't, showMessage not static..
//	t4NeedsAVariable = new Thread4();
//	threadsList.add(t4NeedsAVariable);

}

public static void main(String[] args) {
	ShortSolution shortSolution = new ShortSolution();
	for (Thread thread : shortSolution.threadsList) {
		thread.start();
	}
}

class Thread1 extends Thread {
public void run(){
	while(true) {}
}
}

class Thread2 extends Thread {
	public void run() {
			try {
				throw new InterruptedException();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
	}
}

class Thread3 extends Thread {
	public void run() {
		while(true) {
			System.out.println("Hurray");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread4 extends Thread implements Message {

public void run() {

		while(!isInterrupted()) {

			for(int i = 0; i < 5; i++) {
			System.out.println("Doing this");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("From Sleep");
			}
		}

	showWarning(); // Flags thread as interrupted
		try {
			// Resets interrupted flag sleep says nope, you're you cannot be interrupted I gotta sleep you.
			Thread.sleep(1000);
		} catch (InterruptedException e)  {
			e.printStackTrace();
			break;
		}

		}


	System.out.println("Broke but still " + this.isAlive());
	}

	@Override
	public void showWarning() {
		this.interrupt();
	}
}


}
