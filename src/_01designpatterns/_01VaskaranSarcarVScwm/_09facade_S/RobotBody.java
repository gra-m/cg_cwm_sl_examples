package _01designpatterns._01VaskaranSarcarVScwm._09facade_S;

public class RobotBody {
    public static void createRobot() {
        System.out.println(" Refer to the instruction manual before creating a robot: ");
    }

    public void createHands() {
        System.out.println(" Hands manufactured.");
    }

    public void createRemainingParts() {
        System.out.println(" Remaining parts other than hands are created.");
    }

    public static void destroyRobot() {
        System.out.println(" Refer to manual before destroying a robot.");
    }

    public void destroyHands() {
        System.out.println(" The robots hands are destroyed.");
    }

    public void destroyRemainingParts() {
        System.out.println(" The robots remaining parts are destroyed.");
    }

}
