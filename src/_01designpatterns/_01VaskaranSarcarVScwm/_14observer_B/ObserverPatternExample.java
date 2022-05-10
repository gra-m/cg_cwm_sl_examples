package _01designpatterns._01VaskaranSarcarVScwm._14observer_B;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Subject subject01 = new Subject();
        ObserverType1 observer1_1 = new ObserverType1("observer1_1");
        ObserverType1 observer1_2 = new ObserverType1("observer1_2");
        ObserverType2 observer2_1 = new ObserverType2("observer2_1");

        subject01.register(observer1_1);
        subject01.register(observer1_2);
        subject01.register(observer2_1);

        System.out.println("\nFlag = 50\n");
        subject01.setFlag(50);


        subject01.unregister(observer1_2);

        System.out.println("\nFlag = 25\n");
        subject01.setFlag(25);

        subject01.register(observer1_2);

        System.out.println("\nFlag = 100\n");
        subject01.setFlag(100);





    }
}
