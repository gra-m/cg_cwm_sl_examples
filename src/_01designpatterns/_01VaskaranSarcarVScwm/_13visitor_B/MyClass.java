package _01designpatterns._01VaskaranSarcarVScwm._13visitor_B;

/**
 * Created by Gra_m on 2022 03 28
 */

public class MyClass implements OriginalInterface{
    private final int myInt = 5;

    public int getMyInt() {
        return myInt;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);

    }
}
