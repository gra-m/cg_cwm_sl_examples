package cg.inheritance._15._30drinkMaker_abstract;

public abstract class DrinkMaker {

    abstract void getRightCup();

    abstract void addIngredients();

    abstract void pour();

    void makeDrink() {
       getRightCup();
       addIngredients();
       pour();
    }

}
