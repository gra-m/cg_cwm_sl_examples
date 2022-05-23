package _01designpatterns._01VaskaranSarcarVScwm._20statePattern;

/**
 * Created by Gra_m on 2022 05 23
 */

public interface PossibleState {
	void pressOnButton(TvContext tvContext);
	void pressOffButton(TvContext tvContext);
	void pressMuteButton(TvContext tvContext);
}
