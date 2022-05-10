package _01designpatterns._01VaskaranSarcarVScwm._10flyweight_S;

import java.util.Random;

/**
 * Created by Gra_m on 2022 03 15
 *
 * GOF: Use sharing to support large numbers of fine-grained objects efficiently.
 *
 * A context in an application may have instances of its own objects. To create enough of these objects may be too costly.
 * To get the effect of having more objects of this contexts type shared objects or 'flyweights' can be used. These flyweights
 * have intrinsic properties of their own that are often immutable, but they also have extrinsic properties that can change
 * dependent on what context they are in. Flyweights move/are moved from context to context and are indistinguishable from
 * instances of objects within each context (that are not shared).
 *
 * Extra: Flyweights (shared objects) can be used in multiple contexts simultaneously.
 *
 *COMPUTER WORLD:
 * The core structures of participants in a game are the same, but their appearances vary (different states/ colours/ weapons etc)
 *
 * Storing all of these variations individually would take up enormous amounts of memory, so instances with common properties
 * (flyweights with intrinsic state) are created instead, and the client object maintains the variations (extrinsic states).
 *
 * In this example just three distinct objects are used to represent 12. Two types have their colour randomly allotted but this
 * would be allotted by context in reality (imagine colour was an ability type only available on a specific area of a game map).
 * The other object type fixed, are all blue, with one flyweight object showing as four on screen in a 'blue' context?
 *
 * Probably overthinking this..
 *
 */

public class FlyweightPatternExample {

    public static void main(String[] args) throws Exception{
        final int SMALL = 3;
        final int LARGE = 5;
        final int FIXED = 4;
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\nFlyweight pattern example");

        Robot myRobot;

        System.out.printf("\n\nGive me %d small robots please!\n", SMALL);
        for (int i = 0; i <= SMALL; i++) {
            myRobot = RobotFactory.getRobotFromFactory("small");
            Thread.sleep(1000); // increase chance of diff rand num
            myRobot.showMe(getRandomColour()); // client code provides extrinsic property
        }
        printDistinctRobots(robotFactory);

        System.out.printf("\n\nGive me %d large robots please\n!", LARGE);
        for (int i = 0; i <= LARGE; i++) {
            myRobot = RobotFactory.getRobotFromFactory("large");
            Thread.sleep(1000); // increase chance of diff rand num
            myRobot.showMe(getRandomColour()); // client code provides extrinsic property
        }
        printDistinctRobots(robotFactory);

        System.out.printf("\n\nGive me %d fixed robots please\n!", FIXED);
        for (int i = 0; i <= FIXED; i++) {
            myRobot = RobotFactory.getRobotFromFactory("fixed");
            Thread.sleep(1000); // increase chance of diff rand num
            myRobot.showMe(getRandomColour()); // client code provides extrinsic property
        }
        printDistinctRobots(robotFactory);

    }

    private static void printDistinctRobots(RobotFactory robotFactory) {
        int numOfDistinctRobots = robotFactory.totalRobotsCreated();
        System.out.println("\nCurrent distinct robot objects created = " + numOfDistinctRobots);
    }

    private static String getRandomColour() {
        Random r = new Random();
        int random = r.nextInt();
        return (random % 2 == 0) ? "red" : "green";
    }
}
