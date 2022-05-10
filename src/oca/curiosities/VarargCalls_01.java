package oca.curiosities;

public class VarargCalls_01 {
public static void main(String[] args) {

	//System.out.println(howMany());
	System.out.println(howMany(true));
	System.out.println(howMany(true, true));
	System.out.println(howMany(true, true, true));
	//System.out.println(howMany(true, {true, true});
	System.out.println(howMany(true, new boolean[]{true, true}));
	System.out.println(howMany(true, new boolean[2]));


}

public static int howMany(boolean b, boolean... b2) {
	return b2.length;
}
}
