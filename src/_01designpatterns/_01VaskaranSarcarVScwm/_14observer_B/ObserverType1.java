package _01designpatterns._01VaskaranSarcarVScwm._14observer_B;

class ObserverType1 implements Observer{
    String observerName;

    public ObserverType1(String name) {
       this.observerName = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println(observerName + " has received an alert:\n" +
                "Updated myValue in publisher/subject is: " + updatedValue +"\n");
    }
}
