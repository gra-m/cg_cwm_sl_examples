package cg.threads._16._17_CountDown;

/* 
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
           Thread current = Thread.currentThread();
           int count = numSeconds;
            try {
                while (!current.isInterrupted()) {
                System.out.print(numSeconds-- + " ");
                Thread.sleep(1000);
                if (numSeconds == 1 && count == 3) {
                    System.out.print(numSeconds + " ");
                    Thread.sleep(1000);
                    System.out.print(" Go!");
                    break;
                }
            }
           }catch (InterruptedException e)  {
               System.out.print(" Interrupted!");
           }
        }
    }
}
      /*      Thread current = Thread.currentThread();
            int count = -1;
           try {
               while (!current.isInterrupted()) {
                   if (count == 2 && numSeconds == 3) {
                       System.out.print("Go!");
                       break;
                   }
                   else {
                       System.out.print(numSeconds - count++ + " ");
                       Thread.sleep(999);
                   }
               }*/
