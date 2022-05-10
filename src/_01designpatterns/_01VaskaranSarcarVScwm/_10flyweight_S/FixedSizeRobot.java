package _01designpatterns._01VaskaranSarcarVScwm._10flyweight_S;

/**
 * Created by Gra_m on 2022 03 15
 * Context object (unshared flyweight?) with default colour.
 */

public class FixedSizeRobot implements Robot{
    // Intrinsic State
    private final String ROBOT_TYPE;

    public FixedSizeRobot() {
        ROBOT_TYPE = "Fixed Size Robot:";
        System.out.println("Constructor Message: " + ROBOT_TYPE);
    }

    @Override
    public void showMe(String colour) {
        // Ignoring opportunity to change extrinsic value as this object is unshared.
        System.out.println("colour = " + "blue");
    }
}
