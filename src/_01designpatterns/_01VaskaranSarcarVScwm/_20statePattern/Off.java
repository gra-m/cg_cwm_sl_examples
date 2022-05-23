package _01designpatterns._01VaskaranSarcarVScwm._20statePattern;

/**
 * Created by Gra_m on 2022 05 23
 */

public class Off implements PossibleState {
	public void pressOnButton(TvContext tvContext) {
		PossibleState currentState =  new On();
		tvContext.setCurrentState(currentState);
	}
	public void pressOffButton(TvContext tvContext) {
		PossibleState currentState =  new Off();
		tvContext.setCurrentState(currentState);}
	public void pressMuteButton(TvContext tvContext) {
		System.out.println("TV cannot be muted, it is currently switched off.");
	}

	@Override
	public String toString() {
		return "Off{}";
	}
}

