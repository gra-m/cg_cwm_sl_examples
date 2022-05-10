package javatest.core.lambda_expressions.predicate_examples.basic_boolean_test;

class Animal implements LifeForm{
private String species;
private boolean hopper;
private boolean swimmer;
private boolean happy;

public Animal(String species, boolean hopper,
              boolean swimmer, boolean happy){
	this.species = species;
	this.hopper = hopper;
	this.swimmer = swimmer;
	this.happy = happy;
}

@Override
public String toString(){
	return this.species;
}

public String className() {
	return "Animal";
}

public String getSpecies() {
	return species;
}

public boolean isHopper() {
	return hopper;
}

public boolean isSwimmer() {
	return swimmer;
}

public boolean isHappy() {
	return happy;
}


}

