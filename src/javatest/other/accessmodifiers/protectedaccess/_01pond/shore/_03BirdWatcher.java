package javatest.other.accessmodifiers.protectedaccess._01pond.shore;
// not a child of _01Bird but in same package

public class _03BirdWatcher {

public void watchBird() {
	_01Bird bird = new _01Bird();
	bird.floatInWater(); // calling protected member
	System.out.println(bird.text); // calling protected member
}
}
