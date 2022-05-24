package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B;

/**
 * Created by Gra_m on 2022 05 24
 */

public class Message {
	protected String text;
	protected MessagePriority priority;

	public Message(String messageText, MessagePriority priority){
		this.text = messageText;
		this.priority = priority;
	}


}
