package cg.threads._16._18TestThread;
//region
/* 
Another interruption
Create a TestThread.
In the main method, create a thread, run it, and then interrupt it using the interrupt() method.


Requirements:
1. The TestThread class should inherit the Thread class.
2. The TestThread class must have a public void run method.
3. The main method must create a TestThread object.
4. The main method must call the start method on the TestThread object.
5. The main method must call the interrupt method on the TestThread object.
//////////////////////////////////////

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //write your code here
    }

    //write your code here
    public static class TestThread {
    }
}
*/

//endregion

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();

    }

    public static class TestThread extends Thread {

        @Override
        public void run() {
            super.run();
        }

        @Override
        public synchronized void start() {
            super.start();
        }
    }
}