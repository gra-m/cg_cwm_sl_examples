package cg.threads._16._17_CountDown;

/* 

Countdown at the races
1. Figure out what the program does.
2. Implement the run method so that each second
the count is displayed, separated by spaces and starting from numSeconds down to 1, and then "Go!" (see the examples).
3. If the thread runs for 3.5 seconds or more, interrupt it using the interrupt method and within the thread display "Interrupted!"

Example for numSeconds = 4 :
"4 3 2 1 Interrupted!"

4. If the thread runs less than 3.5 seconds, it should terminate itself.
Example for numSeconds = 3 :
"3 2 1 Go!"
PS: The sleep method throws an InterruptedException.


Requirements:
1. The RaceClock class's run method must have a loop.
2. The RaceClock object must decrease the numSeconds value by one every second.
3. The main method should call Thread.sleep(3500).
4. The main method must call the interrupt method on the Clock object.
5. If numSeconds is 3, then the program should display "3 2 1 Go!".
6. If numSeconds is 4, then the program should display "4 3 2 1 Interrupted!".

*/

public class SolutionRefactored {
public static volatile int numSeconds = 3;

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
      try {
         Thread current = Thread.currentThread();

         while(!current.isInterrupted()) {
            if(0 == numSeconds) {
               System.out.print("Go!");
               break;
            }
            System.out.print(numSeconds-- + " ");
            Thread.sleep(1000);
         }

      } catch (InterruptedException e) {
         System.out.print("Interrupted!");
      }

   }
}
}
