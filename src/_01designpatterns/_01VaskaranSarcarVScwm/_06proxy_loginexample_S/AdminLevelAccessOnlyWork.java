package _01designpatterns._01VaskaranSarcarVScwm._06proxy_loginexample_S;

/**
 * Created by Gra_m on 2022 03 15
 */

public class AdminLevelAccessOnlyWork extends AdminLevelAccessSubject{

    @Override
    void doSomeWork() {
        System.out.println("Doing extremely sensitive work that is actually important, really..");
    }
}
