package oca.curiosities._0520hidden_vs_overridden;

public abstract class Bird {
private void fly() {
	System.out.println("Bird is flying - private method can only be hidden");
}
	void eatBees() {
		System.out.println("Bird is eating bees.");
}

public static void main(String[] args) {
	Bird bird = new Pelican();
	bird.fly();
	bird.eatBees();
}
}

class Pelican extends Bird {
//@Override //Hidden!
	protected void fly() {
		System.out.println("Pelican is flying - this has hidden, not overridded fly()\n" +
			                   "Reference to object, not the object decides which is " +
			                   "called.");
	}
	@Override
	void eatBees() {
			System.out.println("Pelicans don't, but this is a normally overridden method" +
				                    "\ncalled to type");
		}


}
