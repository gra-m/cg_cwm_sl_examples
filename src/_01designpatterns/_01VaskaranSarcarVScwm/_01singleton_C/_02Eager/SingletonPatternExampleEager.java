package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._02Eager;

// region INFO
/*
On face seems simpler. It does not need Synchronized to be thread safe
as the instance is automatically created.

But if Captain is large this can effect load time.

Here another static method is called in Cap class and an instance is
still made as a side effect.

 */
// endregion

public class SingletonPatternExampleEager {
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
