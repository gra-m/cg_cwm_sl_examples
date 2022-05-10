package _01designpatterns._01VaskaranSarcarVScwm._07decorator_S;

public class PaintDecorator extends AbstractDecorator{
    static int count = 0;
    @Override
    public void makeHouse() {
        super.makeHouse();
        // Decorating now:
        count++;
        System.out.println("***Paint Decorator Is In Action*** Additional functionality B: " + count);
        paintTheHouse();
        // Add any other necessary decorations like paint the toilet etc
        }

    private void paintTheHouse() {
        System.out.println("***Now I Am Painting The House***");
    }
}
