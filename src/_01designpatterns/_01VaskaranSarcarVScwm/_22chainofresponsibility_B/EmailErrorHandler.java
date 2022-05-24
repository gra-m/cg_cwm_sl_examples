package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B;

/**
 * Created by Gra_m on 2022 05 24
 */

public class EmailErrorHandler implements Receiver{
	Receiver nextReceiver;

	@Override
	public boolean handleMessage(Message message) {
		if(message.text.contains("Email")) {
			System.out.println("EmailErrorHandler processed " + message.priority + " priority issue:\n" + message.text);
			return true;
		}else if(nextReceiver != null)
			nextReceiver.handleMessage(message);
		return false;
	}

	@Override
	public void nextErrorHandler(Receiver nextReceiver) {
		this.nextReceiver = nextReceiver;
	}
}
