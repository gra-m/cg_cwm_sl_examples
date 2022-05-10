package cg.threads._16._32_ExcellentThreadExercise._01_original_with_souts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final T1IndefiniteRunner t1;
    private static final T2DisplayOnInterrupt t2;
    private static final T3HurrayPoint5 t3;
    private static final T4EmergencyMessageStop t4;
    private static final T5ReadNumsTillNSum t5;
    static {
        t1 = new T1IndefiniteRunner("t1IndefiniteRunner");
        threads.add(t1);
        t2 = new T2DisplayOnInterrupt("t2DisplayOnInterrupt");
        threads.add(t2);
        t3 = new T3HurrayPoint5("t3HurrayPoint5");
        threads.add(t3);
        t4 = new T4EmergencyMessageStop("T4EmergencyMessageStop");
        threads.add(t4);
        t5 = new T5ReadNumsTillNSum("T5ReadNumsTillNSum");
        threads.add(t5);


    }


    public static void main(String[] args) throws InterruptedException {
        for (Thread thread : threads) {
            System.out.println("Starting: " + thread.getName()+ "[remove]");
            thread.start();
        }
        System.out.println("[remove main Sleep 3000]");
        Thread.sleep(3000);
        t2.interrupt();
        t3.interrupt();
        t4.showWarning();
        System.out.println("[remove] t4 isAlive: " + t4.isAlive());

    }

    public static class T1IndefiniteRunner extends Thread {
        String name;

        public T1IndefiniteRunner(String name) {
            super.setName(name);
            this.name = name;
        }

        public void start() {
            super.start();
        }

        public void run() {
            System.out.println("[remove] My name is " + currentThread().getName() + " [t1 remove]");
            System.out.println("[remove] t1 isAlive: " + t1.isAlive());
            while(true) {
            }
        }
    }

    public static class T2DisplayOnInterrupt extends Thread {
        public T2DisplayOnInterrupt(String name) {
            super.setName(name);
        }

        public void start() {
            super.start();
        }

        public void run() {
            try {
                while (!currentThread().isInterrupted()) {
                    Thread.sleep(1000);
                    System.out.println("[remove] My name is " + currentThread().getName());
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException [t2 remove]");
            }
        }
    }

    public static class T3HurrayPoint5 extends Thread {

        public T3HurrayPoint5(String name) {
            super.setName(name);
        }
        public void start() {
            super.start();
        }



        public void run() {
            try {
                while (!currentThread().isInterrupted()) {
                    Thread.sleep(500);
                    System.out.println("Hurray");
                }
            } catch (InterruptedException e) {
                System.out.println("[Hurray interrupted in error [t3 remove]]");
            }
        }


        }

    public static class T4EmergencyMessageStop extends Thread implements Message {
        public T4EmergencyMessageStop(String name) {
            super.setName(name);
        }
        public void start() {
            super.start();
        }

        @Override
        public void showWarning() {
            System.out.println("[remove] Stopping " + t4.getName());
            t4.stop();
        }

        public void run() {
            System.out.println("[remove] My name is " + currentThread().getName());
        }
    }

    public static class T5ReadNumsTillNSum extends Thread {

        public T5ReadNumsTillNSum(String name) {
           super.setName(name);
        }

        public void start() {
            super.start();
        }

        public void run(){
            String input;
            List<String> inputs = new ArrayList<>();

           while(!currentThread().isInterrupted()) {
               inputs.clear();
               try {
                   while (!(input = br.readLine()).equals("N")){
                       Thread.sleep(10);
                       inputs.add(input);
                       System.out.println("adding " + input);
                   };
               } catch (InterruptedException e) {
               } catch (IOException e) {
                   e.printStackTrace();
               }

               int total = 0;
               for (String entered : inputs) {
                  int intEntered = Integer.parseInt(entered);
                  total += intEntered;
               }
               System.out.println(total);
           }
        }



    }
}