package cg.larger_tasks.parsing_params;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
// region ORIGINAL
/* 
Request parser
public class Solution {
    public static void main(String[] args) {
        //write your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
//////////////
Read a URL from the console.
Display a space-delimited list of all the parameters (The parameters follow the "?" and are separated by "&", e.g. "lvl=15").
The URL contains at least 1 parameter.
The parameters must be displayed in the same order in which they are present in the URL.
If the obj parameter is present, pass its value to the relevant alert method.
alert(double value) - for numbers (fractional numbers have a decimal point)
alert(String value) - for strings
Note that the alert method must be called AFTER the list of all parameters is displayed.

Example 1

Input:
http://codegym.cc/alpha/index.html?lvl=15&view&name=Amigo

Output:
lvl view name

Example 2

Input:
http://codegym.cc/alpha/index.html?obj=3.14&name=Amigo

Output:
obj name
double: 3.14


Requirements:
1. The program should read only one line from the keyboard.
2. The Solution class must not have static fields.
3. The program must display data on the screen in accordance with the task conditions.
4. The program should call the alert method with the double parameter if the obj parameter can be correctly converted to a double.
5. The program should call the alert method with the String parameter if the obj parameter CANNOT be correctly converted to a double.

/////////////
*/
// endregion

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> paramsAndValues = new ArrayList<>();
        List<String> params = new ArrayList<>();

        String url = br.readLine();

        //Get params and values

        String rawParams = url.substring(url.lastIndexOf('?'));
        String rawParamSubString = rawParams + "=";
        System.out.println("RawParams length " + rawParams);

        if (rawParams.length() > 1) {
            do {
                try {
                    String nextCutString = nextSeparator(rawParamSubString);
                    System.out.println("cutstring " + nextCutString);
                    int nextCut = nextCutIgnoreFirst(nextCutString, rawParamSubString);
                    paramsAndValues.add(rawParamSubString.substring(0, nextCut));
                    rawParamSubString = rawParamSubString.substring(nextCut);
                    System.out.println("HERE --> " + rawParamSubString);
                    System.out.println(nextSeparator(rawParamSubString).equals("end"));
                } catch (IndexOutOfBoundsException iob) {
                    break;
                }
            }
            while (!nextSeparator(rawParamSubString).equals("end"));
        } else {
            System.out.println("Question mark at end but no parameters present");
        }

        System.out.println(paramsAndValues);

        // print all params
        boolean flag = false;
        String objValue = null;
        for(String param :paramsAndValues) {
            if (flag) {
                flag = false;
                objValue = param.substring(1);
            }
           if (param.indexOf("?") == 0 || param.indexOf("&") == 0 || param.indexOf("=") == 0)
               System.out.print(param.substring(1) + " ");

           if (param.substring(1).equals("obj"))
              flag = true;
        }

        if (!isNull(objValue)) {
            try {
                double objDouble = Double.parseDouble(objValue);
                alert(objDouble);
            } catch (NumberFormatException nfe) {
                System.out.println(objValue);
                alert(objValue);
            }

        }
    }

    private static int nextCutIgnoreFirst(String nextCutString, String rawParamSubString) {
        String ignoreFirst = rawParamSubString.substring(1);
        return ignoreFirst.indexOf(nextCutString) + 1;
    }

    public static String nextSeparator(String rawParamSubString){

            String ignoreCharZero = rawParamSubString.substring(1);
            int indexAnd = ignoreCharZero.indexOf("&");
            int indexEquals = ignoreCharZero.indexOf("=");

            System.out.println("NEXTSTEP CALLED: Index&  and Index = " + indexAnd +" " + indexEquals);
            System.out.println(indexAnd + indexEquals);
          if (indexAnd + indexEquals == -2 || indexAnd + indexEquals == -1)
              return "end";
          else if (indexAnd == -1 || indexEquals == -1) {
              System.out.println("here");
              return indexAnd == -1 ? "=" : "&";
          }else
              return indexAnd < indexEquals ? "&" : "=";
        }

        public static void alert ( double value){
            System.out.println("\ndouble: " + value);
        }

        public static void alert (String value){
            System.out.println("\nString: " + value);
        }
    }