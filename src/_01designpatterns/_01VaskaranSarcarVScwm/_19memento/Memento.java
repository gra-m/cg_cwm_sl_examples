package _01designpatterns._01VaskaranSarcarVScwm._19memento;

/**
 * Created by Gra_m on 2022 05 21
 */

public class Memento {
	private int stateId;

	public Memento(int stateId) {
		this.stateId = stateId;
	}

	public int getState() {
		return this.stateId;
	}
}
