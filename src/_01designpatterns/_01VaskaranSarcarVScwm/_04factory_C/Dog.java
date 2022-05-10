package _01designpatterns._01VaskaranSarcarVScwm._04factory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("I am a speaking dog, I create Oracle Db connections that are guaranteed and perfect");
    }

    @Override
    public void preferredAction() {
        System.out.println("Doggy action? Favourite? I loves a bit of it! Preferred? Running and jumping in fields.");
    }
}
