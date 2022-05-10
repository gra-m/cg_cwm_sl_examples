package _01designpatterns._01VaskaranSarcarVScwm._09facade_S;
/*GOF: Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher level interface
 * that makes the subsystem easier to use
 *
 * Concept: Make a clients life easier where say a multiple objects need to perform a series of tasks. The underlying
 * complexity of say, creating objects and completing tasks in the right order can be controlled via one facade object.
 *
 * RealWorld: Going to a party planner rather than dealing with all the details yourself
 * ComputerWorld: JDBC application used in course*/
public class FacadePatternExample {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***");
        // Creating Robots
        RobotFacade milanoRobotFacade = new RobotFacade();
        milanoRobotFacade.constructMilanoRobot();
        RobotFacade robonautRobotFacade = new RobotFacade();
        robonautRobotFacade.constructRobonautRobot();
        // Then destroying them
        milanoRobotFacade.destroyAMilanoRobot();
        robonautRobotFacade.destroyARobonautRobot();
    }


}
