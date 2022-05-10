package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._04double_checked_locking;

// region INFO
/*
This version does not use synchronized for every call to the getInstance() method.
Instead it uses a synchronised block locking the Captain2 class (The first thread
captures the mutex making it with the if block first come only served).

 */
// endregion


public class SingletonPatternEgDoubleCheckedLocking {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern with eager initialization***\n");
        System.out.println("Trying to make captain for your team:");

        Captain2 cap1 = Captain2.getCaptain();

        System.out.println("Trying to make another captain for your team:");

        Captain2 cap2 = Captain2.getCaptain();

        System.out.println(cap1 == cap2 ? "cap1 and cap2 are the same instance": "Singleton Pattern failed");


    }
}
