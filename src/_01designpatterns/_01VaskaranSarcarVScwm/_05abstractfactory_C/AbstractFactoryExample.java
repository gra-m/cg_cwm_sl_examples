package _01designpatterns._01VaskaranSarcarVScwm._05abstractfactory_C;

/**
 * Created by Gra_m on 2022 03 14
 * GOF: Provide an interface for creating families of related or dependent objects without specifying their concrete
 * classes.
 *
 * CONCEPT: see factory pattern, then consider this a factory of factories, with one more level of abstraction allowing us
 * to handle, pet and wild tigers and dogs. It is the encapsulation of a group of different objects that have a common
 * theme. Class creation is delegated to the factory object.
 *
 * REALWORLD:
 */

public class AbstractFactoryExample {
    public static void main(String[] args) {
        WildAnimalFactory wildAnimalFactory = new WildAnimalFactory();
        PetAnimalFactory petAnimalFactory = new PetAnimalFactory();

        Tiger wildTiger = wildAnimalFactory.createTiger();
        Tiger petTiger = petAnimalFactory.createTiger();

        Dog wildDog = wildAnimalFactory.createDog();
        Dog petDog = petAnimalFactory.createDog();

        System.out.println("Tigers:");
        wildTiger.speak();
        wildTiger.preferredAction();
        petTiger.speak();
        petTiger.preferredAction();

        System.out.println("Dogs:");
        wildDog.speak();
        wildDog.preferredAction();
        petDog.speak();
        petDog.preferredAction();


    }
}
