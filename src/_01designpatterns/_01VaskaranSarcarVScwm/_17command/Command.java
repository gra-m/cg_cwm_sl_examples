package _01designpatterns._01VaskaranSarcarVScwm._17command;

/**
 * Created by Gra_m on 2022 05 20
 * Typically does not accept args as:
 * 1.Info supplied when created
 * 2.Invoker may reside in different address space
 *
 */

public interface Command {
	void executeCommand();
}
