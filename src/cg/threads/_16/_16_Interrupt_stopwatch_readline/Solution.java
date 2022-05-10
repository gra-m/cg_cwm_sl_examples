package cg.threads._16._16_Interrupt_stopwatch_readline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//region Original
/* 
Counting seconds
1. Write an implementation for the run method in the Stopwatch thread.
2. The Stopwatch class must count the number of seconds that have passed from the creation of the thread until a string is entered.
3. Display the number of seconds.


Requirements:
1. The Stopwatch class's run method must have a loop.
2. The run method should call Thread.sleep(1000).
3. The run method should increment the field seconds every 1 second.
4. After the Stopwatch thread is interrupted, the run method must display the number of seconds.
5. There must be only one run method in the Stopwatch class.

/////////////
public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        // Create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        // Read a string
        reader.readLine();
        stopwatch.interrupt();
        // Close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //write your code here
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}

*/
//endregion

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        // Create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        // Read a string
        reader.readLine();
        stopwatch.interrupt();
        // Close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                Thread current = Thread.currentThread();
                while(!current.isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
