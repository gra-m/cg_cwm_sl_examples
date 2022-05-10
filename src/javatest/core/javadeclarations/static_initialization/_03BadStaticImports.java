package javatest.core.javadeclarations.static_initialization;

// import static java.util.Arrays; // DOES NOT COMPILE cannot use static import to import a class

import java.util.Arrays;
import static java.util.Arrays.asList; // Intellij automatically imports Arrays above.

//static import java.util.Arrays.*; // DOES NOT COMPILE (keywords wrong order)

class _03BadStaticImports {
public static void main(String[] args) {
Arrays.asList("one"); // DOES NOT COMPILE //Does compile as Intellij does not allow error.
} }
