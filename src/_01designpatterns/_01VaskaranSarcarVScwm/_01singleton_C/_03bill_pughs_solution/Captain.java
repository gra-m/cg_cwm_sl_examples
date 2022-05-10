package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._03bill_pughs_solution;


class Captain {

    private Captain() {
        System.out.println("A captain is elected for your team.\n" +
                "This no longer called when just call dummy method");
    }

    private static class SingletonHelper {
        private static final Captain captain = new Captain();
    }

    // Global point of access
    public static  Captain getCaptain()
    {
        return SingletonHelper.captain;
    }

    public static void dummyMethodThatHasToBeHere() {
        System.out.println("It is a dummy method");
    }

}
