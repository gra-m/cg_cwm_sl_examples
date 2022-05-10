package _01designpatterns._01VaskaranSarcarVScwm._03builder_C;

public interface Builder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadlights();
    void endOperations();
    Product getVehicle(); //Retrieve constructed obj
}
