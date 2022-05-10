package oca.curiosities;

public class StringGobblesBoolean {
public static void main(String[] args) {
	String a = "";
	a += 2;
	a += 'c';
	a += true;
	a += false;

	String c = "ButThisFuckingIs";
	c += 'x';

	String d = "but this is" + 'a';

	System.out.println(a);

}
}
