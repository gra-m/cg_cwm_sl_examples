package cg.threads._16._07almostAHorseRace;

import java.util.ArrayList;
import java.util.List;


// region Original
/* 
Horse racing
Figure out what the program does.
Implement the calculateHorsesFinished method.
It must:
1. Calculate and return the number of horses that have finished. Use the isFinished() method.
2. If a horse has not yet crossed the finish line (!IsFinished()), then:
2.1. Display "Waiting for " + horse.getName().
2.2. Wait until it finishes the race. Think about what method you need to use to do this.
2.3. Not treat such a horse as finished.


Requirements:
1. The calculateHorsesFinished method must return the number of horses that have finished.
2. The calculateHorsesFinished method must call the isFinished method on each horse in the passed list.
3. If any of the horses in the passed list has not yet finished, then the calculateHorsesFinished method should display "Waiting for " + horse.getName(). Example output for the first horse: "Waiting for Horse_01".
4. If any of the horses in the passed list has not yet finished, then the calculateHorsesFinished method must wait until it finishes. Use the correct method for waiting.
5. After the program is finished, the console must indicate that all the horses have finished. Example output for the first horse: "Horse_01 has finished the race!".

////////////////////////////////////////////////////
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        //write your code here
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   // Delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}

Where I failed:
1. calling join, I was trying to call join on a named thread, instead of
a particular horse object. horse.join()
2. I was creating another loop in the while loop when an else if in
calculateHorseFinished suffices.
*/

// endregion

public class Solution {

    public static void main(String[] args) throws InterruptedException {

        List<Horse> horses = prepareHorsesAndStart(10);

        // Clever way of calling race commentary until all horse
        // threads are finished.
        // Main threads execution environment (thread).
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        for(Horse horse: horses) {
            if (horse.isFinished())
                finishedCount++;
            else {
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            }
        }
        return finishedCount;
    }

    // Zero buffer horse names and create Horse object list, start all Horse
    // object threads.
    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        // Horses are always started in number order
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        // starting a horse  runs a loop count as a delay to 1000, then prints finish statement.
        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   // Delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
