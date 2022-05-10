package _01designpatterns._01VaskaranSarcarVScwm._02prototype_C;

public class Nano extends BasicCar {

    public int basePrice = 100_000;

    Nano(String modelName) {
        super.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
            return (Nano) super.clone();
    }
}
