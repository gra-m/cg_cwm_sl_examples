package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B;

/**
 * Created by Gra_m on 2022 05 24
 */

public class IssueRaiser {
	public Receiver setFirstReceiver;

	void setFirstErrorHandler(Receiver receiver){
		this.setFirstReceiver = receiver;

	}

	void raiseMessage(Message message) {
		if(setFirstReceiver != null)
			setFirstReceiver.handleMessage(message);
	}
}
