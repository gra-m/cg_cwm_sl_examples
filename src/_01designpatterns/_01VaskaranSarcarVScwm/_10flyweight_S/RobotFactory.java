package _01designpatterns._01VaskaranSarcarVScwm._10flyweight_S;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gra_m on 2022 03 15
 */

public class RobotFactory {
    static Map<String, Robot> robotFactory = new HashMap<>();

    public RobotFactory() {
        System.out.println("RobotFactory cache has been created Map<String, Robot>" );
    }

    public int totalRobotsCreated() {
        return robotFactory.size();
    }

    public static synchronized Robot getRobotFromFactory(String robotType) throws Exception {

        Robot robotCategory = robotFactory.get(robotType);

        if(robotCategory == null) {
           switch(robotType) {
               case "small":
                   System.out.println("System does not have small robot at present. Creating one.\n");
                   robotCategory = new SmallRobot();
                   break;
               case "large":
                   System.out.println("System does not have large robot at present. Creating one.\n");
                   robotCategory = new LargeRobot();
                   break;
               case "fixed":
                   System.out.println("System does not have fixed size robot at present. Creating one.\n");
                   robotCategory = new FixedSizeRobot();
                   break;
               default:
                   throw new Exception("RobotFactory can only create small fixed and large robot-types\n");
           }

           robotFactory.put(robotType, robotCategory);

        }else
            System.out.println("\n \t Using existing " + robotType + " robot and colouring it");

        return robotCategory;
    }

}
