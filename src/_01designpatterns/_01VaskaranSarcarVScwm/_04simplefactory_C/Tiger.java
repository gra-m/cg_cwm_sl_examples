package _01designpatterns._01VaskaranSarcarVScwm._04simplefactory_C;

/**
 * Created by Gra_m on 2022 03 14
 */

public class Tiger implements Animal{
    @Override
    public void speak() {
        System.out.println("Tiger says: 'Eat pig, donkey!'");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tigers prefer hunting, and shouting the three words they know, eat, pig and donkey.");
    }
}
