package cg.examples.initializationorder;

// region ORIGINAL
/* 
Order of loading variables
///////////
Figure out what gets initialized and in what order. Set breakpoints and use the debugger.

Correct the order in which data is initialized to get the following result:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name


Requirements:
1. The program should display data on the screen.
2. The screen output must match the task conditions.
3. The Solution class's static initializer block should cause "static void init()" and "Static block" to be displayed on the screen.
4. The program must not read data from the keyboard.
//////////
public class Solution {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";
    static {
        init();
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.name);
        System.out.println(obj.i);
    }
}
*/
// endregion

public class Solution {
    static {
        init();
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
