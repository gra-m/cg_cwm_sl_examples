package cg.interfaces;

class _00CA_PolymorphicParameters {
public static void main(String[] args) {
	ZooWorker.feed(new Alligator());
	ZooWorker.feed(new Crocodile());
	ZooWorker.feed(new Reptile());
}

public static class Reptile {
	public String getName() {
		return "Reptile";
	}
}

public static class Alligator extends Reptile {
	public String getName() {
		return "Alligator";
	}
}

public static class Crocodile extends Reptile {
	public String getName() {
		return "Crocodile";
	}
}

public static class ZooWorker {
public static void feed(Reptile reptile) {
	System.out.println("Feeding: " + reptile.getName());
}
}


}