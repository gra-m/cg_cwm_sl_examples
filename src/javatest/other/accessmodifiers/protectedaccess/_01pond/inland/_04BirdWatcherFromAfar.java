package javatest.other.accessmodifiers.protectedaccess._01pond.inland;

import javatest.other.accessmodifiers.protectedaccess._01pond.shore._01Bird;

public class _04BirdWatcherFromAfar {
public void watchBird(){
	_01Bird bird = new _01Bird();
	//bird.floatInWater(); // does not compile protected
	//System.out.println(_01Bird.text); // dn c
}
}
