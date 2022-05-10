package cg.threads._16._32_ExcellentThreadExercise._04_RunnableVersion;

import java.util.ArrayList;
import java.util.List;

class Solution {
public List<Thread> threads = new ArrayList<>(4);
public ThreadGroup myFirstGT;

{
	ThreadGroup myFirstGT = new ThreadGroup("myFirstGT");
	Thread t1 = new Thread(myFirstGT, new ThreadOne("t1_Womble"), "t1_Willow");
	Thread t2 = new Thread(myFirstGT, new ThreadTwo("t2_Xylo"), "t2_Xeno");
}

public static void main(String[] args) {
	Solution newSolution = new Solution();

	for(Thread thread : newSolution.threads) {
		thread.start();
	}

}

class ThreadOne implements Runnable {
private String name;
public ThreadOne(String name) {
	this.name = name;
}
public String getName() {
	return this.name;
}
	@Override
	public void run() {
		while(true){}
	}
}


class ThreadTwo implements Runnable {
private String name;

public ThreadTwo(String name) {
	this.name = name;
}
public String getName() {
	return this.name;
}
	@Override
	public void run() {
	try {
		System.out.println("running");
		throw new InterruptedException();
	} catch (InterruptedException e) {
		System.out.println(e);
	}
	}
}

class ThreadThree implements Runnable {

	@Override
	public void run() {

	}
}

class ThreadFour implements Runnable {

	@Override
	public void run() {

	}
}
}
