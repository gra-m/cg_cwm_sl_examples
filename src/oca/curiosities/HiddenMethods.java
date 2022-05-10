package oca.curiosities;
/*Because fly is private it can only be hidden
fly2 behaves as would be expected.
 */

public abstract class HiddenMethods {
private void hidden() {
	System.out.println("I'm private in the parent, I can only be hidden, not overridden");
}

protected void notHidden() {
	System.out.println("I can be overridden I call to type as normal, not by reference.");

}

public static void main(String[] args) {
	System.out.println("With hidden methods the specific method used depends on where it is referenced.\n\n");
	HiddenMethods hiddenMethods = new ChildOfHiddenMethods();
	hiddenMethods.hidden();
	ChildOfHiddenMethods hiddenMethodsWithChildReference = new ChildOfHiddenMethods();
	hiddenMethodsWithChildReference.hidden();


	hiddenMethods.notHidden();
	hiddenMethodsWithChildReference.notHidden();



}


}

class ChildOfHiddenMethods extends HiddenMethods {
protected void hidden(){
	System.out.println("I need to be a reference as well as an instance of ChildOfHiddenMethods in order to" +
		                   "ever be called");
}

protected void notHidden() {
	System.out.println("I just have to be an instance of ChildOfHiddenMethods to be shown");

}
}
