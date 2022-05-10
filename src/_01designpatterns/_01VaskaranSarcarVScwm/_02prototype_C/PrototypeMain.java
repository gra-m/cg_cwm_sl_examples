package _01designpatterns._01VaskaranSarcarVScwm._02prototype_C;

// region Definition
/*
GoF Definition
Specify the kinds of objects to create using a prototypical
 instance, and create new objects by copying this prototype.
 */

// endregion

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("***Prototype Pattern Demo***");

        BasicCar nano = new Nano("Green Nano");
        nano.basePrice = 100_000;

        BasicCar ford = new Ford("Yellow Ford");
        ford.basePrice = 500_000;

        BasicCar bc1 = nano.clone();
        BasicCar bc2 = ford.clone();

        printOnRoadPrice(bc1);
        printOnRoadPrice(bc2);

        System.out.println("Remember kids, it's bad to clone..");

    }

    private static int getOnRoadPrice(BasicCar basicCar) {
       return basicCar.basePrice + BasicCar.setAdditionalPrice();
    }

    private static void printOnRoadPrice(BasicCar basicCar) {
        System.out.println("Car is: " + basicCar.modelName + " and its very\n" +
                "Indian price is Rs." + getOnRoadPrice(basicCar));
    }
}
