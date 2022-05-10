package cg.threads._16._11_fillThreadSleep_volatile_priority;

// region Original
/* 
Clocks
1. Figure out what the program does.
2. Implement the printTickTock method:
2.1. In the first half of each second, the following phrase should be displayed: Tick
2.2. In the second half of each second, the following phrase should be displayed: Tock


Requirements:
1. The printTickTock method should display two lines: "Tick" and "Tock".
2. The printTickTock method should run for about a second.
3. The printTickTock method should sleep twice for half a second. Use Thread.sleep(500).
4. There should be no messages in the console after "Double-check".
5. The main method must create a Clock object.

///////////////////////////////////

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("the clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTickTock();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTickTock() throws InterruptedException {
            //write your code here
        }
    }
}

*/
// endregion

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000); // Sleep filled by the call of printTickTock() from run()
        isStopped = true;
        System.out.println("the clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTickTock();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTickTock() throws InterruptedException {
            System.out.println("Tick");
            Thread.sleep(500);
            System.out.println("Tock");
            Thread.sleep(500);

        }
    }
}
