package _01designpatterns._01VaskaranSarcarVScwm._04afactory_abstractAdvantageC;

/**
 * Created by Gra_m on 2022 03 14
 */

class TigerFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Tiger();
    }
}
