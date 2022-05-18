package _01designpatterns._01VaskaranSarcarVScwm._15strategy_B;

/**
 * Created by Gra_m on 2022 05 18
 */

public class Boat extends Vehicle{

	public Boat() {
		transportMediumStrategy = new WaterTransport();
	}

	@Override
	public void showMe() {
		System.out.println("I am a boat");
	}
}
