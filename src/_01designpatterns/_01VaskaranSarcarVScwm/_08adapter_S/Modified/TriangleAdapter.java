package _01designpatterns._01VaskaranSarcarVScwm._08adapter_S.Modified;

public class TriangleAdapter implements RectInterface{
    Triangle triangle;

    public TriangleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void aboutRectangle() {
        triangle.aboutTriangle();
    }

    @Override
    public double calculateAreaOfRectangle() {
        return triangle.calculateAreaOfTriangle();
    }
}
