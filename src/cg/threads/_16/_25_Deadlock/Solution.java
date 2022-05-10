package cg.threads._16._25_Deadlock;
// region Original
/* 
Deadlock
1. Figure out how the program works.
2. Without changing the T1 and T2 classes, make it so their threads finish (not necessarily successfully).
3. Don't use the sleep method.


Requirements:
1. The main method must start the t1 thread.
2. The main method must start the t2 thread.
3. Don't change the T1 class.
4. Don't change the T2 class.
5. Don't use the sleep method.
6. The program's output should consist of 2 lines indicating that the threads have finished. For example: "T1 was interrupted" and "T2 finished".
7. The t1 and t2 threads must end (not necessarily successful).

*/
// endregion

public class Solution {
    static Thread t1 = new T1();
    static Thread t2 = new T2();

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t2.start();
        t2.interrupt(); // Without this we have deadlock
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("T1 finished");
            } catch (InterruptedException e) {
                System.out.println("T1 was interrupted");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();
                System.out.println("T2 finished");
            } catch (InterruptedException e) {
                System.out.println("T2 was interrupted");
            }
        }
    }
}

