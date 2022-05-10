package _01designpatterns._01VaskaranSarcarVScwm._08adapter_S.Modified;
/*Convert the interface of a class into another interface that clients expect.
Adapter lets classes work together that could not otherwise because of incompatible interfaces.

Computer example: The restraint: You have an 'old' database that stores your objects in a specific way, the client requires new
'types' of objects to be passed through the front end and stored, and you need to maintain the current 'old' database
This illustration: The restraint: The getArea method expects a rectangle object and it must continue to be used when
the client adds a 'triangle area' service to their front-end  Modified to use INTERFACES*/

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternExampleModified {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Modified Example***");
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area of rectangle is: " + rectangle.calculateAreaOfRectangle() + " square units");
        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of triangle is: " + triangle.calculateAreaOfTriangle() + " square units");
        System.out.println("Adapter not used up until when we pass a triangle instead of a rectangle:");
        RectInterface adapter = new TriangleAdapter(triangle);
        System.out.println("Area of triangle using the triangle adapter is: " + getArea(adapter) + " square units");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("This is an addition to show the power of Adapter Pattern, making a list of rectangle objs\n" +
                "and then attempting to add a rectangle a triangle and an adapter to it.\n" +
                "List<RectInterface> rectangleObjects = new ArrayList<>();");
        List<RectInterface> rectangleObjects = new ArrayList<>();
        System.out.println("rectangleObjects.add(rectangle); == no wuwwies");
        rectangleObjects.add(rectangle);
        System.out.println("rectangleObjects.add(adapter); == no wuwwies");
        rectangleObjects.add(adapter);
        System.out.println("rectangleObjects.add(triangle); == NOPE");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("rectangle.aboutRectangle()");
        rectangle.aboutRectangle();
        System.out.println("adapter.aboutRectangle()");
        adapter.aboutRectangle();
        System.out.println("triangle.aboutTriangle()");
        triangle.aboutTriangle();

    }

    static double getArea(RectInterface r) {
        return r.calculateAreaOfRectangle();
    }
}
