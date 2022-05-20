package _01designpatterns._01VaskaranSarcarVScwm._16templateMethod;

/**
 * Created by Gra_m on 2022 05 20
 */

public class ComputerScience extends BasicEngineering{

	@Override
	public void completeSpecialPaper() {
		if(confirmSuccessfulCompletion())
			System.out.println("3.Object-Oriented-Programming successfully completed");
	}

	@Override
	protected Boolean additionalCourseRequired() {
		return false;
	}


	}
