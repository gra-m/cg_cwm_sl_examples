package oca.curiosities;

public class NoDefaultParentConstructor {

// add int age as a param below
public NoDefaultParentConstructor(){
	System.out.println("NoDefaultParentConstructor");
}

class ChildWithNoArgConstructor extends NoDefaultParentConstructor {
public ChildWithNoArgConstructor() {
	//super(5); // required when no default parent constructor.
	System.out.println("ChildWithNoArgConstructor");
}


}
public static void main(String[] args) {
	new NoDefaultParentConstructor();
}
}
