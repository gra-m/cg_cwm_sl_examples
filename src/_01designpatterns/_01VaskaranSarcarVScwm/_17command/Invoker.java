package _01designpatterns._01VaskaranSarcarVScwm._17command;

/**
 * Created by Gra_m on 2022 05 20
 */

public class Invoker {
	Command commandToBePerformed;

	/*ALT:
	 public Invoker(Command command) {
		this.commandToBePerformed = command;
	}*/

	public void setCommand(Command command) {
		this.commandToBePerformed = command;
	}

	public void invokeCommand(){
		commandToBePerformed.executeCommand();
	}
}
