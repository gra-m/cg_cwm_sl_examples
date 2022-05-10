package cg.type_casting;


// region ORIGINAL
/*
* Something superfluous
1. The program should display the following:
This is a double
This is an Object
This is a double
This is an Integer
This is a double

2. Remove all unnecessary methods


Requirements:
1. The Solution class must retain a print method with one Integer parameter.
2. The Solution class must retain a print method with one Object parameter.
3. The Solution class must retain a print method with one double parameter.
4. The screen output must match the task conditions.
*
* */




/*
public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("This is an Integer");
    }

    public static void print(int i) {
        System.out.println("This is an Integer");
    }

    public static void print(Short i) {
        System.out.println("This is an Object");
    }

    public static void print(Object i) {
        System.out.println("This is an Object");
    }

    public static void print(double i) {
        System.out.println("This is a double");
    }

    public static void print(Double i) {
        System.out.println("This is a double");
    }

    public static void print(float i) {
        System.out.println("This is a Double");
    }
}
*/
// endregion

public class _1506RemoveSuperfluous {
public static void main(String[] args) {
	print((short) 1);
	print((Number) 1);
	print(1);
	print((Integer) 1);
	print((int) 1);
}

public static void print(Integer i) {
	System.out.println("This is an Integer");
}
/*
    public static void print(int i) {
        System.out.println("This is an Integer");
    }
*/
    /*public static void print(Short i) {
        System.out.println("This is an Object");
    }
*/
public static void print(Object i) {
	System.out.println("This is an Object");
}

public static void print(double i) {
	System.out.println("This is a double");
}
    /*
    public static void print(Double i) {
        System.out.println("This is a double");
    }*/

/*public static void print(float i) { System.out.println("This is a Double"); }*/
}

