package cg.interfaces;

public class _5aSolution {

	public static void main(String[] args) {
	}

	interface CanMove{
		Double speed();
	}

	interface CanFly extends CanMove{
		Double speed(CanFly canFly);
	}
}

/*
All that moves
1. Create a CanMove interface that has a speed method.
2. The speed method must return a Double and should not accept any arguments.
3. Make the CanFly interface inherit the CanMove interface.
4. Add the speed method to the CanFly interface.
5. The speed method must return a Double and accept one CanFly argument.


Requirements:
1. The Solution class must declare a CanMove interface.
2. The Solution class must declare a CanFly interface.
3. The CanFly interface must inherit the CanMove interface.
4. The CanMove interface must declare a speed method with no parameters and must return a Double.
5. The CanFly interface must declare a speed method with one CanFly parameter and must return a Double.
 */

//package com.codegym.task.task13.task1309;

/*
All that moves

*/

//public class Solution {
//public static void main(String[] args) {
//}
//}


