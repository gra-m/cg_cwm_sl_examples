package _01designpatterns._01VaskaranSarcarVScwm._18iterator._core_example;

/**
 * Created by Gra_m on 2022 05 21
 */

class ArtsIterator implements Iterator{
	String[] papers;
	int position;

	public ArtsIterator(String[] papers) {
		this.papers = papers;
		position = 0;
	}


	@Override
	public void first() {
		position = 0;
	}

	@Override
	public String next() {
		System.out.println("2. Currently pointing at " + this.currentItem());
		return papers[position++];
	}

	@Override
	public String currentItem() {
		return papers [position];
	}

	@Override
	public boolean hasNext() {
		return position < papers.length;
	}
}
