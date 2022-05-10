package _01designpatterns._01VaskaranSarcarVScwm._04simplefactory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class Dog implements Animal{

    @Override
    public void speak() {
        System.out.println("Dog says: 'Woof!'");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dogs really enjoy pretending that they cannot speak.");
    }
}
