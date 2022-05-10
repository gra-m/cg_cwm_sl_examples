package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._03bill_pughs_solution;

// region INFO
/*
Bill Pugh's solution uses a static nested helper class.

Now we can call the dummy method without getting a singleton instance
we did not want but we retain the benefit of not needing 'Synchronized'
from the Eager
 */
// endregion

public class SingletonPatternExamplePugh {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern with eager initialization***\n");
        System.out.println("Trying to make captain for your team:");
        Captain.dummyMethodThatHasToBeHere();

        /*Captain cap1 = Captain.getCaptain();

        System.out.println("Trying to make another captain for your team:");

        Captain cap2 = Captain.getCaptain();

        System.out.println(cap1 == cap2 ? "cap1 and cap2 are the same instance": "Singleton Pattern failed");

         */
    }
}
