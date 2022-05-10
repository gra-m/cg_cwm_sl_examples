package cg.threads._16._10thread_spawning_child_thread;


// region Original
/* 
Arranging calls to join()
1. Figure out what the program does.
2. Arrange the calls to join() so that each cat does the following:
2.1. First, the cat gives birth to kittens.
2.2. Then all the kittens climb out of the basket in random order.
2.3. Finally, the cat brings them back into the basket.
2.4. These events for one cat may be interspersed with events for another cat.
2.5. Add kitten nap-time (sleep 200 ms) to investigateWorld.


Requirements:
1. The join method should be called on each kitten (Kitten object).
2. The investigateWorld method should let the kitten sleep for 200 ms. Use Thread.sleep(200).
3. The program should create two cats and four kittens.
4. Don't change the methods that are responsible for screen output.
5. The program's output must indicate that the task conditions have been satisfied.
/////////////////////////////////////////////////


public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Missy");
        Cat cat2 = new Cat("Coco");
    }

    private static void investigateWorld() {

    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Kitten 1 (mother - " + getName() + ")");
            kitten2 = new Kitten("Kitten 2 (mother - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " gave birth to 2 kittens");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": All the kittens are in the basket. " + getName() + " brought them back");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " got out of the basket");
            investigateWorld();
        }
    }
}

*/
// endregion

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Missy");
        Cat cat2 = new Cat("Coco");
    }

    private static void investigateWorld(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Kitten 1 (mother - " + getName() + ")");
            kitten2 = new Kitten("Kitten 2 (mother - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " gave birth to 2 kittens");
            try {
                initAllKittens();
                kitten1.join();
                kitten2.join();
            } catch (InterruptedException e) {
            }

            System.out.println(getName() + ": All the kittens are in the basket. " + getName() + " brought them back");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " got out of the basket");
            investigateWorld();
        }
    }
}
