package _01designpatterns._01VaskaranSarcarVScwm._02prototype_C;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    private static int MAX_PRICE = 100_000;
    public String modelName;

    public int basePrice, onRoadPrice;



    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int setAdditionalPrice()
    {
        Random r = new Random();
        return r.nextInt(MAX_PRICE);
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }

}
