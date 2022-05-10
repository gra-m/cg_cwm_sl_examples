package cg.larger_tasks.abstract_robotwars;


// region BRIEF
/*
Robot wars
1. Familiarize yourself with the code.
2. Accept your fate and keep trying to understand the code.
3. ...
4. Rejoice that you've figured it out.
5. Adapt the code to the following new architecture and add new logic:
5.1. Make the AbstractRobot class abstract. Then move the attack and defend logic from the Robot class to the AbstractRobot class.
5.2. Edit the Robot class to utilize the AbstractRobot class.
5.3. Extend the BodyPart class with a new body part: BodyPart.CHEST.
5.4. Add the new body part to the implementation of the CanAttack and CanDefend interfaces (in the AbstractRobot class).


Requirements:
1. The AbstractRobot class must be abstract.
2. The AbstractRobot class must implement the CanAttack and CanDefend interfaces.
3. The Robot class must inherit the AbstractRobot class.
4. The logic defining the how a Robot behaves must be in the AbstractRobot class.
5. The BodyPart class must have and initialize a final static BodyPart variable called CHEST.
6. The new body part must be added to the logic for the attack and defend methods in the AbstractRobot class.
*/
 // endregion

// region ORIGINAL CODE
/*
package com.codegym.task.task13.task1328;

public class Solution {
public static void main(String[] args) {
	Robot amigo = new Robot("Amigo");
	Robot enemy = new Robot("Enemy");

	doMove(amigo, enemy);
	doMove(amigo, enemy);
	doMove(enemy, amigo);
	doMove(amigo, enemy);
	doMove(enemy, amigo);
	doMove(amigo, enemy);
	doMove(enemy, amigo);
	doMove(amigo, enemy);
}

public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
	BodyPart attacked = robotFirst.attack();
	BodyPart defended = robotFirst.defend();
	System.out.println(String.format("%%s attacked %s: its %s  was attacked, and its %s was defended",
		robotFirst.getName(), robotSecond.getName(), attacked, defended));
}
}
 */
// endregion

public class RobotWars {
public static void main(String[] args) {
	Robot amigo = new Robot("Amigo");
	Robot enemy = new Robot("Enemy");

	doMove(amigo, enemy);
	doMove(amigo, enemy);
	doMove(enemy, amigo);
	doMove(amigo, enemy);
	doMove(enemy, amigo);
	doMove(amigo, enemy);
	doMove(enemy, amigo);
	doMove(amigo, enemy);
}

public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
	BodyPart attacked = robotFirst.attack();
	BodyPart defended = robotFirst.defend();
	Robot robot1 = (Robot) robotFirst;
	Robot robot2 = (Robot) robotSecond;
	System.out.println(String.format("%s attacked %s: its %s  was attacked, and its %s was defended",
		robot1.getName(), robot2.getName(), attacked, defended));
}
}