package _01designpatterns._01VaskaranSarcarVScwm._07decorator_S;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        System.out.println("***Decorator Pattern Demo***");
        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();
        System.out.println("+++++++++++++++++++++++++++++");
        //Using decorator to add floor to an already made Component obj:
        System.out.println("Using a floor decorator now");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setTheComponent(withoutDecorator);
        floorDecorator.makeHouse();
        System.out.println("+++++++++++++++++++++++++++++");
        //Now using another decorator to paint house
        System.out.println("Usint a paint decorator now");
        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setTheComponent(floorDecorator);
        paintDecorator.makeHouse();
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
