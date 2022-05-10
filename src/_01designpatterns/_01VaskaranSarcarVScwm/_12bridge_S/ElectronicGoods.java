package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S;

/**
 * Created by Gra_m on 2022 03 18
 *
 * ROLE: Abstraction, could be either interface or Ab class
 */

public abstract class ElectronicGoods {
    // Holds reference of the State Implementor
    protected State state;

    /* Alt approach:  implementor passed:
    public ElectronicGoods(State state) {
    this.state = state;
    }
     */

    public State getState() {
        return state;
    };

    public void setState(State state) {
        this.state = state;
    };

    // IMPORTANT
    // Here is where State reference is used to delegate the implementation. Implementation is delegated to the
    // implementor hierarchy through using the bridge.

    public void moveToCurrentState() {
        System.out.print("\tThe electronic item is functioning at: ");
        // delegation/bridge use:
        state.moveState();
    };

    public void hardButtonPressed() {
        // delegation/bridge use:
        state.hardPressed();
    }

}
