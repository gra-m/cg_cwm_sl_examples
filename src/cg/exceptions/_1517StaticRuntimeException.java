package cg.exceptions;

/*
Static modifiers and exceptions

Static modifiers and exceptions
In a static block, throw an Exception
This will stop the class from loading, and you will see the following error message instead of the value of the variable B

Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.codegym.task.task15.task1517.Solution.(Solution.java:22)

Hint: Use Google to find the cause if you see the following:
java: initializer must be able to complete normally
java: unreachable statement


Requirements:
1. An exception (Exception) must occur in a static block in the Solution class.
2. The program should not display anything (except an automatic message about the exception that occurs).
3. The program must not read data from the keyboard.
4. The Solution class must be public.

public class Solution {
    public static int A = 0;

    static {
        // Throw an exception here
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
*/

public class _1517StaticRuntimeException {
public static int A = 0;

static {
	try {
		throw new Exception();
	} catch (Exception e) {
		e.printStackTrace();
	}
	if (true) throw new RuntimeException("");
}

public static int B = 5;

public static void main(String[] args) {
	System.out.println(B);
}
}