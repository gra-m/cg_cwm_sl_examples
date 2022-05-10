package _01designpatterns._01VaskaranSarcarVScwm._05abstractfactory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class WildTiger implements Tiger{
    @Override
    public void speak() {
        System.out.println("Wild tiger.. Hi, my teeth are sharpened on the bones of my prey");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild tiger: My preferred action is hunting");

    }
}
