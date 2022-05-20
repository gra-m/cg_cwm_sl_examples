package _01designpatterns._01VaskaranSarcarVScwm._17command;

/**
 * Created by Gra_m on 2022 05 20
 */

public class Receiver {

	public void performUndo(){
		System.out.println("Performing Undo Command in Receiver");}
	public void performRedo(){
		System.out.println("Performing Redo Command in Receiver");
	}

	public void doOptionalTaskPriorToUndo(){
		System.out.println("Performing optional task/s prior to executing Undo Command");
	}

	public void doOptionalTaskPriorToRedo(){
		System.out.println("Performing optional task/s prior to executing Redo Command");
	}
}
