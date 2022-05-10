package cg.inheritance._15._30drinkMaker_abstract;

public class TeaMaker extends DrinkMaker{

    @Override
    void getRightCup() {
        System.out.println("Grab a cup for tea");
    }

    @Override
    void addIngredients() {
        System.out.println("Add tea leaves");
    }

    @Override
    void pour() {
        System.out.println("Fill with boiling water");
    }

}
