package cg.examples.overloadedconstructors;

public class SubSolution extends Solution{
    public SubSolution() {
    }

    protected SubSolution(String string) {
        super(string);
    }

    SubSolution(Integer integer) {
        super(integer);
    }
}
