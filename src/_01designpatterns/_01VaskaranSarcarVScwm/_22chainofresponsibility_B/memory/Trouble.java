package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.memory;

/**
 * Created by Gra_m on 2022 05 25
 */

class Trouble {
	private int id;

	public Trouble(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "[Trouble" +
				"id: " + id +
				']';
	}
}
