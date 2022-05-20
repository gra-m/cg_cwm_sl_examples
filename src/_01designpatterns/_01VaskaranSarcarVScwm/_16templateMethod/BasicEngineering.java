package _01designpatterns._01VaskaranSarcarVScwm._16templateMethod;

/**
 * Created by Gra_m on 2022 05 20
 *
 * The structure of a basic engineering course is outlined in this template:
 *
 * Mathematics and SoftSkills obligatory.
 *
 */

public abstract class BasicEngineering {

	//immutable whatever 'sub-course' -> must follow these templated steps
	public final void completeCourse(){
		//The algorithm:
		//Common:
		completeMath();
		completeSoftSkills();
		//Special/Individual:
		completeSpecialPaper();
	}

	//always different
	public abstract void completeSpecialPaper();

	//1/2 templated requirements for 'sub-courses'
	public void completeMath() {
		if(confirmSuccessfulCompletion())
			System.out.println("1.Mathematics successfully completed");
	}

	//2
	public void completeSoftSkills() {
		if(confirmSuccessfulCompletion())
			System.out.println("2.SoftSkills successfully completed");
	}


	protected Boolean confirmSuccessfulCompletion(){
		return true;
	}


}
