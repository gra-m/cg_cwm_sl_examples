package javatest.other.classes_interfaces.constructors.constructor_chaining;

public class _01Mouse {

	private int numTeeth;
	private int numWhiskers;
	private int weight;
	private static final int DEFAULT_TEETH = 10;
	private static final int DEFAULT_WHISKERS;
	private static final int RANDOM_INTEGER;

	static{
		RANDOM_INTEGER = 45 % 10; // externally retrieved value
		DEFAULT_WHISKERS = DEFAULT_TEETH * RANDOM_INTEGER;
	}

	public _01Mouse(int weight) {
		this(weight, DEFAULT_TEETH); // calls constructor with 2 parameters
	}
	public _01Mouse(int weight, int numTeeth) {
		this(weight, numTeeth, DEFAULT_WHISKERS); // calls constructor with 3 parameters
	}
	public _01Mouse(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
	}
	public void print() {
		System.out.println("weight " + weight + " number of teeth " + numTeeth + " number of whiskers " + numWhiskers);
	}
	public static void main(String[] args) {
		_01Mouse mouse = new _01Mouse(15);
		mouse.print();
	}
}
