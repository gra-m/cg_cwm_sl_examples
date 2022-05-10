package cg.type_casting;


// region ORIGINAL
/*
Food
1. Implement the Selectable interface in the Food class.
2. The onSelect() method should display "The food was selected".
3. Think which methods can be called with the variable food and which with the variable selectable.
4. In the foodMethods method, call the onSelect and onEat methods, if possible.
5. In the selectableMethods method, call the onSelect and onEat methods, if possible.
6. Don't use an explicit type conversion.


Requirements:
1. The Selectable interface must be implemented in the Food class.
2. The onSelect() method in the Food class should display "The food was selected".
3. In the foodMethods method, you need to call methods on a Food object.
4. In the selectableMethods method, you need to call methods accessible from any object that implements the Selectable interface.
*/
/*
package com.codegym.task.task14.task1405;

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //write your code here
    }

    public static void selectableMethods(Selectable selectable) {
        //write your code here
    }

    interface Selectable {
        void onSelect();
    }

    static class Food {
        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}
 */
// endregion

class _03Food {
public static void main(String[] args) {

	Food food = new Food();
	Selectable selectable = new Food();
	Food newFood = (Food) selectable;

	foodMethods(food);
	selectableMethods(selectable);
}

public static void foodMethods(Food food) {
	food.onEat();
	food.onSelect();
}

public static void selectableMethods(Selectable selectable) {
	selectable.onSelect();
}

interface Selectable {
	void onSelect();
}

static class Food implements Selectable{
	public void onEat() {
		System.out.println("The food was eaten");
	}

	@Override
	public void onSelect() {
		System.out.println("The food was selected");
	}
}
}