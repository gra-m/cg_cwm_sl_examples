package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.extended;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gra_m on 2022 05 23
 */

public class ConcreteMediator implements Mediator {
	List<Employee> participants = new ArrayList<>();

	@Override
	public void register(Employee employee) {
		participants.add(employee);
	}

	void displayRegisteredEmployees() {
		System.out.println("Registered participants are:");
		for (Employee employee : participants)
			System.out.println(employee.getName());
	}

	@Override
	public void sendMessage(Employee fromEmployee, Employee toEmployee, String message) throws InterruptedException {

		if (fromEmployee.employeeType() == "UnauthorisedUser") {
			System.out.println("[Alert Everyone] an outsider named " + fromEmployee.getName() +
					" is trying to message:" + toEmployee.getName());
			fromEmployee.receive(fromEmployee, "you are not authorised to chat here.");
		} else if (participants.contains(fromEmployee)) {
			System.out.println("---------------" + fromEmployee.getName() +
					" posted this message: " + message + " @ " + LocalDateTime.now());
			if (participants.contains(toEmployee)) {
				toEmployee.receive(fromEmployee, message);
			} else {
				System.out.println(fromEmployee.getName() + " your message recipient does not exist");
			}
		} else {
			System.out.println("[ALERT] an unregistered employee named " + fromEmployee.getName() +
					" is trying to message:" + toEmployee.getName());
			fromEmployee.receive(fromEmployee, "you need to register first.");
		}
	}
}
