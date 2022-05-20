package _01designpatterns._01VaskaranSarcarVScwm._17command;

/**
 * Created by Gra_m on 2022 05 20
 *
 * GOF: Encapsulate a request as an object, thereby letting you parameterize clients with different requests,
 * queues, or log requests, and supports undoable operations.
 *
 * IN A NUTSHELL: Invoker, Client, Command and Receiver.
 *
 * Command Object: can invoke method of the receiver in a way specific to the receivers class.
 * Receiver: begins processing the job.
 * Invoker: has Command Object passed to it separately to invoke the command
 * Client Object: Holds the Invoker and Command Objects. Decides which commands are actually invoked.
 * todo improve this, makes no sense here or in the book. ==> Code makes more sense!
 *
 *
 * CONCEPT:
 * undo/redo operations. Runnable interface of java. May need Memento as well to create complex undo operations.
 *
 */

public class CommandPatternExample {
	public static void main(String[] args) {
		System.out.println("***Command Pattern Demo***");

		Receiver intendedReceiver = new Receiver();

		MyUndoCommand undoCommand = new MyUndoCommand(intendedReceiver);
		Invoker invoker = new Invoker();
		invoker.setCommand(undoCommand);
		invoker.invokeCommand();


		MyRedoCommand redoCommand = new MyRedoCommand(intendedReceiver);
		invoker.setCommand(redoCommand);
		invoker.invokeCommand();

	}
}
