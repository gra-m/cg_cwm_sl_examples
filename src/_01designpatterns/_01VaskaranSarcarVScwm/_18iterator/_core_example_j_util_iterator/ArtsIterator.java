package _01designpatterns._01VaskaranSarcarVScwm._18iterator._core_example_j_util_iterator;
import java.util.Iterator;


/**
 * Created by Gra_m on 2022 05 21
 */

public class ArtsIterator implements Iterator<String>  {
	String[] papers;
	int position;

	public ArtsIterator(String[] papers) {
		this.papers = papers;
		position = 0;
	}


	public void first() {
		position = 0;
	}

	public String currentItem() {
		return papers [position];
	}

	@Override
	public String next() {
		System.out.println("2. Currently pointing at " + this.currentItem());
		return papers[position++];
	}

	@Override
	public boolean hasNext() {
		return position < papers.length;
	}
}
