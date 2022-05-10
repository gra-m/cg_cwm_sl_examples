package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._02Eager;


class Captain {
    //Eager initialization whether you need it or not
    private static final Captain captain = new Captain();

    private Captain() {
        System.out.println("A captain has been elected to your team.");
    }

    // Global point of access
    public static  Captain getCaptain()
    {
        System.out.println("You have a captain for your team:");
        return captain;
    }

    public static void dummyMethodThatHasToBeHere() {
        System.out.println("It is a dummy method");
    }

}
