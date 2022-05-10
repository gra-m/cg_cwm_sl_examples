package cg.threads._16._09extends_thread_mouseEat;

/* 
Justice
Justice
1. Figure out what the program does.
2. Be sure that all the mice eat at the same time.
3. Think about which method lets the alpha male mouse eat first, and why the other mice wait.
4. Remove this method call.


Requirements:
1. The program's output should first indicate that all the mice have begun to eat, and then that they have all finished.
2. The join method should not be called on Mouse objects.
3. The program should create 3 Mouse objects.
4. Don't change the methods that are responsible for screen output.

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
        //alpha.join();

        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}
