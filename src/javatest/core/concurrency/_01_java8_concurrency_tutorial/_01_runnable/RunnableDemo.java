package javatest.core.concurrency._01_java8_concurrency_tutorial._01_runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class RunnableDemo {
public static void main(String[] args) {
	AtomicInteger count = new AtomicInteger(1);
	// A. Define a task that can become a thread //
	Runnable task = () -> {
		System.out.println("Lambda Runnable");
		String threadName = Thread.currentThread().getName();
		System.out.println("Hello " + threadName + " as task " + count.getAndIncrement());
	};

	task.run();

	Thread thread = new Thread(task); //SET OFF task1 (main is task 1)
	thread.start();

	System.out.println("Done-Lambda-Style!");


	Runnable taskClass = new TaskClass(3);

	Thread thread1 = new Thread(taskClass);
	thread1.start(); //SET OFF task2 carries a 3 second delay.

	System.out.println("Due to concurrent execution we cannot guarantee that this will print AFTER " +
		                   "runnable business logic -> Done-Class-Style!");



	System.out.println("\n----------------------------EXECUTORS-----------------------------------------------------------" +
		                   "Using ExecutorService from the Concurrency API means you do not have to work " +
		                   "\n with threads directly. Executors use convenient factory methods for running threads, they" +
		                   "\nhave to be stopped explicitly:");
	System.out.println("\nEXECUTOR: With runnable class:" +
		                   "\nExecutorService executor = Executors.newSingleThreadExecutor();\n" +
		                   "\texecutor.submit(new TaskClass());");

	ExecutorService executor = Executors.newSingleThreadExecutor();
	executor.submit(new TaskClass(5)); //SET OFF task3 carries a 5 second delay

	executor.submit(() -> {
	String threadName = Thread.currentThread().getName();
		System.out.println("Lambda executor.submit(() -> now replaces other single thread in executor.. " + threadName);
	});


	try {
		System.out.println("attempt to shutdown executor");
		executor.shutdown();
		executor.awaitTermination(10, TimeUnit.SECONDS);
	}
	catch (InterruptedException e) {
		System.err.println("tasks interrupted");
	}
	finally {
		if (!executor.isTerminated()) {
			System.err.println("cancel non-finished tasks");
		}
		executor.shutdownNow();
		System.out.println("shutdown finished");
	}








}



}
