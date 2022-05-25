package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.memory;

/**
 * Created by Gra_m on 2022 05 25
 */

// works on what troubles they want to work on 3 days a week
class DefenderRandomBonus extends Defender{
	private int bonus;


	public DefenderRandomBonus(String name) {
		super(name);
		this.bonus = (int) (Math.random() * 7) + 1;

	}

	@Override
	protected boolean canKillEnemy(Trouble trouble) {
		return trouble.getId() == bonus;
	}
}
