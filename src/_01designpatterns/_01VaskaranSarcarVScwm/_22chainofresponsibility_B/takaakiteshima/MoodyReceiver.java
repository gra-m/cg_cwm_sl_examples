package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.takaakiteshima;

/**
 * Copied on 2022 05 25
 */

class MoodyReceiver extends Receiver {

	public MoodyReceiver(String name) {
		// ˅
		super(name);
		// ˄
	}

	// Troubles with an odd ID are handled.
	@Override
	protected boolean canHandle(Trouble trouble) {
		// ˅
		return trouble.id % 2 == 1;
		// ˄
	}


}
