package cg.inputoutput.fileinstaticblock;

import jdk.jfr.StackTrace;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
// region ORIGINAL
/* 
File in a static block
1. Initialize the variable Statics.FILE_NAME to the full path to a data file that contains several lines.
2. Then, in the static block, read all the lines from the file named Statics.FILE_NAME, and add them separately to the List lines.


Requirements:
1. The constant FILE_NAME must not be empty.
2. In the static block, all lines from the file named FILE_NAME must be added separately to the List lines.
3. The field FILE_NAME must NOT be final.
4. The Solution class must have a list of lines.
///////////
public class Solution {
    public static List<String> lines = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
/////////

public class Statics {
    public static String FILE_NAME = ;// Add the path to your source file here
}
*/


// endregion

public class Solution {
public static List<String> lines = new ArrayList<>();
static {Statics.FILE_NAME = "src/inputOutputFiles/_04ReadingAFile.txt";}
static {//Statics.FILE_NAME = "src/inputOutputFiles/_04ReadingAFile.txt";
   BufferedReader lineReader = null;
   try {
      lineReader = new BufferedReader(new FileReader(Statics.FILE_NAME));
   } catch (FileNotFoundException fnf) {
      fnf.printStackTrace();
   }
   try {
      String line = lineReader.readLine();
      while (!isNull(line)) {
         System.out.println(line);
         lines.add(line);
         line = lineReader.readLine();
      }
   } catch (IOException ioe){
      ioe.printStackTrace();

   }
}

    public static void main(String[] args) {

        System.out.println("Printing Lines" + lines);
    }
}
