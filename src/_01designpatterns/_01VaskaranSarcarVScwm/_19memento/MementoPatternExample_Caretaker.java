package _01designpatterns._01VaskaranSarcarVScwm._19memento;

/**
 * Created by Gra_m on 2022 05 21
 * <p>
 * GOF:
 * Without violating encapsulation, capture and externalize an objects internal state so that the object can be restored
 * to this state later.
 * <p>
 * IN A NUTSHELL:
 * Achieving support for undo operations means recording the internal state of an object, but objects generally
 * encapsulate their states, you do not want to violate this encapsulation, so, memento pattern.
 */


/*
 * The Caretaker:
 *
 *The 'Caretaker' class.
 * WikiPedia notes(for your reference):
 * 1.A client (caretaker) can request a memento from the originator to save
 * the internal state of the originator and
 * 2.Pass a memento back to the originator (to restore to a previous state)
 * This enables to save and restore the internal state of an originator
 * without violating its encapsulation.
 */



public class MementoPatternExample_Caretaker {

	public static void main(String[] args) {


		System.out.println("***Memento Pattern Demo***\n");

		Originator originatorObject = new Originator();
		Memento mementoObject;

		originatorObject.setStateId(1);

		//Caretaker retrieves and saves:
		mementoObject = originatorObject.saveMemento(originatorObject.getStateId());
		System.out.println("\nSnapshot #1: Originator's current state id is saved in caretaker.");

		//A client (or caretaker) cannot set/modify the memento's state
		//mementoObject.setState("arbitratyState");//error

		//Changing the state id of Originator
		originatorObject.setStateId(2);
		mementoObject = originatorObject.saveMemento(originatorObject.getStateId());

		System.out.println("\nSnapshot #2: Originator's current state id is saved in caretaker.");

		//Changing the state id of Originator again.
		originatorObject.setStateId(3);

		//Reverting back to previous state id.
		originatorObject.revertMemento(mementoObject);
	}
}
