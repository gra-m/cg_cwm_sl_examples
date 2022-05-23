package _01designpatterns._01VaskaranSarcarVScwm._20statePattern;

/**
 * Created by Gra_m on 2022 05 23
 */

public interface RemoteControl {

	PossibleState getCurrentState();
	void setCurrentState(PossibleState possibleState);
	void pressOffButton();
	void pressOnButton();
	void pressMuteButton();
}
