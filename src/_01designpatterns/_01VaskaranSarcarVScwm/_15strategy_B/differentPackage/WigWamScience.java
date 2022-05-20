package _01designpatterns._01VaskaranSarcarVScwm._15strategy_B.differentPackage;

import _01designpatterns._01VaskaranSarcarVScwm._16templateMethod.BasicEngineering;

/**
 * Created by Gra_m on 2022 05 20
 */

public class WigWamScience extends BasicEngineering {
	@Override
	public void completeSpecialPaper() {
		if(confirmSuccessfulCompletion())
			System.out.println("3.Wigwamification of quantum particles successfully completed");
	}

	@Override
	protected Boolean additionalCourseRequired() {
		return false;
	}
}
