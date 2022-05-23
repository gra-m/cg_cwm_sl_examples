package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.simple;

/**
 * Created by Gra_m on 2022 05 23
 */

public class JuniorEmployee extends Employee{

	public JuniorEmployee(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}



	@Override
	public String employeeType() {
		return "Junior Employee";
	}
}
