package cg.interfaces;
/*
Four mistakes
Correct the program's 4 bugs so that it compiles.


Requirements:
1. The variables declared in the interface must have the widest access level (public).
2. You can only extend a class. You implement interfaces using the implements keyword.
3. The Hobby class must be declared using the static modifier.
4. You don't need to create a Dream object to access the HOBBY variable.
5. Do not change interface declarations.
*/


/*


class _1aExample {
public static void main(String[] args) {

	System.out.println(new Dream().HOBBY.toString());
	System.out.println(new Hobby().toString());

}

interface Desire {
}

interface Dream {
	private static Hobby HOBBY = new Hobby();
}

class Hobby extends Desire implements Dream {
	static int INDEX = 1;

	@Override
	public String toString() {
		INDEX++;
		return "" + INDEX;
	}
}

}
*/
