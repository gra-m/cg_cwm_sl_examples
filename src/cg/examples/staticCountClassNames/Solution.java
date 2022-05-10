package cg.examples.staticCountClassNames;

import java.math.BigDecimal;

/*
OOP: Method overloading
1. In the Tree class, overload the info(Object s) method twice to get three methods: info(Object s), info(Number s), and info(String s).
1.1. Study the info(Object s) method. Create similar functionality in the new methods.
1.2. For example, the result for the info(Number s) method might be "Tree No. 123, Number method, Short parameter".


Requirements:
1. The Tree class must implement the info(Object s) method.
2. The Tree class must implement the info(Number s) method.
3. The Tree class must implement the info(String s) method.
4. The info(Number s) method should display a line similar to the line for the info(Object s) method, replacing only "Object method" with "Number method".
5. The info(String s) method should display a line similar to the line for the info(Object s) method, replacing only "Object method" with "String method".

OOP: Method overloading

public class Solution {
    public static void main(String[] args) {
        // Block 2.
        // Call for Objects
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // Block 3.
        // Call for Numbers
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // Block 4.
        // Call for Strings
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
*/

public class Solution {
public static void main(String[] args) {
	new Tree().info((Object) new Integer("4"));
	new Tree().info((Object) new Short("4"));
	new Tree().info((Object) new BigDecimal("4"));

	new Tree().info(new Integer("4"));
	new Tree().info(new Short("4"));
	new Tree().info(new BigDecimal("4"));

	new Tree().info(new String("4"));
	new Tree().info(new Integer("4").toString());
	new Tree().info(new Short("4").toString());
	new Tree().info(new BigDecimal("4").toString());
}

public static class Tree {
	public static int globalNumber;
	public int number;

	public Tree() {
		this.number = ++globalNumber;
	}

	public void info(Object s) {
		System.out.printf("Tree No. %d , Object method, %s parameter\n", number, s.getClass().getSimpleName());
	}

	public void info(Number s) {
		System.out.printf("Tree No. %d , Number method, %s parameter\n", number, s.getClass().getSimpleName());
	}

	public void info(String s) {
		System.out.printf("Tree No. %d , String method, %s parameter\n", number, s.getClass().getSimpleName());
	}


}

}
