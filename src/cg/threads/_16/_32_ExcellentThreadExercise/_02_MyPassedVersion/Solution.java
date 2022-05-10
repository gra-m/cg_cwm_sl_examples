package cg.threads._16._32_ExcellentThreadExercise._02_MyPassedVersion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

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
            thread.start();
        }
        t4.showWarning();

    }

    public static class T1IndefiniteRunner extends Thread {
        String name;

        public T1IndefiniteRunner(String name) {
            super.setName(name);
            this.name = name;
        }

        public void run() {
            while(true) {
            }
        }
    }

    public static class T2DisplayOnInterrupt extends Thread {
        public T2DisplayOnInterrupt(String name) {
            super.setName(name);
        }

        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class T3HurrayPoint5 extends Thread {

        public T3HurrayPoint5(String name) {
            super.setName(name);
        }

        public void run() {
            try {
                while (!currentThread().isInterrupted()) {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }


        }

    public static class T4EmergencyMessageStop extends Thread implements Message {
        public T4EmergencyMessageStop(String name) {
            super.setName(name);
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }

        public void run() {
            while (!isInterrupted()) {
            }
        }
    }
    public static class T5ReadNumsTillNSum extends Thread {

        public T5ReadNumsTillNSum(String name) {
           super.setName(name);
        }

        public void run(){
            String input;
            List<String> inputs = new ArrayList<>();

               try {
                   while (!(input = br.readLine()).equals("N")){
                       inputs.add(input);
                   };
               } catch (IOException e) {
                   e.printStackTrace();
               }

               int total = 0;
               for (String entered : inputs) {
                   if(isNull(entered) || entered.equals(""))
                       entered = "0";
                  int intEntered = Integer.parseInt(entered);
                  total += intEntered;
               }
               System.out.println(total);
           }
        }

    }