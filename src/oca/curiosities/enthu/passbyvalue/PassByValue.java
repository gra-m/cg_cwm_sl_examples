package oca.curiosities.enthu.passbyvalue;
// Good example if the object is mutable the value can be effected
import java.util.Stack;

public class PassByValue {

	public static void main(String args[]){
		Stack s1 = new Stack ();
		Stack s2 = new Stack ();
		processStacks (s1,s2);
		System.out.println (s1 + "    "+ s2);
	}
	public static void processStacks(Stack x1, Stack x2){
		// This line updates the value s1 and x1 share, the memory location.
		x1.push (Integer.parseInt("100")); // x1 has the same Value as s1 as it is referring to same memory location.
		// This line removes the only reference connection there was to s2.
		x2 = x1; // the local variable x2 points to the same location as x1 now s2 remains unchanged.
		x2.push(Integer.valueOf("123"));
	}
}


