package _01designpatterns._000Dsingleton;

// region ORIGINAL
/*
package com.codegym.task.task17.task1707;

public class Solution {
public static void main(String[] args) {
	IMF fund = IMF.getFund();
	IMF anotherFund = IMF.getFund();
	System.out.println(fund == anotherFund );
}
}

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //write your code here
        return imf;
    }

    private IMF() {
    }
}
////////////////////////////
IMF:
Singleton pattern: synchronization in a method.
The IMF class is the International Monetary Fund.
Create a synchronized block inside the getFund method.
Inside the synchronized block, initialize imf so that the getFund method always returns the same object.
Requirements:

    •
    The IMF class must have a private static IMF field imf.
    •
    The IMF class must have a private constructor.
    •
    The IMF class must have a public static IMF getFund() method.
    •
    The getFund() method must have a synchronized block.
    •
    The synchronized block must initialize imf.
    •
    The getFund() method must always return the same object.


 */
// endregion

public class Solution {
public static void main(String[] args) {
	IMF fund = IMF.getFund();
	IMF anotherFund = IMF.getFund();
	System.out.println(fund == anotherFund );
}
}