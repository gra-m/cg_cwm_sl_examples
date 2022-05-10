package _01designpatterns._01VaskaranSarcarVScwm._04factory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class TigerFactory extends AnimalFactory{
    @Override
    Animal createAnimal() {
        return new Tiger();
    }
}
