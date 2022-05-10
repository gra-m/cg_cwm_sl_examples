package cg.threads._16._26_CountUpCountDown;


// region Original
/*
*Following a pattern
Figure out how the program works.
Similar to CountdownRunnable, create a CountUpRunnable thread that displays values ​​in the counting order: from 1 to number.


Requirements:
1. The CountUpRunnable class must implement the Runnable interface.
2. The CountUpRunnable class must have a public run method with no parameters.
3. The CountUpRunnable class's run method should run for approximately 2.5 seconds.
4. Every half second, the CountUpRunnable class's run method should display the thread's name, a colon, and the value of the counter from 1 to 5 (for example: "Increase: 1").
5. The CountUpRunnable class's run method should call Thread.sleep(500).
*
* ////////////////////////////
*public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Decrease").start();
        new Thread(new CountUpRunnable(), "Increase").start();
    }

    public static class CountUpRunnable {
        //write your code here
    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }
}

*
*
* */
//endregion

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Decrease").start();
        new Thread(new CountUpRunnable(), "Increase").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countupIndex = 0;

        public void run() {
            try {
                while (true) {
                    Thread.sleep(500);
                    countupIndex += 1;
                    System.out.println(toString());
                    if (countupIndex == Solution.number) return;
                }
            } catch (InterruptedException e) {
            }
        }
        public String toString() {
            return Thread.currentThread().getName() + ": " + countupIndex;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }
}
