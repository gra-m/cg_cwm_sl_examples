package _01designpatterns._01VaskaranSarcarVScwm._15strategy_B;

/**
 * Created by Gra_m on 2022 05 18
 */

public class Aeroplane extends Vehicle{

	public Aeroplane() {
		transportMediumStrategy = new AirTransport();
	}

	@Override
	public void showMe() {
		System.out.println("I am an aeroplane");
	}
}
