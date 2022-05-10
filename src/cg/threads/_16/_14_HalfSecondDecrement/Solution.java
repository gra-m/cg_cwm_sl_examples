package cg.threads._16._14_HalfSecondDecrement;

import java.util.ArrayList;
import java.util.List;

// region Original
/*
Countdown
1. Figure out what the program does.
2. Implement logic in the printCountdown method so that every half a second the program displays an object from the variable list. The output should be in reverse order: from the index passed to Countdown down to zero.

Example:
Index 3 is passed

Example console output:
Line 2
Line 1
Line 0

Requirements:
1. The printCountdown method should run for about half a second.
2. The printCountdown method should reduce (decrement) the value of the variable countFrom.
3. The printCountdown method must display the list item with an index equal to the new value of countFrom.
4. The main method must create a Countdown object.
5. The program's output must match the example in the task conditions.

 public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Line " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            //write your code here
        }
    }
}

*/
//endregion


public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Line " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            Thread.sleep(500);
            System.out.println(list.get(--countFrom));
        }
    }
}
