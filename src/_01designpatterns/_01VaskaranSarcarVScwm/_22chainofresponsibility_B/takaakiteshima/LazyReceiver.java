package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.takaakiteshima;

/**
 * Copied on 2022 05 25
 */

class LazyReceiver extends Receiver {

	public LazyReceiver(String name) {
		super(name);
	}

	// No troubles are handled.
	@Override
	protected boolean canHandle(Trouble trouble) {
		return false;
	}


}
