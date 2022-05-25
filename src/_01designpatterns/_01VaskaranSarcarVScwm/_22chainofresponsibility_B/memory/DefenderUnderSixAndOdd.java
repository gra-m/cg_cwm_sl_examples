package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.memory;

/**
 * Created by Gra_m on 2022 05 25
 */

// works on what troubles they want to work on 3 days a week
class DefenderUnderSixAndOdd extends Defender{
	private int limit;


	public DefenderUnderSixAndOdd(String name, int limit) {
		super(name);
		this.limit = limit;

	}

	@Override
	protected boolean canKillEnemy(Trouble trouble) {
		int troubleId = trouble.getId();
		return troubleId < limit && troubleId % 2 == 1;
	}
}
