package oca.curiosities;

/*
Order of Initialization
Chapter 1 covered the order of initialization. Now that you’ve learned about static initializers,
it is time to revisit that. Unfortunately, you do have to memorize this list. We’ll give you lots of
practice, but you do need to know this order by heart.
1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For
now, just say “no superclass” and go on to the next rule.)
2. Static variable declarations and static initializers in the order they appear in the file.
3. Instance variable declarations and instance initializers in the order they appear in the file.
4. The constructor.
 */




public class InitializationOrder {

// Prints message and returns given object
static <T> T init(String name, T object) {
	System.out.printf("Initializing '%s' to '%s'%n",
		name, object);
	return object;
}

static class Base {
	private int i = init("Base instance i", 5);

	private static int x = init("Base static x", 1);

	private int ctorI;

	public Base() {
		ctorI = init("Base ctorI", 7);
	}

	private static int y = init("Base static y", 2);

	{ // instance initialization block:
		j = init("Base instance block j", 6);
	}

	private static int z;
	static { // static initialization block:
		z = init("Base.z static block", 3);
	}

	private int j;
}

static class Subclass extends Base {

	public Subclass() {
		ctorB = init("Subclass ctorB", 9);
	}

	int ctorB;

	int a = init("Subclass instance a", 8);

	static int foo = init("Subclass static foo", 4);
}

public static void main(String[] args) {
	System.out.println("First Subclass instance:");
	Base base = new Subclass();

	System.out.println("Another Subclass instance:");
	base = new Subclass();

	System.out.println("Instance of Base:");
	base = new Base();
}
}
