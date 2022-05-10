package cg.threads._16._21_Thread_currentThread;
// region Original
/* 
Thread.currentThread always returns the current thread
1. In the printMsg method, assign the current thread to the variable t.
2. In the printMsg method, add a delay of 1 millisecond after all the actions.


Requirements:
1. The printMsg method must get the current thread using Thread.currentThread.
2. The printMsg method should put the thread to sleep for 1 millisecond.
3. The printMsg method should call the getName method on the current thread.
4. The main method should call the printMsg method on the ThreadNamePrinter object 5 times.
5. The run method must call the printMsg method 5 times.
6. The ThreadNamePrinter class's printMsg method must be called a total 10 times.
///////////////////////////////////
public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = null; // The current thread should be assigned to the variable t
            String name = t.getName();
            System.out.println("Name = " + name);
            // Add sleep here
        }
    }
}

*/
//endregion

public class Solution {
    static int count = 5;
    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        //tnp.join(); // wait for join to complete.
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }
    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
        }
        public void printMsg() throws InterruptedException{
            Thread t = Thread.currentThread(); // The current thread should be assigned to the variable t
            String name = t.getName();
            System.out.println("Name = " + name);
            Thread.sleep(1);
        }
    }
}
