package oca.curiosities;

public class ThisInferring {
private int numberBags;
boolean call;

public ThisInferring() {
	this(2);
	//this(false);
}

public ThisInferring(int numberBags) {
	this.numberBags = numberBags;
}

public ThisInferring(boolean call){
	this.call = call;
}
}
