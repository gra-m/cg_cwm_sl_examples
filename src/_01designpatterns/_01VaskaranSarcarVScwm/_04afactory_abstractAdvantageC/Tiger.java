package _01designpatterns._01VaskaranSarcarVScwm._04afactory_abstractAdvantageC;

/**
 * Created by Gra_m on 2022 03 14
 */

class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("Tiger: (pulls glasses down nose and stares meaningfully into your eyes) Me?\n" +
                "I specialise in SQL server connections, guaranteed perfect and factory fresh.. Dinner?");
    }

    @Override
    public void preferredAction() {
        System.out.println("As a tiger, when not making SQL server connections, I rest, roar, hunt or eat. My favourite?" +
                " EATING.");

    }
}
