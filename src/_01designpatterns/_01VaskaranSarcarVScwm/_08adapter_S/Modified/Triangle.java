package _01designpatterns._01VaskaranSarcarVScwm._08adapter_S.Modified;

public class Triangle implements TriInterface{
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Triangle obj with base/height: " + base + " " + height);
    }

    @Override
    public double calculateAreaOfTriangle() {
        return (base * 0.5) * height;
    }
}
