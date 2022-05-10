package oca.curiosities.ch07_working_with_inheritance.q25_deconstructed;

public abstract class AbstractSouperClass implements Interfface { // Level1
}

interface Interfface {} // Origin


class ConcreteSouperClass extends AbstractSouperClass{ // Level2
public static void main(String[] args) {
	System.out.println("hello");

	//region A reference to a class(a) CANNOT be assigned to a subclass reference (b) WITHOUT
	//a specific cast.

	ConcreteSouperClass concreteSouperClass1 = new ConcreteSouperClass(); //(a)
	SubbClass subbClass1 = new SubbClass(); // (b)

	SubbClass subbClassA = (SubbClass) new ConcreteSouperClass();


	//subbClass1 = concreteSouperClass1; // without specific cast
	subbClass1 = (SubbClass) concreteSouperClass1; // with specific cast

	//endregion

	//region A reference to a subclass(a) CAN be assigned to a superclass reference (b) WITHOUT
	//a specific cast.

	SubbClass subbClass2 = new SubbClass(); // (a)
	ConcreteSouperClass concreteSouperClass2 = new ConcreteSouperClass(); //(b)

	concreteSouperClass2 = subbClass2; // without specific cast

	ConcreteSouperClass concreteSouperClassB = new SubbClass();

	//endregion

// region A reference to an Interface (a) CAN be assigned to a reference of a class that implements
// the interface WITH an explicit cast:
	Interfface interfface3 = new ConcreteSouperClass(); // (a)
	SubbClass subbClass3 = new SubbClass(); //(b)

	Interfface interfface4 = new SubbClass();


	// subbClass3 = interfface3; // without explicit cast
	subbClass3 = (SubbClass) interfface3;

	ConcreteSouperClass concreteSouperClass4 = (SubbClass) interfface4;

// endregion


	// region A reference to a class that implements an interface can be assigned
	// to an interface reference WITHOUT an explicit cast


SubbClass subbClass4 = new SubbClass();
Interfface interfface5 = subbClass4;


	// end region

}
}



class SubbClass extends ConcreteSouperClass { // Level3

}
