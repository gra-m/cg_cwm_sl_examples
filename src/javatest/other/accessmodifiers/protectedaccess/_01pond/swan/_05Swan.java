package javatest.other.accessmodifiers.protectedaccess._01pond.swan;

// Shows how

import javatest.other.accessmodifiers.protectedaccess._01pond.shore._01Bird;

public class _05Swan extends _01Bird {

public void swim() {
	 floatInWater(); // package access to superclass
	 System.out.println(text); // package access to superclass
	 }

public void helpOtherSwanSwim() {
	 _05Swan other = new _05Swan();
	 other.floatInWater(); // package access to superclass
	 System.out.println(other.text);// package access to superclass
	 }
public void helpOtherBirdSwim() {
	 _01Bird other = new _05Swan();
	// other.floatInWater(); // DOES NOT COMPILE
	// System.out.println(other.text); // DOES NOT COMPILE

	//Lines 19/20 WHY?? Because _01Bird reference is and it is not in the same package as _01Bird
	// and it is not a subclass of itself.
	 }
}