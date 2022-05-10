package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._01lazy;

// region INFO
/*
Constructor == Private:
Encapsulated
Cannot be extended

Synchronized == multithreads cannot instantiate at the same time.

But Synchronized is costly, once instantiated it is an additional overhead.
Alternate method to Synchronized coming up.
 */
// endregion

public class SingletonPatternExample {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make captain for your team:");

        // Constructor is private, we cannot use new here:
        //Captain c3 = new Captain(); //error
        Captain cap1 = Captain.getCaptain();

        System.out.println("Trying to make another captain for your team:");

        Captain cap2 = Captain.getCaptain();

        System.out.println(cap1 == cap2 ? "cap1 and cap2 are the same instance": "Singleton Pattern failed");
    }
}
