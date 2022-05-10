package _01designpatterns._01VaskaranSarcarVScwm._03builder_C;

public class Director {
    Builder builder;

    //The key to using builder:
    public void construct(Builder builder) {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}
