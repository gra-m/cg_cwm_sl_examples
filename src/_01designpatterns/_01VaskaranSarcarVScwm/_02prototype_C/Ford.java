package _01designpatterns._01VaskaranSarcarVScwm._02prototype_C;

public class Ford extends BasicCar {
    public int basePrice = 100_000;

    Ford(String modelName) {
        super.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
