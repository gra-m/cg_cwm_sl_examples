package cg.threads._16._15_SYNCHRONIZED;

// region Original
/* 
Airport

1. Figure out what the program does.
2. Correct the takeOff method. It currently takes a looooong time. A takeoff should take 100 milliseconds.
3. Implement the waitForTakeoff method by analogy with the takeOff method. The wait time should not be longer than the takeoff time.


Requirements:
1. The takeOff method should run for approximately 100 ms.
2. The waitForTakeoff method should run for approximately 100 ms.
3. The main method should create 3 planes.
4. The Solution class must have an inner class called Plane.
5. The Solution class must have an inner class called Runway.
======================
public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // 1 runway

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Plane #1");
        Plane plane2 = new Plane("Plane #2");
        Plane plane3 = new Plane("Plane #3");
    }

    private static void waitForTakeoff() {
        // write your code here
    }

    private static void takeOff() {
        // Fix this method
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean hasAlreadyTakenOff = false;
            while (!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {    // if the runway is available, we'll take it
                    System.out.println(getName() + " is flying");
                    takeOff();// is flying
                    System.out.println(getName() + " in the sky");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {  // if the runway is occupied by a plane
                    System.out.println(getName() + " is waiting");
                    waitForTakeoff(); // is waiting
                }
            }
        }
    }

    public static class Runway {
        private Thread t;

        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}
*/
//endregion

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // 1 runway

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Plane #1");
        Plane plane2 = new Plane("Plane #2");
        Plane plane3 = new Plane("Plane #3");
    }

    private static void waitForTakeoff() {

        try {
            String name = Thread.currentThread().getName();

            System.out.println(name + " is waiting");
            Thread.sleep(1000);
            System.out.println(name + " waited a second");

        } catch (InterruptedException ignored) {
        }
    }

    private static void takeOff() {

        try {

            String name = Thread.currentThread().getName();
            System.out.println(name + " is flying");
            Thread.sleep(1000);
            System.out.println(name + " in the sky");

        } catch (InterruptedException ignored) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }
        
        /*private static void takeOff() {
            try {
                String threadName = currentThread().getName();
                System.out.println(threadName + " is flying");
                Thread.sleep(1000); // nas no effect here when internalized as its inside itself...
                System.out.println(threadName + " in the sky");

            } catch (InterruptedException ignored) {
            }   
        }

        private static void waitForTakeoff() {
            try {
                
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        } 
*/
        public void run() {
            boolean hasAlreadyTakenOff = false;
            while (!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {    // if the runway is available, we'll take it
                    takeOff();// is flying
                    System.out.println(getName() + " in the sky");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {  // if the runway is occupied by a plane
                    waitForTakeoff(); // is waiting
                }
            }
        }
    }

    public static class Runway {
        private Thread t;


        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

