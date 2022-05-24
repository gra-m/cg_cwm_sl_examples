package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B;

/**
 * Created by Gra_m on 2022 05 24
 *
 * GOF:
 * Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
 * Chain the receiving objects and pass the request along the chain until an object handles it.
 *
 * IN A NUTSHELL:
 * You create a chain of object handlers, each handling a particular type of request. When the passed object is not
 * fully handled by a process object it is passed to the next. The pattern's flexibility comes from always being able to
 * add another process object to the end of the chain.
 *
 *
 *
 */

public class CorExample {
	public static void main(String[] args) {
		IssueRaiser issueRaiser = new IssueRaiser();
		Receiver faxErrorHandler, emailErrorHandler;
		System.out.println("***Chain of responsibility pattern***");
		System.out.println("IssueRaiser->FaxErrorHandler->EmailErrorHandler");
		faxErrorHandler = new FaxErrorHandler();
		emailErrorHandler = new EmailErrorHandler();

		System.out.println("IssueRaiser sets first handler to faxErrorHandler");
		issueRaiser.setFirstErrorHandler(faxErrorHandler);
		System.out.println("nextErrorHandler in faxErrorHandler is set to 'emailErrorHandler'");
		faxErrorHandler.nextErrorHandler(emailErrorHandler);
		System.out.println("nextErrorHandler in EmailErrorHandler is set to null as it is end of chain..");
		emailErrorHandler.nextErrorHandler(null);

		System.out.println("Creating messages:");
		Message m1 = new Message("Fax is going slow..", MessagePriority.NORMAL);
		Message m2 = new Message("Email is not reaching destination..", MessagePriority.HIGH);
		Message m3 = new Message("In Email cc is always populated with entire address book", MessagePriority.NORMAL);
		Message m4 = new Message("Scanner Fax broken. Somebody's fat arse at office party..", MessagePriority.HIGH);


		issueRaiser.raiseMessage(m1);
		issueRaiser.raiseMessage(m2);
		issueRaiser.raiseMessage(m3);
		issueRaiser.raiseMessage(m4);
	}
}
