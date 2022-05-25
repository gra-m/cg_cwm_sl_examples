package _01designpatterns._01VaskaranSarcarVScwm._22chainofresponsibility_B.memory;


/**
 * Created by Gra_m on 2022 05 25
 *
 * To remember:
 * TowerDefence
 * enemy SENDER
 * DefenceManagement RECEIVER
 * tower HANDLER
 *
 * Use: Create your defence Chain and send each enemy through it.
 * Sender: Each issue/enemy has identifying features that can be tested for.
 * Receiver: this.uid setNext(Defender) // tryToKillEnemy -> canKillEnemy || next.tryToKillEnemy || failedToKillEnemy
 * Handler: canKillEnemy boolean confirms work is done == true.
 *
 */

class Main {
	public static void main(String[] args) {
		Defender defenderOne = new DefenderThreeTimesAWeek("Herbert 'three-times-a-week' Humperdink");
		Defender defenderTwo = new DefenderUnderSixAndOdd("Igloo 'Under-limit-and-odd' convenience for Ig's", 6);
		Defender defenderThree = new DefenderRandomBonus("Humnold '1-7' Hascobar..");

		defenderOne.setNextDefender(defenderTwo).setNextDefender(defenderThree);

		for(int i = 1; i < 8 ; i++)
			defenderOne.tryToKillEnemy(new Trouble(i));
	}
}
