package _01designpatterns._01VaskaranSarcarVScwm._05abstractfactory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class WildAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }
}
