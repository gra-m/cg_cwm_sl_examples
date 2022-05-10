package cg.type_casting.chicken_factory;

// region ORIGINAL
/*
package com.codegym.task.task14.task1408;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            //write your code here
            return hen;
        }
    }


}
 */
// endregion

// region BRIEF
/*
Chicken factory
Write a factory (HenFactory) for making chickens (Hen):

1. Write a Hen class.
1.1. Make it abstract.
1.2. Add an int getMonthlyEggCount() method to the abstract class.
1.3. Add a String getDescription() method to the class. It should return "I am a chicken."
2. Create an NorthAmericanHen class that inherits Hen.
3. Create an EuropeanHen class that inherits Hen.
4. Create an AsianHen class that inherits Hen.
5. Create an AfricanHen class that inherits Hen.
6. In each of these four classes, write your own implementation of the getMonthlyEggCount method.
The method should return the number of eggs per month produced by that type of chicken.
7. In each of these four classes, write your own implementation of the getDescription method.

The method must return a string as follows:
<parent class>.getDescription() + " I come from <continent>. I lay <n> eggs a month."
where <continent> is the name of the continent
and <n> is the number of eggs per month.

8. In the HenFactory class, implement the getHen method. It should return a chicken breed corresponding to the continent that the chicken came from.
9. All the classes you create must be in separate files.


Requirements:
1. The Hen class must be abstract.
2. The Hen class must have an abstract int getMonthlyEggCount() method.
3. The Hen class must implement a String getDescription() method, which returns "I am a chicken."
4. The NorthAmericanHen, EuropeanHen, AsianHen, and AfricanHen classes must inherit the Hen class and be located in separate files.
5. The NorthAmericanHen, EuropeanHen, AsianHen, and AfricanHen classes must implement the getMonthlyEggCount method, which should return the number of eggs per month laid by the corresponding type of chicken.
6. The NorthAmericanHen, EuropeanHen, AsianHen, and AfricanHen must override the parent class's getDescription method so that the returned string looks like this: <parent class>.getDescription() + " I come from <continent>. I lay <n> eggs a month." where <continent> is the name of the continent, and <n> is the number of eggs per month.
7. The getHen method must be implemented in the HenFactory class and must return the chicken type that corresponds to the passed continent.
 */
// endregion
class ChickenApp {

public static void main(String[] args) {
	Hen hen = HenFactory.getHen(Continent.EUROPE);
	System.out.println(hen.getMonthlyEggCount());
	System.out.println(hen.getDescription());
}

static class HenFactory {

	static Hen getHen(String continent) {
		Hen hen = null;
		switch (continent){
			case "Africa":
				hen = new AfricanHen();
				break;
			case "North America":
				hen = new NorthAmericanHen();
				break;
			case "Europe":
				hen = new EuropeanHen();
				break;
			case "Asia":
				hen = new AsianHen();
				break;
		}

		return hen;
	}
}

}
