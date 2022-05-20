package _01designpatterns._01VaskaranSarcarVScwm._17command;

/**
 * Created by Gra_m on 2022 05 20
 */

public class MyRedoCommand implements Command{

	private Receiver receiver;

	public MyRedoCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void executeCommand() {

		receiver.doOptionalTaskPriorToRedo();
		receiver.performRedo();
	}

}
