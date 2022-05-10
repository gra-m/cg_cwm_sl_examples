package cg.threads._16._LessonJoinExample;

public class ThreadExample extends Thread {

@Override
public void run() {
	System.out.println("Thread started: " + getName());

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	System.out.println("Thread " + getName() + " is fininshed");
}


public static void main(String[] args) {
	Thread t1 = new ThreadExample();
	Thread t2 = new ThreadExample();

	t1.start();


 /* The second thread (t2) will start running only after the first thread (t1)
       is finished (or an exception is thrown) */
	try {
	t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	t2.start();
// The main thread will continue running only after t1 and t2 have finished
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	System.out.println("All threads have finished, the program has finished.");
}
}