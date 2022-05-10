package _01designpatterns._000Csingleton;

// region ORIGINAL
/*
public class Solution {
public static void main(String[] args) {
	OurPresident expectedPresident = OurPresident.getOurPresident();
	OurPresident ourPresident = OurPresident.getOurPresident();
	System.out.println(expectedPresident == ourPresident );
}
}

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}

///////////////////////////

We meet the singleton pattern again in synchronization in a static block.
Create a synchronized block inside a static block inside the OurPresident class.
Inside the synchronized block, initialize president.
Requirements:

    •
    The OurPresident class must have a private static OurPresident president.
    •
    The OurPresident class must contain the public static OurPresident getOurPresident() method.
    •
    The OurPresident class must have a private constructor.
    •
    The OurPresident class must have a static block.
    •
    The OurPresident class's static block must have a synchronized block.

    •
The synchronized block must initialize president.

*/

// endregion

public class Solution {
public static void main(String[] args) {
	OurPresident expectedPresident = OurPresident.getOurPresident();
	OurPresident ourPresident = OurPresident.getOurPresident();
	System.out.println(expectedPresident == ourPresident);
}
}

