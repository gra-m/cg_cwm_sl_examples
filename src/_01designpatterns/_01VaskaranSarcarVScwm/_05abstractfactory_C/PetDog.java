package _01designpatterns._01VaskaranSarcarVScwm._05abstractfactory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class PetDog implements Dog{
    @Override
    public void speak() {
        System.out.println("Pet dog: I am a pet dog and I'm wagging my tail at the thought of my human.. Chill right?");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet dog: Munchin' an a poppin' bones, bought from a shop.");

    }
}
