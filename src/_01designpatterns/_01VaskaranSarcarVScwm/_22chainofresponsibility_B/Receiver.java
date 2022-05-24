package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B;

/**
 * Created by Gra_m on 2022 05 24
 */

public interface Receiver {

	boolean handleMessage(Message message);
	void nextErrorHandler(Receiver nextReceiver);
}
