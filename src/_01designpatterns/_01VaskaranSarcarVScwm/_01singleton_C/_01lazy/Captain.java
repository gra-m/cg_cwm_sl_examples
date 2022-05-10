package _01designpatterns._01VaskaranSarcarVScwm._01singleton_C._01lazy;


final class Captain {
    private static Captain captain;

    private Captain() {}

    public static synchronized Captain getCaptain()
    {
        //Lazy Initialization -instance not created until getCaptain() called.
        // It could be initialized in a code block.
        if(captain == null) {
            captain = new Captain();
            System.out.println("New captain is elected to your team.");
        } else {
            System.out.println("You already hava a captain for your team. \n" +
                    "Send him for the toss.");
        }
        return captain;
    }
}
