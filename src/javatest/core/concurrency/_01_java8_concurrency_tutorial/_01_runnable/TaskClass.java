package javatest.core.concurrency._01_java8_concurrency_tutorial._01_runnable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class TaskClass implements Runnable{
private AtomicInteger count = new AtomicInteger(1);
private final int delay;

TaskClass(int delay) {
	this.delay = delay;
}


@Override
public void run() {
	System.out.println("Class Runnable");
	String threadName = Thread.currentThread().getName();
	System.out.println("Hello " + threadName + " as task " + count.getAndIncrement());
	try {
		System.out.println("\nBefore a " + delay + " second delay:");
		TimeUnit.SECONDS.sleep(delay);
		System.out.println("\nAfter the " + delay + " second delay:");
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

}

}
