package cg.examples;

public class CallOrder {

public static void main(String[] args) {
	Cat cat = new Cat("Brain", "Heart", "Tail");
}

static class Animal {

	String brain = "Initial value of brain in the Animal class";
	String heart = "Initial value of heart in the Animal class";

	public static int animalCount = 7700000;

	public Animal(String brain, String heart) {
		System.out.println("Animal base class constructor is running");
		System.out.println("Have the variables of the Animal class already been initialized?");
		System.out.println("Current value of static variable animalCount = " + animalCount);
		System.out.println("Current value of brain in the Animal class = " + this.brain);
		System.out.println("Current value of heart in the Animal class = " + this.heart);
		System.out.println("Have the variables of the Cat class already been initialized?");
		System.out.println("Current value of static variable catCount = " + Cat.catCount);

		this.brain = brain;
		this.heart = heart;
		System.out.println("Animal base class constructor is done!");
		System.out.println("Current value of brain = " + this.brain);
		System.out.println("Current value of heart = " + this.heart);
	}
}

static class Cat extends Animal {

	String tail = "Initial value of tail in the Cat class";

	static int catCount = 37;

	public Cat(String brain, String heart, String tail) {
		super(brain, heart);
		System.out.println("The Cat class constructor has started (The Animal constructor already finished)");
		System.out.println("Current value of static variable catCount = " + catCount);
		System.out.println("Current value of tail = " + this.tail);
		this.tail = tail;
		System.out.println("Current value of tail = " + this.tail);
	}


}

}
