package cg;

public class TheCat2 {
	public static void main(String[] args) {
		Pet pet = new Cat();
		pet.setName("I'm Fluffy");

		System.out.println(pet.getName());
	}
	public static class Pet {
		protected String name;

		public Pet() {
		}
		public final String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
	public static class Cat extends Pet {

		public Cat(){}

		public void setName(String ignored){this.name = "";}
	}
}

