package cg.threads._16._30_Testing._Course;

import java.io.*;


public class Solution {
    public static String firstFileName;
    public static String secondFileName;

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
    String fileName;
    String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;

        }

        public String getFileContents() {
            return this.fileContent;
        }

        @Override
        public void run() {
            String line;
            try(BufferedReader br = new BufferedReader(new FileReader ("src/cg/threads/_16/_30_Testing/_Course/" + this.fileName)))
            {
                while((line = br.readLine()) != null) {
                    fileContent += " " + line;
                }
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
