package _01designpatterns._01VaskaranSarcarVScwm._14observer_B;

class ObserverType2 implements Observer{
    String observerName;

    public ObserverType2(String name) {
       this.observerName = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println("Hi, my name is " + observerName + " and I have just\n" +
                "been alerted that the value in Publisher/Subject has been updated to:\n" +
                + updatedValue + "\n");

    }
}
