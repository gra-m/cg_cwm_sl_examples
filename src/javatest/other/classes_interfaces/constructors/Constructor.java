package javatest.other.classes_interfaces.constructors;

public class Constructor {
private String extraInfo;
private String color;
private int height;
private int length;

public Constructor(String extraInfo, int length, int theHeight) {
	this.extraInfo = extraInfo; // normal when param and instance var the same
//length = this.length; // backwards – no good!
	height = theHeight; // fine because a different name
	this.color = "white"; // fine, but this. not required, not passed
}

public static void main(String[] args) {
	Constructor b = new Constructor("Don't feed at night", 1, 2);
	System.out.println(b.extraInfo + " length defaults " + b.length + " height " + b.height + " " + b.color);
}
}
