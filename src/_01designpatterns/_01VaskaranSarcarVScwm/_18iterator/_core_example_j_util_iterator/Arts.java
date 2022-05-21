package _01designpatterns._01VaskaranSarcarVScwm._18iterator._core_example_j_util_iterator;

import java.util.Iterator;
/**
 * Created by Gra_m on 2022 05 21
 */

public class Arts implements Subjects {
	String[] papers;

	public Arts() {
		papers = new String[] {"English", "History", "Geography", "Psychology"};
	}

	@Override
	public Iterator createIterator() {
		return new ArtsIterator(papers);
	}
}
