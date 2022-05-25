package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.takaakiteshima;

/**
 * Copied on 2022 05 25
 */

class LimitedReceiver extends Receiver {


	private final int limitId;

	public LimitedReceiver(String name, int limitId) {
		// ˅
		super(name);
		this.limitId = limitId;

		// ˄
	}

	// Troubles with an ID below the limit are handled.
	@Override
	protected boolean canHandle(Trouble trouble) {
		// ˅
		return trouble.id <= limitId;
		// ˄
	}

}
