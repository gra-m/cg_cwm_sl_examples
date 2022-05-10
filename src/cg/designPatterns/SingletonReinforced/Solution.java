package cg.designPatterns.SingletonReinforced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


// region ORIGINAL
/*
Reinforce the singleton pattern

1. Find an example of the singleton pattern used for lazy initialization. Use your favorite search engine (such as Google).
2. In separate files, create three singleton classes in its likeness and image: Sun, Moon, and Earth.
3. Implement the Planet interface in the Sun, Moon, and Earth classes.
4. In Solution class's static block, call the readKeyFromConsoleAndInitPlanet method.
5. Implement the readKeyFromConsoleAndInitPlanet method:
5.1. Read one String value from the console.
5.2. If the value is equal to one of the Planet interface's constants, create a corresponding object and assign it to Planet thePlanet, otherwise set the Planet thePlanet to null.


Requirements:
1. The Sun class should prevent Sun objects from being created outside the class.
2. The Sun class must have a private static Sun field named instance.
3. The Sun class must implement the public static getInstance method, which returns the value of the field instance.
4. The Sun class's getInstance method must ALWAYS return the same object.
5. The field instance must be initialized after the first call to the getInstance method, but not before.
6. The Moon class should prevent Moon objects from being created outside the class.
7. The Moon class must have a private static Moon field instance.
8. The Moon class must implement the public static getInstance method, which returns the value of the field instance.
9. The Moon class's getInstance method must ALWAYS return the same object.
10. The field instance must be initialized after the first call to the getInstance method, but not before.
11. The Earth class should prevent Earth objects from being created outside the class.
12. The Earth class must have a private static Earth field instance.
13. The Earth class must implement the public static getInstance method, which returns the value of the field instance.
14. The Earth class's getInstance method must ALWAYS return the same object.
15. The field instance must be initialized after the first call to the getInstance method, but not before.
16. The readKeyFromConsoleAndInitPlanet method must be called in the Solution class's static block.
17. The readKeyFromConsoleAndInitPlanet method should read one line from the keyboard.
18. The readKeyFromConsoleAndInitPlanet method must correctly update the value of the variable thePlanet according to the task conditions.
19. The Sun, Moon and Earth classes must be in separate files.

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here

    public static void readKeyFromConsoleAndInitPlanet() {
        // Implement step #5 here
    }
}
*/
// endregion




public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

static {readKeyFromConsoleAndInitPlanet();}

    public static void readKeyFromConsoleAndInitPlanet()  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
        String input = reader.readLine().toLowerCase(Locale.ROOT);

        if(input.equals("moon") || input.equals("sun") || input.equals("earth"))
            thePlanet = input.equals("sun") ? Sun.getInstance() : input.equals("earth") ? Earth.getInstance() : Moon.getInstance();
        else
            throw new NonPlanetException("Input not specific to planetary body.");

        System.out.println(thePlanet.getClass().getSimpleName());

    } catch (NonPlanetException npe) {
        thePlanet = null;
        System.out.println(npe.getMessage());
    } catch (IOException ioe) {
        thePlanet = null;
    }
        // Implement step #5 here

    }
}
