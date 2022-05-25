package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.memory;

/**
 * Created by Gra_m on 2022 05 25
 */

abstract class Defender {
	private String name;
	private Defender next;

	public Defender(String name) {
		this.name = name;
		this.next = null;
	}

	protected abstract boolean canKillEnemy(Trouble trouble);

	public Defender setNextDefender(Defender nextDefender) {
		this.next = nextDefender;
		return next;
	}

	public void tryToKillEnemy(Trouble trouble) {

		if(canKillEnemy(trouble))
			killedEnemy(trouble);
		else if(next != null)
			next.tryToKillEnemy(trouble);
		else
			failedToKillEnemy(trouble);
	}


	private void killedEnemy(Trouble trouble) {
		System.out.println(trouble + " was killed by " + name);
	}

	private void failedToKillEnemy(Trouble trouble) {
		System.out.println("None of the current chain of defenders were able to defeat " + trouble);
	}
}
