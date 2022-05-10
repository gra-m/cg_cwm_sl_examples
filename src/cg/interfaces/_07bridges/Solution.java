package cg.interfaces._07bridges;

/*
Bridges
1. Create a Bridge interface with an int getCarsCount() method.
2. Write WaterBridge and SuspensionBridge classes that implement the Bridge interface.
3. The getCarsCount() method must return any constant int value.
4. The getCarsCount() method must return different values ​​for different classes.
5. Create a public println(Bridge bridge) method in the Solution class.
6. In the println method, display the result of calling getCarsCount() method on the bridge object.
7. Each class and interface must be in separate files.


Requirements:
1. The Bridge interface must be in a separate file.
2. The WaterBridge and SuspensionBridge classes must be in separate files.
3. The WaterBridge and SuspensionBridge classes must implement the Bridge interface.
4. The getCarsCount() method must return different int values ​​for different classes, but always the same value for different objects of the same class.
5. The Solution class must implement a public println method with one Bridge parameter.
6. The println method must display the number of cars (result of the getCarsCount method) for the passed Bridge object.
7. The Bridge interface must define an int GetCarsCount() method.

Start Point:
public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());

    }

}

 */

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());

    }
   public static void println(Bridge bridge) {
       System.out.println(bridge.getCarsCount());
   }
}

