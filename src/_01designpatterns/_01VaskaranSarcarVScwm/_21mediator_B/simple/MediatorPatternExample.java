package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.simple;

/**
 * Created by Gra_m on 2022 05 23
 * GOF:
 * Define an object that encapsulates how a set of objects interact.
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary
 * their interaction independently.
 *
 * IN A NUTSHELL:
 * You have a group of objects that must interact with each other but to do so explicitly is either not possible or would
 * lead to too many complicated, hard to maintain dependencies. You implement the mediator pattern, used as an
 * intermediary between the objects it encapsulates all of their interactions within itself, leaving the objects and
 * your codebase loosely coupled, encapsulated and open for expansion.
 *
 */

public class MediatorPatternExample {
	public static void main(String[] args) throws InterruptedException{

		System.out.println("***Mediator Pattern Demo***\n");

		ConcreteMediator mediator = new ConcreteMediator();

		JuniorEmployee amit = new JuniorEmployee(mediator, "Amit");
		JuniorEmployee sohel = new JuniorEmployee(mediator, "Sohel");
		SeniorEmployee raghu = new SeniorEmployee(mediator, "Raghu");

		//Registering participants
		mediator.register(amit);
		mediator.register(sohel);
		mediator.register(raghu);
		//Displaying the participant's list
		mediator.displayRegisteredEmployees();

		System.out.println("Communication starts among participants...");
		amit.sendMessage("Hi Sohel,can we discuss the mediator pattern?");
		sohel.sendMessage("Hi Amit,yup, we can discuss now.");
		raghu.sendMessage("Please get back to work quickly.");
		//An outsider/unknown person tries to participate
		Unknown unknown = new Unknown(mediator, "Jack");
		unknown.sendMessage("Hello Guys..");
	}
}
