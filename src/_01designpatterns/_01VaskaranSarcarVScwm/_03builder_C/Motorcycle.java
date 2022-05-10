package _01designpatterns._01VaskaranSarcarVScwm._03builder_C;

public class Motorcycle implements Builder {
    String brandName;
    Product product;

    public Motorcycle(String brandName) {
        this.brandName = brandName;
        this.product = new Product();
    }


    @Override
    public void startUpOperations() {
        //Nothing in this case
    }

    @Override
    public void buildBody() {
        product.add("This is the body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("Two wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("One headlight is added");
    }

    @Override
    public void endOperations() {
        product.add(String.format("Motorcycle model is: %s", this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
