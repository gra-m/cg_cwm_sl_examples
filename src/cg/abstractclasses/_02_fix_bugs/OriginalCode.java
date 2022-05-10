package cg.abstractclasses._02_fix_bugs;

/* 
Fixing bugs

*/

public class OriginalCode {
//    public static void main(String[] args) {
//        CanSwim creature = new Orca();
//        creature.swim();
//        creature = new Whale();
//        creature.swim();
//        creature = new RiverOtter();
//        creature.swim();
//    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature {
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca {
    }

    static class Whale {

    }

    static class RiverOtter {

    }
}
