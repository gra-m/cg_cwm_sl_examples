package javatest.other.genericsandcollections._01generics._01;

class AppClass {
public static void main(String[] args) {

	//BENEFIT over <Object> List == compile time type safety (<Object> is still used in the bytecode)
	//new GenericList<Integer>().add("a"); //03 now generic list additions are typechecked for Integer

	var list = new GenericList<Integer>();
	list.add(1);

	int number = list.get(0); // BENEFIT Integer shown as return type.
}
}
