package cg;

// Inheritance, using Parent field exclusively.
class TheCat {
public static void main(String[] args) {
	Pet pet = new Cat();
	pet.setName("I'm Fluffy");

	System.out.println(pet.getName());
}

static class Pet {
	protected String name;

	public Pet() {
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

}

static class Cat extends Pet {
	//String name; // with subClass field
	public Cat(){}

	//public String getName() {return this.name; } // with subClass field
	String getName() {return super.getName();}
	void setName(String name) {super.name = "I'm a cat";}

}
}

