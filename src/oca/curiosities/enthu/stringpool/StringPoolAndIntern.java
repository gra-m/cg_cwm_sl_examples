package oca.curiosities.enthu.stringpool;

public class StringPoolAndIntern {


public static void main(String[] args) {
	String hello = "Hello", lo = "lo";
	System.out.print((Other.hello == hello) + " ");    //line 1 // StringPool
	System.out.print((OtherOther.hello == hello) + " ");   //line 2 // StringPool
	System.out.print((hello == ("Hel" + "lo")) + " ");           //line 3 // StringPool
	System.out.print((hello == ("Hel" + lo)) + " ");             //line 4 // lo computed at runtime == new String object
	System.out.println(hello == ("Hel" + lo).intern());          //line 5 // result of interning a computed string is any pre-existing (StringPool) string with the same contents.
}
}
