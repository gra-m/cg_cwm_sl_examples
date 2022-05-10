package cg.threads._16._13_3secondsToMidnight;

//region Original
/* 
Big Ben
1. Figure out what the program does.
2. Implement the printTime method so that the time is given every second, beginning with the time specified in the constructor.

Example:
In London, the time is now 23:59:58!
In London, the time is now 23:59:59!
It's currently midnight in London!
In London, the time is now 00:00:01!


Requirements:
1. The printTime method should run for about a second.
2. The printTime method should increase (increment) the number of seconds stored in the variable seconds.
3. After incrementing the time, the second count cannot be greater than 59. The number of minutes should increase.
4. After incrementing the time, the minute count cannot be greater than 59. The number of hours should increase.
5. After incrementing the time, the hour count cannot be greater than 23.

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("London", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //write your code here

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("It's currently midnight in %s!", cityName));
            } else {
                System.out.println(String.format("In %s, the time is now %02d:%02d:%02d!", cityName, hours, minutes, seconds));
            }
        }
    }
}
*/
//endregion

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("London", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {

            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
            if (hours == 24) {
                hours = 0;
            }

            Thread.sleep(1000);

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("It's currently midnight in %s!", cityName));
            } else {
                System.out.println(String.format("In %s, the time is now %02d:%02d:%02d!", cityName, hours, minutes, seconds));
            }
        }
    }
}
