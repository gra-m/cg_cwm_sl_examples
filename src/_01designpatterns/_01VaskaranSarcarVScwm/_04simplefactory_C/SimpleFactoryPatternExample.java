package _01designpatterns._01VaskaranSarcarVScwm._04simplefactory_C;

/**
 * Created by Gra_m on 2022 03 14
 *
 * SIMPLE Factory Method: Here instantiation logic is simply segregated from client code, knowing all about the classes objects
 * it can created, in real factory method object creation is delegated to the subclasses.
 *
 * INTENT: To create an object without exposing the instantiation logic to the client.
 * CONCEPT: Can be invoked in many ways, most often using a method that can return objects with varying prototypes.
 * Any subroutine that can help create these objects is considered a factory, but the ultimate purpose is to
 * abstract the creational mechanism/process from the consumers of the application.
 *
 * RealWorld eg: Car factory with different models and cross-overs between base-model and these different models and what
 * can and cannot be used to create them. The customer will just ask for a specific model, without knowing what has gone
 * into the process behind the scenes.
 *
 * Computer World: Very common to applications, this simple version is not part of the GOF's book. 'New' is not directly
 * used to create an object type. Code that varies and that is likely to vary most in the future is separated from code
 * that will be used by the consumer. == Loose coupling.
 */

public class SimpleFactoryPatternExample {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Animal createdAnimal = simpleFactory.createAnimal();

        createdAnimal.speak();
        createdAnimal.preferredAction();
    }


}
