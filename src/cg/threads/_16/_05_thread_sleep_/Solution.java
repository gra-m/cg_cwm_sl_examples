package cg.threads._16._05_thread_sleep_;

import java.util.Date;


//region Original
/* 
Let's talk music
1. Change the Violin class to make it a task for the thread. Use the MusicalInstrument interface
2. Implement the required method in the Violin thread. The implementation should be as follows:
2.1. Determine the time when you start playing - the startPlaying() method.
2.2. Wait 1 second - the sleepNSeconds(int n) method, where n is the number of seconds.
2.3. Determine the time when you stop playing - the stopPlaying() method.
2.4. Display how long you played the instrument. Use the methods in Items 2.1 and 2.3.

Example: Played for 1002 ms


Requirements:
1. The Violin class should not inherit any additional class.
2. The Violin class should implement the MusicalInstrument interface.
3. The Violin class's run method should call the startPlaying method.
4. The Violin class's run method should call the sleepNSeconds method with an argument of 1 second.
5. The Violin class's run method should call the stopPlaying method.
6. The Violin class's run method should display how long the instrument was played (in milliseconds). Use the format given in the example.

///////////////////////////////////////

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }
    }
}

*/
//endregion



public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }


        @Override
        public void run() {
            Date startDate = startPlaying();
            sleepNSeconds(1);
            Date stopDate = stopPlaying();
            System.out.println("Played for " + (stopDate.getTime() - startDate.getTime()) + " ms");

        }
    }
}
