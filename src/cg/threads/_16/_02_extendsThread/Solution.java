package cg.threads._16._02_extendsThread;

// region Original
/* 
My second thread
1. Create a public static TestThread class that inherits the Thread class.
2. Create a static block inside TestThread, which will display "This is the static block inside TestThread".
3. The run method should display "This is the run method".


Requirements:
1. Add a public static class called TestThread to the Solution class.
2. The TestThread class must inherit the Thread class.
3. The TestThread class should not implement any additional interfaces.
4. Create a static block inside TestThread, which will display "This is the static block inside TestThread".
5. The TestThread class's run method should display "This is the run method".
6. Don't change the main method.
///////////////////

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }
}
*/
//endregion

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    // classes that extend Thread are not individually identifiable unless a super.name is called when constructed
    public static class TestThread extends Thread {

        static{
            System.out.println("This is the static block inside TestThread");
        }

        public void run() {
            System.out.println("This is the run method");
        }

    }
}
