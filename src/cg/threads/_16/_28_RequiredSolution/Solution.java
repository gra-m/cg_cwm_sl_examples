package cg.threads._16._28_RequiredSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//region Original
/*
The early bird gets the worm
1. Figure out what the program does.
1.1. Each thread should read lines from the console. Use the existing static BufferedReader reader.
1.2. Use AtomicInteger readStringCount to calculate how many lines all the threads have read from the console.
2. Implement the run method:
2.1. As long as a thread is not interrupted (!IsInterrupted), read lines from the console and add them to List<String> result.
2.2. Use readStringCount to count the strings read from the console.


Requirements:
1. The run method must run until the thread is terminated (!IsInterrupted).
2. The run method must NOT create its own InputStreamReaders or BufferedReaders.
3. The run method must read words from the reader and add them to the result list.
4. After each string is read, the run method must increment readStringCount by 1.
5. The program should display the data read by each thread.
////////////////////////////////////

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // Read string count
        int count = Integer.parseInt(reader.readLine());

        // Init threads
        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {
        }

        consoleReader1.interrupt();
        consoleReader2.interrupt();
        consoleReader3.interrupt();
        System.out.println("#1:" + consoleReader1);
        System.out.println("#2:" + consoleReader2);
        System.out.println("#3:" + consoleReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<>();

        public void run() {
            //write your code here
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}


 */
//endregion


public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(reader.readLine());

        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {
        }

        consoleReader1.interrupt();
        consoleReader2.interrupt();
        consoleReader3.interrupt();
        System.out.println("#1:" + consoleReader1);
        System.out.println("#2:" + consoleReader2);
        System.out.println("#3:" + consoleReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<>();

        public void run() {
            try {
                String input;
            while(!currentThread().isInterrupted()) {
                if((input = reader.readLine()) != null) {
                    result.add(input);
                    readStringCount.incrementAndGet();
                }
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
