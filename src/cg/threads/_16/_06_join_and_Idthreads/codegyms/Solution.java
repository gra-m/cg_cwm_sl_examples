package cg.threads._16._06_join_and_Idthreads.codegyms;

import java.util.ArrayList;
import java.util.List;


// region Original
/*
join: at the right time in the right place
Think where and on what object you need to call the join method to have the result displayed
first for firstThread and then for secondThread.
Call the join method in the right place.

Example output:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20


Requirements:
1. The main method must call the join method on firstThread.
2. The main method should not call the join method on secondThread.
3. The main method should not call System.out.println or System.out.print().
4. The program's output must match the example in the task.

////////////////////////////////////////////

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}
*/

//endregion

public class Solution {
public static void main(String[] args) throws InterruptedException {
    PrintListThread firstThread = new PrintListThread("firstThread");
    PrintListThread secondThread = new PrintListThread("secondThread");
    firstThread.start();
    firstThread.join();
    secondThread.start();
}

public static void printList(List<String> list, String threadName) {
    for (String item : list) {
        System.out.println(String.format("%s : %s", threadName, item));
    }
}

public static List<String> getList(int n) {
    List<String> result = new ArrayList<>();
    if (n < 1) return result;

    for (int i = 0; i < n; i++) {
        result.add(String.format("String %d", (i + 1)));
    }
    return result;
}

public static class PrintListThread extends Thread {
    public PrintListThread(String name) {
        super(name);
    }

    public void run() {
        printList(getList(20), getName());
    }
}
}