package _01designpatterns._01VaskaranSarcarVScwm._23interpreter_B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gra_m on 2022 05 24
 */

public class Context {
	private int yearsOfExperience;
	private List<String> permissableGrades;

	public Context(int experience, String... allowedGrades) {
		this.yearsOfExperience = experience;
		this.permissableGrades= new ArrayList<>();
		permissableGrades.addAll(Arrays.asList(allowedGrades));

	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public List<String> getPermissableGrades() {
		return permissableGrades;
	}

}
