package _01designpatterns._01VaskaranSarcarVScwm._05abstractfactory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class PetTiger implements Tiger{
    @Override
    public void speak() {
        System.out.println("Pet tiger.. Hi, my teeth all fell out naturally, honest");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet tiger: My preferred action is dreaming of hunting");

    }
}
