package _01designpatterns._01VaskaranSarcarVScwm._19memento;

/**
 * Created by Gra_m on 2022 05 21
 * Make an object (originator) itself responsible for:
 * 1.Saving its internal state to a(memento) object and
 * 2.Restoring to a previous state from a(memento) object.
 * 3.Only the originator that created a memento is allowed to access it
 *
 *
 */

public class Originator {
	private int stateId;

	public Originator() {
		stateId = 0;
		System.out.println("Originator created with state id: " + getStateId());
	}

	public int getStateId(){
		return stateId;
	}

	public void setStateId(int id){
		System.out.println( "Setting the state Id of the originator to: " + id);
		this.stateId = id;
	}

	public Memento saveMemento(int stateId){
		System.out.println("Now saving Originator's current state id. ");
		// return Memento with current state
		return new Memento(stateId);
	}

	public void revertMemento(Memento previousMemento){
		System.out.println("Reverting to previous state held in Memento, that is: " + previousMemento.getState());
		this.stateId = previousMemento.getState();
		System.out.println("Current stateId of originator = " + stateId);
	}

}
