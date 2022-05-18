package _01designpatterns._01VaskaranSarcarVScwm._15strategy_B;

/**
 * Created by Gra_m on 2022 05 18
 *
 * This class represents a strategy/behaviour
 */

public class WaterTransport implements TransportMediumStrategy {

	@Override
	public void transport() {
		System.out.println("By Water delivery has been requested\n" +
				"The necessary documentation is being processed automatically\n" +
				"Delivery will be completed within two weeks.");
	}
}
