package cg.threads._16._03;

import java.util.ArrayList;
import java.util.List;


// region Original
/* 
A list and some threads

In the main method, add 5 threads to the static list. Each thread must be a new Thread object that works with its own SpecialThread object.
Requirements:
1. In the main method, create 5 SpecialThread objects.
2. In the main method, create 5 Thread objects.
3. Add 5 different threads to list.
4. Each thread in list should work with its own SpecialThread object.
5. The SpecialThread class's run method should display "This is the run method inside SpecialThread".
///////////////////////

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //write your code here
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}


*/
// endregion


public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
        list.add(new Thread(new SpecialThread()));

        for(Thread thread: list)
            thread.start();

        //write your code here


       /* SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();
        SpecialThread specialThread5 = new SpecialThread();

        Thread thread1 = new Thread(specialThread1);
        Thread thread2 = new Thread(specialThread2);
        Thread thread3 = new Thread(specialThread3);
        Thread thread4 = new Thread(specialThread4);
        Thread thread5 = new Thread(specialThread5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);*/
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
