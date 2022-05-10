package _01designpatterns._01VaskaranSarcarVScwm._13visitor_B;

/**
 * Created by Gra_m on 2022 03 28
 *
 * Separates an algorithm from an object structure by moving the hierarch of methods into one object.
 *
 * GOF: Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new
 * operation without changing the classes of the elements on which it operates.
 *
 * True power of this pattern found when it is combined with the composite pattern. Allows the addition of operations
 * on objects without modifying the objects themselves. Esp useful if your operations often change.
 */

public class VisitorPatternExample {
    public static void main(String[] args) {
        System.out.println("\n Visitor pattern example:");
        System.out.println("__________________________\n");
        ConcreteVisitor visitor = new ConcreteVisitor();
        MyClass myClass = new MyClass();
        myClass.acceptVisitor(visitor);


    }
}
