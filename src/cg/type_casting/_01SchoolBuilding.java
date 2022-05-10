package cg.type_casting;

// region ORIGINAL
/*
package com.codegym.task.task14.task1403;

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        return new School();
    }

    public static Building getBuilding() {
       return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }
}

1. Create the correct inheritance relationship between Building and School.
2. Think about which type of object the getSchool and getBuilding methods should return.
3. Change null to a Building or School object.

P.S. Don't change the signatures of the getSchool and getBuilding methods.
Requirements:

    •
    The School class should inherit the Building class.
    •
    The getSchool method must return a new School.
    •
    The getBuilding method must return a new Building.
    •
    The School class must be static.
    •
    The Building class must be static.

*/

 // endregion




class _01SchoolBuilding {
public static void main(String[] args) {
	Building school = getSchool();
	Building shop = getBuilding();

	System.out.println(school);
	System.out.println(shop);
}

public static Building getSchool() {
	return new School();
}

public static Building getBuilding() {
	return new Building();
}

static class School extends Building {
	@Override
	public String toString() {
		return "School";
	}
}

static class Building {
	@Override
	public String toString() {
		return "Building";
	}
}
}
