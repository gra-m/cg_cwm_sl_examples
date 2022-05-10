package oca.curiosities.mammal_platypus;

public class Mammal {
public Mammal(int age) {
	System.out.println("Mammal");
}
}

class Platypus extends Mammal {

public Platypus() {
	super(5); // COMMENT OUT TO SEE ISSUE
	System.out.println("Platypus");
}

public static void main(String[] args) {
 Mammal mammal = new Platypus();
 Platypus platypus = new Platypus();

 platypus = (Platypus) mammal; // cast required when reference to changed to subclass
 Mammal wiggle = platypus; // cast not required when reference changed to superclass.
}
}
