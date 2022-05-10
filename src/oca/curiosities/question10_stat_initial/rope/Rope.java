package oca.curiosities.question10_stat_initial.rope;

public class Rope {
public static int LENGTH = 5;
public String LENGTH2 = "FIVE";

static{
	LENGTH = 10; // I thought this ran BEFORE EVERYTHING ELSE
}

{LENGTH2 = "TEN";}



static public void swing() { // yes it allows optionals to be in any order.
	System.out.println("swing");
}
}
