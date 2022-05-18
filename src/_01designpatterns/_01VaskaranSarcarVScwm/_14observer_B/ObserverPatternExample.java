package _01designpatterns._01VaskaranSarcarVScwm._14observer_B;


/**
 * This note created by Gra_m on 2022 05 22
 *
 * GOF: Define a one-to-many dependency between objects so that when one object changes state, all of its dependents
 * are notified and updated automatically.
 *
 * IN A NUTSHELL: Using this pattern a subject can notify multiple observers at the same time.
 *
 * CONCEPT: Many observer objects observe a subject object. Observers register themselves to a subject in order to
 * be notified of when there is a change within their subject. If their interest in the subject has run its course they
 * may simply unregister from their subject. Also referred to as the publish-subscribe pattern.
 *
 *
 */


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
