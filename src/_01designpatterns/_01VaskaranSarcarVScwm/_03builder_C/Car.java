package _01designpatterns._01VaskaranSarcarVScwm._03builder_C;

public class Car implements Builder{
    private String brandName;
    private Product product;

    public Car(String brandName) {
        this.brandName = brandName;
        this.product = new Product();
    }


    @Override
    public void startUpOperations() {
        product.add(String.format("Car model is: %s", this.brandName));
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("Four wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("Two headlights are added");
    }

    @Override
    public void endOperations() {
        // No necessary end Ops in this case
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
