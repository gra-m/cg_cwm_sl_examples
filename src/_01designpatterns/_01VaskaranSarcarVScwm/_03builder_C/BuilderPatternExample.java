package _01designpatterns._01VaskaranSarcarVScwm._03builder_C;
/*GOF: Separate the construction of a complex obj from its representation, so that the same construction process
* can create different representations
* RealWorld: To complete an order for a computer different parts are assembled based on customer choices.
* Computer World: The builder pattern can be used when we want to convert one text format to another.
* */
public class BuilderPatternExample {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");

        Director director = new Director();
        Builder fordCar = new Car("Ford");
        Builder hondaMotorCycle = new Motorcycle("Honda");

        // Making Car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();

        director.construct(hondaMotorCycle);
        Product p2 = hondaMotorCycle.getVehicle();
        p2.showProduct();

    }
}
