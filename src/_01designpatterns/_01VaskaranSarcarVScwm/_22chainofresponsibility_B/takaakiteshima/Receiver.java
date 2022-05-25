package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.takaakiteshima;

/**
 * Copied on 2022 05 25
 */

public abstract class Receiver {
	// Supporter name
	private final String name;

	// Next supporter
	private Receiver next;

	public Receiver(String name) {
		// ˅
		this.name = name;
		this.next = null;
		// ˄
	}

	// Troubles are sent through chain.
	public void tryToHandleTrouble(Trouble trouble) {
		// ˅
		if (canHandle(trouble)) {
			troubleHandled(trouble);
		}
		else if (next != null) {
			next.tryToHandleTrouble(trouble);
		}
		else {
			troubleUnHandled(trouble);
		}
		// ˄
	}

	// Set a next receiver.
	public Receiver setNext(Receiver next) {
		// ˅
		this.next = next;
		return next;
		// ˄
	}

	protected abstract boolean canHandle(Trouble trouble);

	// Trouble was supported.
	private void troubleHandled(Trouble trouble) {
		// ˅
		System.out.println(trouble + " was handled by " + name + ".");
		// ˄
	}

	// Trouble was unsupported.
	private void troubleUnHandled(Trouble trouble) {
		// ˅
		System.out.println(trouble + " was not handled.");
		// ˄
	}
}
