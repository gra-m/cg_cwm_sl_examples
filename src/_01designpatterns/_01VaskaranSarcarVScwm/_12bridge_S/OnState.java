package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S;

/**
 * Created by Gra_m on 2022 03 18
 *
 * ROLE: Concrete Implementor
 */

public class OnState implements State{

    @Override
    public void moveState() {
        System.out.println("On State");

    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is already ON. Do not press the button so hard.");
    }
}
