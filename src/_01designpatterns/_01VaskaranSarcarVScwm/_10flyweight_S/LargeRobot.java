package _01designpatterns._01VaskaranSarcarVScwm._10flyweight_S;

/**
 * Created by Gra_m on 2022 03 15
 * Flyweight
 */

public class LargeRobot implements Robot{
    // Intrinsic state
    private final String ROBOT_CREATED;

    public LargeRobot() {
        ROBOT_CREATED = "Large Robot:";
        System.out.println("Constructor Message: " + ROBOT_CREATED);
    }

    @Override
    public void showMe(String colour) {
        System.out.println("colour = " + colour);

    }
}
