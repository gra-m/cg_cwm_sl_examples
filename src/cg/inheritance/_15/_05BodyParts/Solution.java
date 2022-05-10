package cg.inheritance._15._05BodyParts;

//region ORIGINAL


/*
OOP: Fix inheritance problems
Correct the containsBones method and all associated logic so that:
1. The program's behavior remains the same.
2. The containsBones method must return an Object and the value "Yes" instead of true, and "No" instead of false


Requirements:
1. The BodyPart class's containsBones method must return an Object.
2. The Finger class must be a descendant of the BodyPart class.
3. The Finger class's containsBones method must return an Object.
4. The BodyPart class's containsBones method should return "Yes".
5. The Finger class's containsBones method should return "Yes" if the BodyPart class's containsBones method returns "Yes" and the isArtificial flag is false. If this condition is not satisfied, then return "No".
6. The BodyPart class's toString method should return a string formatted as follows "<name> (name of the body part) contains bones" if the containsBones method returns "Yes" for the body part. If it returns "No", then the string should be formatted as "<name> (name of the body part) does not contain bones".
 */



/*
package com.codegym.task.task15.task1505;

import java.util.ArrayList;
import java.util.List;



public class Solution {
    public static interface LivingPart {
        boolean containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public boolean containsBones() {
            return true;
        }

        public String toString() {
            return containsBones() ? name + " contains bones" : name + " does not contain bones";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public boolean containsBones() {
            return super.containsBones() && !isArtificial;
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("Hand").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Hand"));
        bodyParts.add(new BodyPart("Leg"));
        bodyParts.add(new BodyPart("Head"));
        bodyParts.add(new BodyPart("Body"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Thumb", true));
        fingers.add(new Finger("Forefinger", true));
        fingers.add(new Finger("Middle finger", true));
        fingers.add(new Finger("Ring-finger", false));
        fingers.add(new Finger("Pinky", true));
        System.out.println(fingers.toString());
    }
}


 */

//endregion


import java.util.ArrayList;
import java.util.List;



public class Solution {

public static interface LivingPart {
	Object containsBones();
}

public static class BodyPart implements LivingPart {
	private String name;

	public BodyPart(String name) {
		this.name = name;
	}

	public Object containsBones() {
		return "Yes";
	}

	public String toString() {
		return containsBones().equals("Yes") ? name + " contains bones" : name + " does not contain bones";
	}
}

public static class Finger extends BodyPart {
	private boolean isArtificial;

	public Finger(String name, boolean isArtificial) {
		super(name);
		this.isArtificial = isArtificial;
	}

	public Object containsBones() {
		return super.containsBones().equals("Yes") && !isArtificial ? "Yes" : "No";
	}
}

public static void main(String[] args) {
	printlnFingers();
	printlnBodyParts();
	printlnLivingParts();
}

private static void printlnLivingParts() {
	System.out.println(new BodyPart("Hand").containsBones());
}

private static void printlnBodyParts() {
	List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
	bodyParts.add(new BodyPart("Hand"));
	bodyParts.add(new BodyPart("Leg"));
	bodyParts.add(new BodyPart("Head"));
	bodyParts.add(new BodyPart("Body"));
	System.out.println(bodyParts.toString());
}

private static void printlnFingers() {
	List<Finger> fingers = new ArrayList<Finger>(5);
	fingers.add(new Finger("Thumb", true));
	fingers.add(new Finger("Forefinger", true));
	fingers.add(new Finger("Middle finger", true));
	fingers.add(new Finger("Ring-finger", false));
	fingers.add(new Finger("Pinky", true));
	System.out.println(fingers.toString());
}
}


