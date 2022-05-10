package cg.threads._16._12_Thread_race_basedonrate;

// region Original
/* 
Stopwatch
1. Figure out what the program does.
2. Implement logic in the doStep method so that the runner's speed is taken into consideration.
2.1. The Runner class's getSpeed() method displays how many steps per second a runner takes.
The runner needs to actually take a specified number of steps per second.
If Usain takes 4 steps per second, then he will take 8 steps in 2 seconds.
If Carl takes 2 steps per second, then he will take 4 steps in 2 seconds.
2.2. The Thread class's sleep method has a long parameter.

IMPORTANT! Use the Thread.sleep() method, not Stopwatch.sleep().


Requirements:
1. The getSpeed method must return an int.
2. The Runner class's field speed must be an int.
3. The Runner class constructor must accept a String and an int.
4. The doStep method must account for the runner's speed. If the runner's speed is 2 steps per second, then the method should run for half a second; if the runner's speed is 4 steps per second, then the method should run for a quarter of a second.
5. The program's output should indicate how many steps Usain and Carl took in 2 seconds.
*/

// endregion

public class Solution {
// volatile is used to force threads referencing it to use the value from memory, and not any cached
// local copy that they could have.
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner usain = new Runner("Usain", 4);
        Runner carl = new Runner("Carl", 2);

        usain.start();
        carl.start();
        // sleep main thread usain and carl stopwatch threads do their thing for 2 seconds
        Thread.sleep(2000);
        //
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }


    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException ignored) {
            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
           //region solution
            int sleepTime = 1000 / this.owner.getSpeed();
            Thread.sleep(sleepTime);
            //endregion
            System.out.println(owner.getName() + " takes step " + stepNumber + "!");
        }
    }

}
