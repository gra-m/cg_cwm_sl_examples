package javatest.other.classes_interfaces.constructors.order_of_initialization;

class InitializationOrderSimple {
	private String name = "Torchie";

	{
		System.out.println(name);
	}

	private static int COUNT;

	static {
		COUNT = 0;
		System.out.println(COUNT);
	}

	static {
		COUNT += 10;
		System.out.println(COUNT);
	}

	public InitializationOrderSimple() {
		System.out.println("constructor, if there was a superclass, this would be fifth");
	}

public static void main(String[] args) {
		InitializationOrderSimple init = new InitializationOrderSimple();
	}
}