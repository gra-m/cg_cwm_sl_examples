package _01designpatterns._01VaskaranSarcarVScwm._04afactory_abstractAdvantageC;

/**
 * Created by Gra_m on 2022 03 14
 */

abstract class AnimalFactory {

    public Animal makeAnimal() {
        System.out.println("\n\nI am the inner text of AnimalFactory.makeAnimal() and you cannot ignore my rules, I am\n" +
                "like the 'gubmint'. Dependent on who bribes the most, will get used the most, all bribes will\n" +
                "be obfuscated within unintelligible spaghetti code and righteous and charitable sounding facade patterns.\n");

        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    };
    abstract Animal createAnimal();
}
