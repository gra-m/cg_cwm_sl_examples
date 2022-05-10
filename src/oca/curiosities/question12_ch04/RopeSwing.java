package oca.curiosities.question12_ch04;

import oca.curiosities.question12_ch04.rope.*;
import static oca.curiosities.question12_ch04.rope.Rope.*;

public class RopeSwing {
private static Rope rope1 = new Rope();
private static Rope rope2 = new Rope();

{
	System.out.println(rope1.length);
}

/*static {
	System.out.println(rope1.length);
}*/

public static void main(String[] args) {
	rope1.length = 2;
	rope2.length = 8;
	System.out.println(rope1.length);

	System.out.println("Instance block never called, no instances. Rope field length is static.");

	rope1.phoneNumber = 01234;
	rope2.phoneNumber = 5678;

	System.out.println("Phone number is not static..");

	System.out.println(rope1.phoneNumber);
	System.out.println(rope2.phoneNumber);

}
}
