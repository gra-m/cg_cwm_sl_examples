package _01designpatterns._01VaskaranSarcarVScwm._18iterator._core_example;

/**
 * Created by Gra_m on 2022 05 21
 */

class Arts implements Subjects{
	String[] papers;

	public Arts() {
		papers = new String[] {"English", "History", "Geography", "Psychology"};
	}

	@Override
	public Iterator createIterator() {
		return new ArtsIterator(papers);
	}
}
