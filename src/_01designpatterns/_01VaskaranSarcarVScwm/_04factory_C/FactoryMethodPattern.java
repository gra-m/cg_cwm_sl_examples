package _01designpatterns._01VaskaranSarcarVScwm._04factory_C;

/**
 * Created by Gra_m on 2022 03 14
 * GOF: Define an interface for creating an object, but let sub-classes decide which class to instantiate.
 * CONCEPT: An abstract creator class defines the basic structure, while the derived subclasses perform the actual
 * instantiation process.
 * REALWORLD: Car factory with expected and constant development of new models. There should be no need for a whole new
 * setup of for these new models when they only really demand a few new features.
 * COMPUTERWORLD: Your are building an application that supports two types of database, Oracle and SQL Server. Instead of
 * setting up switch or if-else statements to set up server specific connections you set up the factory method. In this
 * way, when you later need to add Mongo DB to the application you do not have to go in and edit/add to all of that messy business
 * logic, you can just add a new connection type, or in this case, a new animal.
 */

public class FactoryMethodPattern {
    public static void main(String[] args) {
        System.out.println("Factory Pattern Demo");
        // Create Tiger Factory:
        AnimalFactory tigerFactory = new TigerFactory();
        // Create a tiger using factory method
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();

        // Same for Dog:
        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();

    }
}
