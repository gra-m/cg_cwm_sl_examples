package _01designpatterns._01VaskaranSarcarVScwm._08adapter_S.Simple;
/*Convert the interface of a clas into another interface that clients expect.
Adapter lets classes work together that could not otherwise because of incompatible interfaces.

Computer example: The restraint: You have an 'old' database that stores your objects in a specific way, the client requires new
'types' of objects to be passed through the front end and stored, and you need to maintain the current 'old' database
This illustration: The restraint: The getArea method expects a rectangle object and it must continue to be used when
the client adds a 'triangle area' service to their front-end */

public class AdapterPatternExample {
    public static void main(String[] args) {
        System.out.println("***AdapterPatternExample***\n");
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Triangle t = new Triangle(20, 10);
        System.out.println("The area of the triangle is " + calculatorAdapter.getArea(t) + " square unit");

    }
}
