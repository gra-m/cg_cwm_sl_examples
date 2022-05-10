package oca.start_test;

public class Oca_HeyYouNeedOurBookQuestions {
private static int $; // Question 1 class field

public static void main(String[] args) {


	// 02
	String s1 = "Java";
	String s2 = "Java";
	StringBuilder sb1 = new StringBuilder();
	sb1.append("Ja").append("va");
	System.out.println("Question 02");
	System.out.println(s1 == s2); // same object stringpool;
	System.out.println(s1.equals(s2));  // same value
	System.out.println(sb1.toString() == s1); // hey dumbass toString() doesn't use stringpool
	System.out.println(sb1.toString().equals(s1)); // same value

	// 04
	feedingSchedule();


}

private static void feedingSchedule() {
	boolean keepGoing = true;
	    int count = 0;
	    int x = 3;
	    while(count++ < 3) { // post increment means incremented as soon as count used in expression.
	      int y = (1 + 2 * count) % 3; // count is 1 by the time it gets here.
	      switch(y) {
	         default:  // default can go anywhere NOT JUST AT END and it causes case below it to be used (as default);
	         case 0: x -= 1; break;
	         case 1: x += 5;
	      }
	    }
	  System.out.println(x);
	 }

private static void questionOneMethod() {
	// 01
	String a_b;
	System.out.print($);
	//System.out.print(a_b); // local variable has not been initialized

}



// 03

interface HasTail {
	int getTailLength();
}

abstract class Puma implements HasTail {
	//protected int getTailLength() { // This cannot be narrower than public abstract in Interface
	public int getTailLength(){
		return 4;
	}
}

public class Cougar extends Puma {
/*	public static void main(String[] args) {
	//	Puma puma = new Puma(); // I missed this Puma is abstract, cannot be
	//	System.out.println(puma.getTailLength());
*/	}

	public int getTailLength(int length) { // This is OK based despite book answer, it is public
		return 2;
	}
}



