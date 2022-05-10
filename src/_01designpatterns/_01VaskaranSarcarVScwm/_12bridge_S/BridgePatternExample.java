package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S;

/**
 * Created by Gra_m on 2022 03 18
 * GOF Decouple an abstraction from its implementation so that the two can vary independently.
 *
 * Allows either of the two hierarchies to grow independently.
 *
 * AKA handle/body. The abstraction always contains a reference to its implementation.
 * The abstraction and implementation can be represented by an interface or an abstract class. Separate inheritance
 * structures can then be built, that are finally connected by a bridge.
 * A child of the abstraction is normally known as a 'refined abstraction' and the child of an
 * implementation a 'concrete implementation'.
 *
 * REALWORLD: The Product owner in a scrum team plays the part of a bridge between clients and developers. Client needs
 * do not change the way the development team works.
 *
 * COMPUTER WORLD: JDBC provides a bridge between your app and a particular database.
 * java.sql.DriverManager Abstraction             java.sql.driver Impl
 *                                                com.mysql.jdbc.Driver ConcreteImpl
 */

public class BridgePatternExample {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern Example");

        System.out.println("\nCurrently Managing: Television\n");
        State presentState = new OnState();
                //ElectronicGoods eItem = new Television(presentState);
        ElectronicGoods eItem = new Television();
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        //hard press
        eItem.hardButtonPressed();
        //
        presentState = new OffState();
                //eItem = new Television(presentState);
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        eItem.hardButtonPressed();


        System.out.println("\nCurrently Managing: DVD\n");
        presentState = new OnState();
                //eItem = new DVD(presentState);
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        presentState = new OffState();
                //eItem = new DVD(presentState);
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        // hard press is a DVD specific method:
        //(new DVD(presentState)).doublePress();
        ((DVD) eItem).doublePress(); // cast necessary.
        // Purposeful error:
        //(new Television(presentState)).doublePress();

    }

}
