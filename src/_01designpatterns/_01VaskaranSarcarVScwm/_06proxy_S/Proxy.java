package _01designpatterns._01VaskaranSarcarVScwm._06proxy_S;

/**
 * Created by Gra_m on 2022 03 15
 * This will try to invoke doSomeWork() in ConcreteSubject instance.
 * HERE: Lazy initialisation. The expensive ConcreteSubject.doSomeWork() will not instantiate
 * until the app knows the method has actually been called.
 *
 * Also: Not thread safe, look at how this is dealt with in Singleton.
 */

public class Proxy extends Subject{
    static Subject concreteSubject;

    @Override
    void doSomeWork() {
        System.out.println("Proxy call happening now...");

        //HERE:
       if(concreteSubject == null)
            concreteSubject = new ConcreteSubject();
        concreteSubject.doSomeWork();
    }
}
