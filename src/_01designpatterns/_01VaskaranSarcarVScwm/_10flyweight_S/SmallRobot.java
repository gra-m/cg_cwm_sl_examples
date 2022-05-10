package _01designpatterns._01VaskaranSarcarVScwm._10flyweight_S;

/**
 * Created by Gra_m on 2022 03 15
 * Flyweight
 */

public class SmallRobot implements Robot{
    // Intrinsic State
    private final String ROBOT_TYPE;

    public SmallRobot() {
        ROBOT_TYPE = "Small Robot:";
        System.out.println("Constructor Message: " + ROBOT_TYPE);
    }

    @Override
    public void showMe(String colour) {
        System.out.println("colour = " + colour);
    }
}
