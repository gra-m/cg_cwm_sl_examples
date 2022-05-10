package cg.examples.bignums_bigdecimal_factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


// region Original
/* 
Factorial

Write a method that calculates the factorial, i.e. the product of all numbers from 1 up to and including the entered number.

Example calculations: 4! = factorial(4) = 1*2*3*4
Example output: 24

1. Enter a number less than or equal to 150 from the console.
2. Implement the factorial method.
3. If the entered number is less than 0, then display 0.
0! = 1

Requirements:
1. The program must read data from the keyboard.
2. The program should display the factorial of the entered number.
3. The factorial method must return a string representation of the factorial of the number passed as an argument.
4. The factorial method must have one int parameter.
/////////////////////////////////
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //write your code here

        return "";
    }
}
*/

// endregion

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal factorial = new BigDecimal(1);
        if (n < 0)
            return "0";
        else {
            for(int x = 1; x < n; x++) {
                factorial = factorial.multiply(new BigDecimal(x + 1));
            }
        }

        return factorial + "";
    }
}
