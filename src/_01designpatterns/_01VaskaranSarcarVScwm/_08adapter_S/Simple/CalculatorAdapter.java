package _01designpatterns._01VaskaranSarcarVScwm._08adapter_S.Simple;

public class CalculatorAdapter {
    public double getArea(Triangle triangle) {
        Calculator c = new Calculator();
        Rectangle rect = new Rectangle();
        //Area of triangle = 0.5 * base * height
        rect.length = triangle.base * 0.5;
        rect.width = triangle.height;
        return c.getArea(rect);
    }

}
