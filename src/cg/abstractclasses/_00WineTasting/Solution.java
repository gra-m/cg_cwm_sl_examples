package cg.abstractclasses._00WineTasting;


//region StartPoint
/*
public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getCelebrationName());
        System.out.println(getSparklingWine().getCelebrationName());
        System.out.println(getWine().getCelebrationName());
    }

    public static Drink getDeliciousDrink() {

    }

    public static Wine getWine() {
    }

    public static Wine getSparklingWine() {
    }
}

 */
//endregion

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getCelebrationName());
        System.out.println(getSparklingWine().getCelebrationName());
        System.out.println(getWine().getCelebrationName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();

    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getSparklingWine() {
        return new SparklingWine();
    }
}
