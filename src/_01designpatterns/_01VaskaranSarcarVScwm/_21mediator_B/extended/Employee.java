package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.extended;

/**
 * Created by Gra_m on 2022 05 23
 */

public abstract class Employee {
	private Mediator mediator;
	protected String name;
	private boolean authorisedUser;

	public Employee(Mediator mediator, String name, boolean authorised) {
		this.mediator = mediator;
		this.name = name;
		this.authorisedUser = authorised;
		if(authorisedUser)
			mediator.register(this);
	}

	void send(Employee toFriend, String message) throws InterruptedException{
		mediator.sendMessage(this, toFriend, message);
	}

	void receive(Employee fromFriend, String message) {
		System.out.println(this.name + " received a message : " + message + " from an employee " + fromFriend.getName() + ".");
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String employeeType();

	public boolean isAuthorisedUser() {
		return authorisedUser;
	}

	public void setAuthorisedUser(boolean authorisedUser) {
		this.authorisedUser = authorisedUser;
	}


}
