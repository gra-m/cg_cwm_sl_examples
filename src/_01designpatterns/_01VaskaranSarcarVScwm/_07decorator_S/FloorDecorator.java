package _01designpatterns._01VaskaranSarcarVScwm._07decorator_S;

public class FloorDecorator extends AbstractDecorator{
    static int count = 0;
    @Override
    public void makeHouse() {
        super.makeHouse();
        // Decorating now
        count++;
        System.out.println("***Floor Decorator Is In Action*** Additional functionality A: " +  count);
        addFloor();
        // Any other additional stuff that you need
    }

    private void addFloor() {
        System.out.println("I am making an additional floor on top of it.");
    }
}
