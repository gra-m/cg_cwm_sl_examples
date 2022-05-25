package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.takaakiteshima;

/**
 * Copied on 2022 05 25
 */

class Trouble {

	// Trouble number
	public final int id;

	public Trouble(int id) {
		// ˅
		this.id = id;
		// ˄
	}

	@Override
	public String toString() {
		// ˅
		return "[Trouble " + id + "]";
		// ˄
	}
}

