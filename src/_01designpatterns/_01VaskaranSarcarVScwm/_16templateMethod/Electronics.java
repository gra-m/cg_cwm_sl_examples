package _01designpatterns._01VaskaranSarcarVScwm._16templateMethod;

/**
 * Created by Gra_m on 2022 05 20
 */

public class Electronics extends BasicEngineering{
	@Override
	public void completeSpecialPaper() {
		if(confirmSuccessfulCompletion())
			System.out.println("3.Digital Logic and Circuit Theory successfully completed");
	}
}
