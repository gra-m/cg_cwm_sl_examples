package _01designpatterns._01VaskaranSarcarVScwm._20statePattern;

/**
 * Created by Gra_m on 2022 05 23
 *
 * GOF:
 * Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
 *
 * IN A NUTSHELL:
 * Instead of using a lot of unwieldy if/else blocks to control your code you think about the wholly independent states
 * it has within it. Then, allow objects to behave differently dependent on their current state.
 */

public class StatePatternExample {
	public static void main(String[] args) {
		System.out.println("***State Pattern Example***");
		PossibleState turnOnMyTv = new On();
		TvContext myTvContext = new TvContext();

		myTvContext.setCurrentState(turnOnMyTv);
		myTvContext.getCurrentState();

		myTvContext.pressOffButton();
		myTvContext.getCurrentState();

		myTvContext.pressMuteButton();
		myTvContext.getCurrentState();

		myTvContext.pressOnButton();
		myTvContext.getCurrentState();

		myTvContext.pressMuteButton();
		myTvContext.getCurrentState();

		myTvContext.pressMuteButton();
		myTvContext.getCurrentState();

		myTvContext.pressOnButton();
		myTvContext.getCurrentState();

	}

}
