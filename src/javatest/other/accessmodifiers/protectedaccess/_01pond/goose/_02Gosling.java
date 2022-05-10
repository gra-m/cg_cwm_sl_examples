package javatest.other.accessmodifiers.protectedaccess._01pond.goose;

import javatest.other.accessmodifiers.protectedaccess._01pond.shore._01Bird;
//P177 OK calling protected members in superclass in another package.
public class _02Gosling extends _01Bird {
public void swim() {
	floatInWater();
	System.out.println(text);
}
}
