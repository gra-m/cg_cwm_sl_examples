package _01designpatterns._01VaskaranSarcarVScwm._04simplefactory_C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Gra_m on 2022 03 14
 */

public class SimpleFactory {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Animal createAnimal() {
        int intChoice = -1;
        do {
            System.out.println("Please enter 0 for dog or 1 for tiger:");
            try {
                intChoice = Integer.parseInt(br.readLine());
                System.out.println(intChoice);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Nope, that was invalid input..");
            }

        } while (intChoice != 0 && intChoice != 1);

        if (intChoice == 0)
            return new Dog();
        else
            return new Tiger();

    }

}
