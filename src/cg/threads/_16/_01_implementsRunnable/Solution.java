package cg.threads._16._01_implementsRunnable;

// region Original
/* 
My first thread
Create a public static TestThread class, a thread with the Runnable interface.
TestThread should display "My first thread".


Requirements:
1. Add a public static class called TestThread to the Solution class.
2. The TestThread class must implement the Runnable interface.
3. The TestThread class's run method should display "My first thread".
4. The program should display "My first thread".
5. Don't change the main method.

//////////////////////////
public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
}
*/
// endregion


public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    // classes that implement Runnable have to be placed in a thread, and are individually named.
    public static class TestThread implements Runnable {

        @Override
        public void run(){
            System.out.println("My first thread");
        }
    }
}
