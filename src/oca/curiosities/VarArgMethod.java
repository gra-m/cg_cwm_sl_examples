package oca.curiosities;

public class VarArgMethod {
public static void main(String[] args) {

	// legal calls to boolean boolean...:
	System.out.println(howMany(true, true, false, true, true, false, true));
	System.out.println(howMany(true, true, true));
	System.out.println(howMany(true, new boolean[2]));

	// legal calls to boolean boolean[]
	System.out.println(howMany2(true, new boolean[] {true, false, true, true, false, true}));
	System.out.println(howMany2(true, new boolean[]{true, true}));
	System.out.println(howMany2(true, new boolean[2]));

}

private static int howMany(boolean b, boolean... b2){
	return b2.length;
}

private static int howMany2(boolean b, boolean[] b2){
	return b2.length;
}

/*private static void varArgNotLast(boolean... b2, boolean b1){

}*/

}
