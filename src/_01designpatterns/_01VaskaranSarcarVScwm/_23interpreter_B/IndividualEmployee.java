package _01designpatterns._01VaskaranSarcarVScwm._23interpreter_B;

/**
 * Created by Gra_m on 2022 05 24
 */

public class IndividualEmployee implements Employee{
	private int yearsOfExperience;
	private String currentGrade;

	public IndividualEmployee(int experience, String grade) {
		this.yearsOfExperience = experience;
		this.currentGrade = grade;
	}

	@Override
	public boolean interpret(Context context) {
		return this.yearsOfExperience >= context.getYearsOfExperience() && context.getPermissableGrades().contains(this.currentGrade);
	}
}
