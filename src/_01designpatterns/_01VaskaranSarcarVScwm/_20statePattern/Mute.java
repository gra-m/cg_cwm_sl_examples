package _01designpatterns._01VaskaranSarcarVScwm._20statePattern;

/**
 * Created by Gra_m on 2022 05 23
 */

public class Mute implements PossibleState{

	@Override
	public void pressOnButton(TvContext tvContext) {
		PossibleState currentState = new On();
		tvContext.setCurrentState(currentState);	}

	@Override
	public void pressOffButton(TvContext tvContext) {
		PossibleState currentState = new Off();
		tvContext.setCurrentState(currentState);	}

	@Override
	public void pressMuteButton(TvContext tvContext) {
		System.out.println("TV is already muted");
	}

	@Override
	public String toString() {
		return "Mute{}";
	}

	}
