package cg.threads._16._23_StrangeCount;

// region Original
/* 
Creating threads recursively
Creating threads recursively
1. Change the GenerateThread class to make it a thread.
2. Create a GenerateThread constructor, which must:
2.1. Call the superclass's constructor, passing the created thread's number as a String. Use createdThreadCount.
2.2. Start the current thread.
2.3. The thread numbers must start with 1.
3. Override the toString method: inside GenerateThread, use Alt+Insert -> Override Methods. Start typing "toString".
3.1. The toString method must return the current thread number and the word "created". Use getName().

Example:
8 created

4. If the number of created threads is less than Solution.count, the run method must:
4.1. Create a new GenerateThread.
4.2. Display the thread created in Item 4.1.
5. In the end, 15 lines should be output to the console.


Requirements:
1. The GenerateThread class should inherit the Thread class.
2. The GenerateThread class must have a public no-argument constructor.
3. The GenerateThread class constructor should increment createdThreadCount and pass it as a string to the superclass constructor.
4. The GenerateThread class constructor must start the thread.
5. The GenerateThread class's toString method must return the thread name and the word " created". Example: "8 created".
6. If the number of created threads is less than Solution.count, the run method must create a new GenerateThread.
7. If the number of created threads is less than Solution.count, the run method must display the created thread.
8. The program's output must match the task conditions and indicate that all 15 threads have been created
///////////////////////////

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread {
    }
}
*/
// endregion

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{

        public GenerateThread() {
            // String.valueOf(etc.)
            super(++createdThreadCount +"");
            this.start();
        }

        @Override
        public void run() {
           if(createdThreadCount < count) {
               System.out.println(new GenerateThread()); // Solution still weird outcome
               //new GenerateThread(); // I looked at solution,  my version creates 2 1s
               //System.out.println(this.toString());
           }
        }

        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
