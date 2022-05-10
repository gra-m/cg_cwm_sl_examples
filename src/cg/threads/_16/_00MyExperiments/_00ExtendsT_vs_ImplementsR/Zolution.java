package cg.threads._16._00MyExperiments._00ExtendsT_vs_ImplementsR;

/*

Reasons to use implements Runnable instead of extends Thread:
1) You may need to start several threads based on a single object, as in the example with Natasha.

2) If you inherit from the Thread class, you can't add another parent class to your class.

3) If your class has a parent class, you can't add Thread as a second parent class.
 */


import java.util.ArrayList;
import java.util.List;

public class Zolution {
public static void main(String[] args) {

	// With threads that extend thread:
	ExtendsThread dilbert = new ExtendsThread("Thread1");
	dilbert.start();
	//dilbert.start(); #A Breaks---> the object is the thread.

	//CREATING with loop store in list:
	List<ExtendsThread> listA  = new ArrayList<>(5);
	for (int i = 0; i < 5; i++)
		listA.add(new ExtendsThread("aLoopCreatedMe" + i));

	for (ExtendsThread extendsThread : listA)
		extendsThread.start();


	//1. You cannot start several threads with the same object like you can with implements Runnable:
	ImplementsRunnableThread dilbertMk2 = new ImplementsRunnableThread("Boring");

	Thread dilbertMk2_1 = new Thread(dilbertMk2);
	dilbertMk2_1.start();
	Thread dilbertMk2_2 = new Thread(dilbertMk2);
	dilbertMk2_2.start();
	Thread dilbertMk2_3 = new Thread(dilbertMk2);
	dilbertMk2_3.start();
	// #A Works---> the object is placed inside a Thread.

	//CREATING with loop store in list:
	List<Thread> list  = new ArrayList<>(5);
	for (int i = 0; i < 5; i++)
		list.add(new Thread(new ImplementsRunnableThread("aLoopCreatedMe" + i)));

	for (Thread thread : list) {
		System.out.println("Weird thread name " + thread);
		System.out.println("Help can only get Thread Name");
		thread.start();
	}


}

public static class ExtendsThread extends Thread {

public ExtendsThread(String name) {
	super(name);
}

public void run() {
	System.out.println("I am this " + getName() + " thread and I cannot be replicated" );
}
}


public static class ImplementsRunnableThread implements Runnable {
private String name;

public String getName(){return name;}

public ImplementsRunnableThread(String name) {
	this.name = name;
}

	@Override
	public void run() {
		System.out.println("Many of the same ImplementsRunnableThread possible " + name);
	}
}
}
