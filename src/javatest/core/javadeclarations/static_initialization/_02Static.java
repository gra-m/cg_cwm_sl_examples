package javatest.core.javadeclarations.static_initialization;

class _02Static {
private static int one;
private static final int two;
private static final int three = 3;
//private static final int four; // DOES NOT COMPILE as not initialised
static {
one = 1;
two = 2;
//three = 3; // DOES NOT COMPILE as already initialised at declaration
//two = 4; // DOES NOT COMPILE as already initialised
}



}
