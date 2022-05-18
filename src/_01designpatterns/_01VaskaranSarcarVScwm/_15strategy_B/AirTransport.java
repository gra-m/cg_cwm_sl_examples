package _01designpatterns._01VaskaranSarcarVScwm._15strategy_B;

/**
 * Created by Gra_m on 2022 05 18
 *
 * This class represents a strategy/behaviour
 */

public class AirTransport implements TransportMediumStrategy {

	@Override
	public void transport() {
		System.out.println("By Air delivery has been requested\n" +
				"The necessary documentation is being processed automatically\n" +
				"Delivery will be completed within 48 hours.");
	}
}
