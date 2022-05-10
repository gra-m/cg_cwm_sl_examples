package _01designpatterns._01VaskaranSarcarVScwm._06proxy_S;

/**
 * Created by Gra_m on 2022 03 15
 * GOF: Provide a surrogate (or placeholder) for another object to control access to it.
 * CONCEPT: A client can deal with a proxy object ignorant that it is not the actual object. Access to the actual object
 * is not desirable or possible. (Security, expensive to create, hard to access).
 *
 * REALWORLD: /
 * COMPUTERWORLD: To create multibple instances of a cpmplex object is costly, so instead, you can create multiple
 * proxy objects that point to the original object.
 *
 * Typ
 */

public class ProxyPatternExample {
    public static void main(String[] args) {
        System.out.println("ProxyPatternExample");
        Proxy px = new Proxy();

        px.doSomeWork();

    }
}
