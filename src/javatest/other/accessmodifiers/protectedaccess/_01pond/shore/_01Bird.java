package javatest.other.accessmodifiers.protectedaccess._01pond.shore;

//P177 protected => child class can access in another package.
// get rid of protected == package protected Gosling can no longer access.

public class _01Bird {

protected String text = "floating";
protected void floatInWater() {
	System.out.println(text);
}

}
