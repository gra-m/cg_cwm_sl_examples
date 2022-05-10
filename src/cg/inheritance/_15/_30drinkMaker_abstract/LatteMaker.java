package cg.inheritance._15._30drinkMaker_abstract;

public class LatteMaker extends DrinkMaker {

    @Override
    void getRightCup() {
        System.out.println("Grab a cup for latte");
    }

    @Override
    void addIngredients() {
        System.out.println("Make coffee");
    }

    @Override
    void pour() {
        System.out.println("Fill with foamy milk");
    }

}
