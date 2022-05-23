package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.simple;

/**
 * Created by Gra_m on 2022 05 23
 */

public abstract class Employee extends ConcreteMediator {
	protected String name;
	protected Mediator mediator;

	public Employee(Mediator mediator) {
		this.mediator = mediator;
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sendMessage(String message) throws InterruptedException {
		mediator.sendMessage(this, message);
	}

	public abstract String employeeType();
}
