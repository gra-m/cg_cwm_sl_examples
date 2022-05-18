package _01designpatterns._01VaskaranSarcarVScwm._15strategy_B;

/**
 * Created by Gra_m on 2022 05 18
 *
 * SP Says: This is the CONTEXT CLASS
 *
 *
 */

public abstract class Vehicle {
	//A context object contains reference variables for the strategy objects interface type.
	TransportMediumStrategy transportMediumStrategy;

	public Vehicle() {
	}

	public void showTransportMedium(){
		//Delegate the task to the corresponding behavior class.
		transportMediumStrategy.transport();
	};

	public void commonJob() {
		System.out.println("We can all be used to transport");
	};

	public abstract void showMe();

}
