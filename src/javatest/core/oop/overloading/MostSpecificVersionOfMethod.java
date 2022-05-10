package javatest.core.oop.overloading;

public class MostSpecificVersionOfMethod {
public static void main(String[] args) {
	MostSpecificVersionOfMethod mostSpecificVersionOfMethod = new MostSpecificVersionOfMethod();
	mostSpecificVersionOfMethod.fly("test"); // calls string
	mostSpecificVersionOfMethod.fly(56); // calls object

	System.out.println();
	mostSpecificVersionOfMethod.fly(123); //exact match calls int
	mostSpecificVersionOfMethod.fly(123L); // exact match calls long
}

public void fly(String s) {
	System.out.println("string ");
}

public void fly(Object o) {
	System.out.println("object ");
}



public void fly(int i) {
	System.out.println("int ");
}

public void fly(long l) {
	System.out.println("long ");
}

}
