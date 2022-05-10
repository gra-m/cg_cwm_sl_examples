package oca.curiosities.ch07_working_with_inheritance.q21;
// see 2nd part, this is me playing and getting straight succinct from 43
public class TestClass {
public static void main(String[] args) {
	//Scenario 1 DownCast when super reference is a sub:
	SuperExample superExample1 = new SubExample();
	//Scenario 2 Attempted Downcast when super reference is a super
	SuperExample superExample2 = new SuperExample();
	//Scenario 3A Upcast of subExample reference that can only contain a subExample object (no further subs)
	SubExample subExample3A = new SubExample();
	//Scenario 3B impossible casting
//	SubExample subExample3B = (SubExample) new SuperExample();

	//Scenario x InterfaceExample containing a SubExample
	InterfaceExample interfaceExamplex = new SubExample();
	//Scenario x InterfaceExample containing a SuperExample
	InterfaceExample interfaceExamplexx = new SuperExample();

	//Scenario 1: OK
	SubExample subExample1 = new SubExample();
	System.out.println("subExample1 is a : " + subExample1.getClass() + " superExample1 is a : " + subExample1.getClass());
	subExample1 = (SubExample) superExample1; // explicit cast OK as superExample1 is a SubExample
	System.out.println("subExample1 is the SubExample that was in superExample1 reference");
	System.out.println(subExample1.getClass());
	//Scenario 2: Not OK == Class Cast exception
	SubExample subExample2 = new SubExample();
	//subExample2 = (SubExample) superExample2; // can never work as superExample2 is a SuperExample
	//SubExample subExample3B = (SubExample) new SuperExample(); // same as this, it can never be SubExample

	//Scenario 3A:Sub reference can be cast to Super reference without a explicit cast
	SuperExample superExample3 = new SuperExample();
	superExample3 = subExample3A;

	// Take away == what I implicitly knew already outside of the context of a question. If an object is a sub
	// class it can always be easily contained in a superclass reference of its own hierarchy without explicit casting.
	// Converting it back though can only occur into the correct subclass.. so you need to confirm to java that it really
	// is what you say it is:

	if(superExample3 instanceof SubExample)
		System.out.println("asdf");


	// Interfaces;

	// A interface reference:
	InterfaceExample interfaceExample1 = new SuperExample();
	// requires an explicit cast to be assigned to a reference of any class,
	// that implements it.
	SuperExample superExample4 = new SuperExample();
	superExample4= (SuperExample) interfaceExample1;
	System.out.println(superExample4);

	// A reference to a class
	SubExample subExample4 = new SubExample();
	// does not require an explicit cast to be assigne to a reference of an
	// interface that it implements.
	InterfaceExample interfaceExample2 = new SuperExample();
	interfaceExample2 = subExample4;
	System.out.println(interfaceExample2);

	// A Superclass reference:
	SuperExample superExample5 = new SubExample();
	// requires an explicit cast to be assigned to a reference a sub class
	SubExample subExample5 = new SubExample();
	subExample5 = (SubExample) superExample5;

	// it also actually need to be an instance of that class:
	// NOT SuperExample superExample6 = SuperExample

	// A subclass however can be assigned to a superclass reference without casting









}

public static class SomeStaticClass extends SuperExample{}


}
