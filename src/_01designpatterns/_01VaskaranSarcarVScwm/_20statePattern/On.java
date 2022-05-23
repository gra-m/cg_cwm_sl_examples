package _01designpatterns._01VaskaranSarcarVScwm._20statePattern;

/**
 * Created by Gra_m on 2022 05 23
 */

public class On implements PossibleState{
	@Override
	public void pressOnButton(TvContext tvContext) {
		System.out.println("The TV is already on");
	}

	@Override
	public void pressOffButton(TvContext tvContext) {
		PossibleState currentState =  new Off();
		tvContext.setCurrentState(currentState);
	}

	@Override
	public void pressMuteButton(TvContext tvContext) {
		PossibleState currentState =  new Mute();
		tvContext.setCurrentState(currentState);
	}

	@Override
	public String toString() {
		return "On: With sound{}";
	}
}
