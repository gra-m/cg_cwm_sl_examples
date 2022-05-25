package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.takaakiteshima;

/**
* Copied on 2022 05 25 Minor changes to naming
*
A trouble is turned around among supporters, and the trouble will be handled by the supporter who can handle it.
There are four types of supporters below:
* LazySupporter doesn't handle any trouble
* MoodySupporter handles odd ID troubles
* SpecialSupporter handles a trouble of the target ID.
* LimitedSupporter handles troubles below the limit ID.
*/

public class Main {
	public static void main(String[] args) {
		Receiver emily = new LazyReceiver("Lazy 'NoTrouble' Emily");
		Receiver william = new MoodyReceiver("Moody 'OddTrouble' William");
		Receiver amelia = new SpecialReceiver("Special 'JustSix' Amelia", 6);
		Receiver joseph = new LimitedReceiver(">Limited '5Below' Joseph", 5);

		// Make a chain.
		emily.setNext(william).setNext(amelia).setNext(joseph);

		// Various troubles occurred.
		for (int i = 0; i < 10; i++) {
			emily.tryToHandleTrouble(new Trouble(i));
		}
	}
}
