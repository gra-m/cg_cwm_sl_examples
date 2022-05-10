package cg.interfaces;
/*
Four mistakes

*/

class _1aSolution {

public static void main(String[] args) {

	System.out.println(Dream.HOBBY.toString());
	System.out.println(new Hobby().toString());

}

interface Desire {
}

interface Dream {
	Hobby HOBBY = new Hobby();
}

public static class Hobby implements Desire, Dream {
	public int INDEX = 1;

	@Override
	public String toString() {
		INDEX++;
		return "" + INDEX;
	}
}

}