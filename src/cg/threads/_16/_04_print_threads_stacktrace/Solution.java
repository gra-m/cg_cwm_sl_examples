package cg.threads._16._04_print_threads_stacktrace;

// region Original
/* 
Displaying a stack trace

1. Create a "task" (a public static class called SpecialThread that implements the Runnable interface).
2. SpecialThread should display its own stack trace.

Hint: The main thread already displays its stack trace.


Requirements:
1. Add a public static class called SpecialThread to the Solution class.
2. The SpecialThread class should not inherit any additional class.
3. The SpecialThread class must implement the Runnable interface.
4. The SpecialThread class's run method should display its own stack trace.

/////////////////////////////

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
}
*/
//endregion

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*******************");
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("--------------------");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println("aaaaaaaaaaaaaaaaaaaaa");
            System.out.println(element);
        }
    }
    public static class SpecialThread implements Runnable {

        @Override
        public void run(){

            boolean printStars = true;
            for(StackTraceElement el : Thread.currentThread().getStackTrace()) {
                System.out.println("bbbbbbbbbbbbbbbbbbb");
                System.out.println(el);
            }
        }
    }
}
