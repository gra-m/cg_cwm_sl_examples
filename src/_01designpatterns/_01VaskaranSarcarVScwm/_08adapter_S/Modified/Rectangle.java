package _01designpatterns._01VaskaranSarcarVScwm._08adapter_S.Modified;

public class Rectangle implements RectInterface{
    public double length;
    public double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void aboutRectangle() {
        System.out.println("Rect obj with length/width: " + length + " " + width);

    }

    @Override
    public double calculateAreaOfRectangle() {
        return length * width;
    }
}
