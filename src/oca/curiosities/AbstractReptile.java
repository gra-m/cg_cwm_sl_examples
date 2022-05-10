package oca.curiosities;

abstract class AbstractReptile {

public final void layEggs(){
	System.out.println("Reptile laying eggs only in the manner specified in abstract class.");
}

abstract void makeEggs();

void thinkingThereforeIam(){
	System.out.println("Abstractedly thinking");
}

static void beingStaticAvailableEverywhere() {
	System.out.println("I always am, wherever you want me");
}

public static void main(String[] args) {
	AbstractReptile reptile = new Lizard();
	reptile.layEggs(); // final enforced implementation of this method
	reptile.makeEggs(); // abstract, enforced overriding
	reptile.thinkingThereforeIam(); // implemented suggestion of behaviour in superclass
	reptile.beingStaticAvailableEverywhere();
	beingStaticAvailableEverywhere();

	System.out.println();

	Lizard reptile2 = new Lizard();
	reptile2.layEggs();
	reptile2.makeEggs();
	reptile2.thinkingThereforeIam();
	reptile2.beingStaticAvailableEverywhere();
}

}

class Lizard extends AbstractReptile{

void makeEggs(){
	System.out.println("and ..Making eggs only like a non abstract reptile can.");
}

void thinkingThereforeIam() {
	System.out.println("This lizard has had a philosophical breakthrough, it thinks without amming.");
}

 //public void layEggs() cannot do that, it's final.

static void beingStaticAvailableEverywhere() {
	System.out.println("I am too, I am just another static method with the same signature, I am not an override");
}


}
