package _01designpatterns._01VaskaranSarcarVScwm._13visitor_B;

/**
 * Created by Gra_m on 2022 03 28
 */

public class ConcreteVisitor implements Visitor{

    public void visit(MyClass myClassObject){
        System.out.println("Current value of myInt: " + myClassObject.getMyInt());
        System.out.println("Visitor will double and display it: ");
        System.out.println("Current value of myInt: " +  2 * myClassObject.getMyInt());
        System.out.println("Now exiting visitor");
    }

}
