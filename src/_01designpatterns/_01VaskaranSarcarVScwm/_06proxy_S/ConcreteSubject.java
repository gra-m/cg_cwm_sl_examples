package _01designpatterns._01VaskaranSarcarVScwm._06proxy_S;

/**
 * Created by Gra_m on 2022 03 15
 */

public class ConcreteSubject extends Subject{

    @Override
    void doSomeWork() {
        System.out.println("doSomeWork() inside ConcreteSubject invoked, this may be veeeery " +
                "\nlabour intensive for example.\n" +
                "Types of proxy:\n" +
                "Remote proxies, hide the actual object that resides in a different address space.\n" +
                "Virtual proxies, perform optimisation techniques such as the creation of a heavy object on an on-demand basis.\n" +
                "Protection proxies, deal with different access rights.\n" +
                "Smart reference proxies, perform additional housekeeping when an object is accessed by a client\n" +
                "e.g. counting the number of references to the actual object at a particular moment.");
    }

}
