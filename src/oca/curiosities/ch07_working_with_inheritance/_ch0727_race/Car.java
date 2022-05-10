package oca.curiosities.ch07_working_with_inheritance._ch0727_race;

// Lesson == you can define a constructor in an abstract class without issue
// even though it cannot be instantiated.


abstract class Car {
static {System.out.print("1");}

public Car(String name) {
	//super();
	System.out.println("2");
}
}
