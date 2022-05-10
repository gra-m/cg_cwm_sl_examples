package cg.interfaces;

class _00CA_PolymorphicParameters_NonStatic {

public static void main(String[] args) {
	_00CA_PolymorphicParameters_NonStatic app = new _00CA_PolymorphicParameters_NonStatic();
	app.FeedAppStart();
}

void FeedAppStart() {
	ZooWorker zooWorker = new ZooWorker();
	zooWorker.feed(new Alligator());
	zooWorker.feed(new Crocodile());
	zooWorker.feed(new Reptile());
}
}

class ZooWorker {
public void feed(Reptile reptile) {
	System.out.println("Feeding: " + reptile.getName());
}
}

class Reptile {
String getName() {
	return "Reptile";
}
}

class Alligator extends Reptile {
String getName() {
	return "Alligator";
}
}

class Crocodile extends Reptile {
String getName() {
	return "Crocodile";
}
}


