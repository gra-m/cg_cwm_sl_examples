package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S;

/**
 * Created by Gra_m on 2022 03 18
 * ROLE: Concrete Implementor
 *
 */

public class OffState implements State{

    @Override
    public void moveState() {
        System.out.println("Off state");

    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is offline now. Do not press the button again.");

    }
}
