package _01designpatterns._01VaskaranSarcarVScwm._05abstractfactory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class WildDog implements Dog{
    @Override
    public void speak() {
        System.out.println("Wild dog: I am a wild dog and I'm wild.. Wild right?");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild dog: Munchin' an a poppin' bones");

    }
}
