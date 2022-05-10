package cg.threads._16._33_Excellent_UncaughtExceptionHandler;

//region Original
/*
Debug everything under the sun
Figure out what the program does.

Read about UncaughtExceptionHandler - it's important.

Take another careful look at the program.

Figure out why our OurUncaughtExceptionHandler doesn't work (use the debugger).

Fix the bug, i.e. everything should work. :)

Expected result in no particular order:

Thread 1: My exception message

Thread 2: My exception message


Requirements:
1. The main method should create a thread with the following arguments: commonThread and "Thread 1".
2. The main method should create a thread with the following arguments: commonThread and "Thread 2".
3. The main method must start two threads (Thread objects).
4. The main method must interrupt two threads (Thread objects).
5. The program must use OurUncaughtExceptionHandler's uncaughtException method to display 2 messages.
6. Don't explicitly call OurUncaughtExceptionHandler's uncaughtException method.
7. The program's output should contain the following lines: "Thread 1: My exception message" and "Thread 2: My exception message".

//////////////////

public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Thread 1");
        Thread threadB = new Thread(commonThread, "Thread 2");

        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}

 */
//endregion

class Solution {
public static Thread.UncaughtExceptionHandler handlerGroup1 = new OurUncaughtExceptionHandler("Non-defaultGroup1");
public static Thread.UncaughtExceptionHandler handlerGroup2 = new OurSecondUncaughtExceptionHandler("Non-defaultGroup2");

public static void main(String[] args) {

	// Thanks Java J2EE Champ as well as CG, see txt file for links. Thread exceptions e.g from external code DO NOT get caught in t/catch.
	Thread.setDefaultUncaughtExceptionHandler(new OurDefaultUncaughtExceptionHandler("DEFAULT"));

	TestedThread commonThread = new TestedThread();

	Thread threadA = new Thread(commonThread, "Thread A");
	Thread threadB = new Thread(commonThread, "Thread B");
	Thread threadC = new Thread(commonThread, "Thread C");
	Thread threadD = new Thread(commonThread, "Thread D");
	Thread threadE = new Thread(commonThread, "Thread E");
	Thread threadF = new Thread(commonThread, "Thread F");
	Thread threadG = new Thread(commonThread, "Thread G");
	Thread threadH = new Thread(commonThread, "Thread H");

	// Group 1 UncaughtExceptionHandler without using setDefault
	threadA.setUncaughtExceptionHandler(handlerGroup1);
	threadB.setUncaughtExceptionHandler(handlerGroup1);
	threadA.start();
	threadB.start();
	// Group 2 UncaughtExceptionHandler without using setDefault
	threadC.setUncaughtExceptionHandler(handlerGroup2);
	threadD.setUncaughtExceptionHandler(handlerGroup2);
	threadC.start();
	threadD.start();
	// Threads using default UncaughtExceptionHandler
	threadE.start();
	threadF.start();
	// Ungrouped UEH set manually
	threadG.setUncaughtExceptionHandler(new OurAlternateUncaughtExceptionHandler("independentWillie"));
	threadH.setUncaughtExceptionHandler(new OurAlternateUncaughtExceptionHandler("independentWonka"));
	threadG.start();
	threadH.start();

	threadA.interrupt();
	threadB.interrupt();
	threadC.interrupt();
	threadD.interrupt();
	threadE.interrupt();
	threadF.interrupt();
	threadG.interrupt();
	threadH.interrupt();
}

public static class TestedThread extends Thread {

	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException("My exception message");
		}
	}
}

public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	private String id;

	public OurUncaughtExceptionHandler(String id) {
		this.id = id;
	}

	public OurUncaughtExceptionHandler() {//doNothing
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(this + " Caught exception in Thread - \"" +
			                   t.getName() + "\" => " + e);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "@" + this.hashCode() +
			       ((id == null || "".equals(id)) ? "" : "\"(" + id + ")\"");
	}
}

public static class OurSecondUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	private String id;

	public OurSecondUncaughtExceptionHandler(String id) {
		this.id = id;
	}

	public OurSecondUncaughtExceptionHandler() {//doNothing
	}

	// Thanks Java J2EE Champ
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(this + " Caught exception in Thread - \"" +
			                   t.getName() + "\" => " + e);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "@" + this.hashCode() +
			       ((id == null || "".equals(id)) ? "" : "\"(" + id + ")\"");
	}
}

public static class OurDefaultUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	private String id;

	public OurDefaultUncaughtExceptionHandler(String id) {
		this.id = id;
	}

	public OurDefaultUncaughtExceptionHandler() {//doNothing
	}

	// Thanks Java J2EE Champ
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(this + " Caught exception in Thread - \"" +
			                   t.getName() + "\" => " + e);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "@" + this.hashCode() +
			       ((id == null || "".equals(id)) ? "" : "\"(" + id + ")\"");
	}
}


public static class OurAlternateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	private String id;

	public OurAlternateUncaughtExceptionHandler(String id) {
		this.id = id;
	}

	public OurAlternateUncaughtExceptionHandler() {//doNothing
	}

	// Thanks Java J2EE Champ
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(this + " Caught exception in Thread - \"" +
			                   t.getName() + "\" => " + e);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "@" + this.hashCode() +
			       ((id == null || "".equals(id)) ? "" : "\"(" + id + ")\"");
	}
}
}