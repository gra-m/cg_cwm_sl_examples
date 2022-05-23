package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.simple;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gra_m on 2022 05 23
 */

public class ConcreteMediator implements Mediator{
	List<Employee> participants = new ArrayList<>();

	@Override
	public void register(Employee employee) {
		participants.add(employee);
	}

	@Override
	public void sendMessage(Employee employee, String message)throws InterruptedException {
	if(participants.contains(employee)) {
		System.out.println(employee.getName() + " posts " + message + " @ " + LocalDateTime.now());
		Thread.sleep(10000);
	}else {
		System.out.println("An outsider named " + employee.getName() + " is trying to send messages..." );
	}

	}

	public void displayRegisteredEmployees(){
		System.out.println("Registered employees are:");
		for(Employee employee: participants)
			System.out.println(employee.getName());
	};
}
