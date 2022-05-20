package _01designpatterns._01VaskaranSarcarVScwm._17command;

/**
 * Created by Gra_m on 2022 05 20
 */

public class MyUndoCommand implements Command{
	private Receiver receiver;

	public MyUndoCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void executeCommand() {

		receiver.doOptionalTaskPriorToUndo();
		receiver.performUndo();
	}
}
