package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.extended;

/**
 * Created by Gra_m on 2022 05 23
 */

public class ConcreteEmployee extends Employee{

	public ConcreteEmployee(Mediator mediator, String message, boolean authorised) {
		super(mediator, message, authorised);
	}

	public String employeeType() {
		return this.toString();
	}
}
