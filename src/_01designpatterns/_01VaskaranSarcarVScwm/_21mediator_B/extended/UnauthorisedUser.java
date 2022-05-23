package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.extended;

/**
 * Created by Gra_m on 2022 05 23
 */

public class UnauthorisedUser extends Employee{

	public UnauthorisedUser(Mediator mediator, String name){
		super(mediator, name, false);
	}

	@Override
	public String employeeType() {
		return "UnauthorisedUser";
	}



	@Override
	public String toString() {
		return "UnauthorisedUser{}";
	}
}
