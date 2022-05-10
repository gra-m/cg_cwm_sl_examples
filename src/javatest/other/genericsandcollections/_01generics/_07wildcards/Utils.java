package javatest.other.genericsandcollections._01generics._07wildcards;

class Utils {

public static <T extends Comparable<T>> T max(T first, T second){
	return (first.compareTo(second) < 0) ? second : first;
}

public static <K, V> void print(K key, V value) {
	System.out.print("K, V generic -> ");
	System.out.println(key + " = " + value);
}

public static void print(User user) {
	System.out.println(user.toString());
}

//15 Without wildcards this method cannot accept a list of childclass <Instructor>
public static void printUsers(GenericList<User> userList, int soDifferentSignature) {
}

//15a Wildcard -> Unknown type, can now pass a list of anything.
//16 how does it work? Java creates a ? class of CAP#1 {} (Capture class)
//But we can only get and save as type Object or it's CAP#1 class, which we do not have access to
public static void printUsers(GenericList<?> users, long soDifferentSig) {
	Object x = users.get(0);
}

//16a To be able to READ from List use EXTENDS:
public static void printUsers(GenericList<? extends User> users, Number soDifferentSig) {
	Object couldPreviouslyOnlyGetThis_16 = users.get(0); // see 16
	//users.add(new User(23)); // cannot write to list
	User canGetWhatWeWantWithExtends = users.get(0);


}

//16b To be able to WRITE to List use SUPER:
// it makes the users parameter be used by the compiler like this: GenericList<Object> temp = new GenericList<>();
public static void printUsers(GenericList<? super User> users) {
	//User cannotGetWhatWeWantWithSuper = users.get(0);
	users.add(new User(23)); // now we can add new stuff to our GenericList
	users.add(new Instructor(33)); // any user or any of it's subclasses
}


}
