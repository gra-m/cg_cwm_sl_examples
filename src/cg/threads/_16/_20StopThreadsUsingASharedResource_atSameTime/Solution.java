package cg.threads._16._20StopThreadsUsingASharedResource_atSameTime;

import java.util.ArrayList;
import java.util.List;
//region Original
/* 
One for all, all for one
1. Figure out how the program works.
1.1. Note that the Water object is the same for all the threads.
2. Implement the ourInterrupt() method so that it interrupts all threads in the threads list.
3. Correct the values ​​of the variables in the run() method:
3.1. isCurrentThreadInterrupted must be the same as the value of the isInterrupted() method for the current thread.
3.2. threadName must be the same as the value of the getName() method (implemented in the Thread class) for the current thread.


Requirements:
1. The ourInterrupt() method must interrupt all threads in the threads list.
2. The run() method must get the current thread using Thread.currentThread.
3. The run() method must call the isInterrupted() method on the current thread.
4. The run() method must call the getName() method on the current thread.
5. The main() method should run for about 3 seconds.

///////////////////////////////////////

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        //write your code here
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables
            boolean isCurrentThreadInterrupted = false;
            String threadName = "";

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Object " + sharedResource + ", thread " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}

*/
//endregion


public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        //write your code here
        for(Thread thread: threads)
            thread.interrupt();
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            boolean isCurrentThreadInterrupted = false;
            String threadName = Thread.currentThread().getName();

            isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Object " + sharedResource + ", thread " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
