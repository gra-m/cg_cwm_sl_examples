package javatest.core.lambda_expressions.lambda_hop_example;

public class Animal {
private String species;
private boolean hopper;
private boolean swimmer;
private boolean happy;

public Animal(String speciesName, boolean hopper, boolean swimmer, boolean happy) {
	this.species = speciesName;
	this.hopper = hopper;
	this.swimmer = swimmer;
	this.happy = happy;
}

@Override
public String toString() {
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
