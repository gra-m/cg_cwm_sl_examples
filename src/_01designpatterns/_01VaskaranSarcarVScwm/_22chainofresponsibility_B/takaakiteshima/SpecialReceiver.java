package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.takaakiteshima;

/**
 * Copied on 2022 05 25
 */

class SpecialReceiver extends Receiver {
	// ˅

	// ˄

	private final int targetId;

	public SpecialReceiver(String name, int targetId) {
		// ˅
		super(name);
		this.targetId = targetId;

		// ˄
	}

	// Troubles with the specific ID are handled.
	@Override
	protected boolean canHandle(Trouble trouble) {
		// ˅
		return trouble.id == targetId;
		// ˄
	}

	// ˅

	// ˄
}