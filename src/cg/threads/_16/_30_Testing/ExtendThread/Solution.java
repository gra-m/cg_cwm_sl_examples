package cg.threads._16._30_Testing.ExtendThread;

//region Original
/*
* Sequential file output
1. Figure out what the program does.
2. In a static block, read 2 filenames: firstFileName and secondFileName.
3. Inside the Solution class, create a public static ReadFileThread class that implements the ReadFileInterface interface (Think about what is more appropriate: Thread or Runnable).
3.1. The setFileName method must set the name of the file whose contents will be read.
3.2. The getFileContents method must return the contents of the file.
3.3. In the run method, read the contents of the file and close the stream. Separate the lines of the file with spaces.
4. Think about where you need to wait for the thread to finish to ensure that the files are displayed sequentially.
4.1. To do this, add a call to the appropriate method.

Expected output:
[entire contents of the first file]
[entire contents of the second file]


Requirements:
1. The Solution class's static block should read from the console the names of two files and store them in the variables firstFileName and secondFileName.
2. In the Solution class, declare the public static ReadFileThread class.
3. The ReadFileThread class must implement the ReadFileInterface interface.
4. The ReadFileThread class must inherit the appropriate class.
5. The ReadFileThread class's run method should read lines from the file set by the setFileName method. And the getFileContents method of this same class must return the file contents. The return value is one string consisting of the lines of the file, separated by spaces.
6. The systemOutPrintln method must call the join method on the created object f.
7. The program's output should consist of 2 lines. Each line contains the contents of one file.
*
* /////////////////////////////////////////
*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //write your code here

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //write your code here
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    //write your code here

}

*
* */
//endregion

import java.io.*;

import static java.util.Objects.isNull;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //write your code here
    static{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = input.readLine();
            secondFileName = input.readLine();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContents());
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String FileContents = "";

        @Override
        public void setFileName(String fullFileName) {
            Thread.currentThread().setName(fullFileName);

        }


        public String getFileContents() {
            return this.FileContents;
        }


        @Override
        public void start() {
            run();
        }

        @Override
        public void run() {
            try{
            BufferedReader reader = new BufferedReader(new FileReader("src/cg/threads/_16/_30_Testing/ExtendThread/"+ Thread.currentThread().getName()));
            StringBuilder contents = new StringBuilder();
            String line = null;
                do{
                        line = reader.readLine();
                        if(!isNull(line))
                        contents.append(" ").append(line);

                }while(line != null);
                this.FileContents = contents.toString().trim();
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }
}
