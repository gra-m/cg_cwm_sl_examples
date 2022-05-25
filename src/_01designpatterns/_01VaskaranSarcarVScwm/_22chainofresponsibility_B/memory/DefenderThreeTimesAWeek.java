package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gra_m on 2022 05 25
 */

// works on what troubles they want to work on 3 days a week
class DefenderThreeTimesAWeek extends Defender{
	
	private List<Integer> workWeek = new ArrayList<>();

	public DefenderThreeTimesAWeek(String name) {
		super(name);
		getWorkdays();
	}

	private void getWorkdays() {
		while(workWeek.size() < 4)
			workWeek.add(getRandomInteger());
	}

	private Integer getRandomInteger() {
		return (int) (Math.random() * 7) + 1;
	}

	@Override
	protected boolean canKillEnemy(Trouble trouble) {
		return workWeek.contains(trouble.getId());
	}
}
