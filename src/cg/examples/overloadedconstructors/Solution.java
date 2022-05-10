package cg.examples.overloadedconstructors;
// region Original
/* 

public class Solution {
    public static void main(String[] args) {

    }
}

Overloading constructors
1. In the Solution class, create 4 constructors with different access modifiers.
2. In a separate file, create a SubSolution class and make it a child of the Solution class.
3. In the SubSolution class, use the Alt+Insert -> Constructors command to create constructors.
4. Correct the SubSolution constructors' access modifiers so that there are 3 constructors with different access modifiers (all except private).


Requirements:
1. The SubSolution class should have 3 different constructors.
2. The Solution class should have 4 different constructors.
3. The Solution class must define constructors with all possible access modifiers.
4. The SubSolution class must define constructors with all possible access modifiers except private.
5. The Solution class must be the parent of the SubSolution class.

*/
// endregion

public class Solution {

    public Solution() {}
    protected Solution(String string) {}
    Solution(Integer integer){}
    private Solution(Long longNumber) {}

    public static void main(String[] args) {
    }
}

