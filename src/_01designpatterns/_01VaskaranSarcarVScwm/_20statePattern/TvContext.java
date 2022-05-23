package _01designpatterns._01VaskaranSarcarVScwm._20statePattern;

/**
 * Created by Gra_m on 2022 05 23
 */

public class TvContext implements RemoteControl {
	PossibleState currentState;

	@Override
	public PossibleState getCurrentState() {
		System.out.println("Current State Of TV is: " + currentState);
		return this.currentState;
	}

	@Override
	public void setCurrentState(PossibleState possibleState) {
		System.out.println("State Change: ");
		currentState = possibleState;
	}

	@Override
	public void pressOffButton(){
		currentState.pressOffButton(this);
	}
	@Override
	public void pressOnButton(){
		currentState.pressOnButton(this);
	}
	public void pressMuteButton(){
		currentState.pressMuteButton(this);
	}
}
