package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S;

/**
 * Created by Gra_m on 2022 03 18
 * ROLE: Refined abstraction
 *
 *
 * with  modification to superclass methods
 * doublePress' code neutrality is the very reason for having a Bridge pattern in this example.
 */

public class DVD extends ElectronicGoods{
    /*Alt
    public DVD(State state) {
    super(state);
    }
     */

    //Provision of additional feature, that does not affect the bridge separated implementor hierarchy at all.
    void doublePress() {
        // does not use bridge direct, uses superclass methods instead, can continue to vary abstraction and imple independently.
        hardButtonPressed();
        hardButtonPressed();
    }
}
