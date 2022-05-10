package _01designpatterns._01VaskaranSarcarVScwm._06proxy_loginexample_S;

/**
 * Created by Gra_m on 2022 03 15
 */

public class ProxyLoginExample {
    public static void main(String[] args) {

        System.out.println("Proxy with check for admin level access");
        System.out.println("\nLogin 1:");
        Proxy p = new Proxy("Admin");
        p.doSomeWork();

        System.out.println("\nLogin 2:");
        Proxy p2 = new Proxy("Asdf");
        p2.doSomeWork();
    }
}
