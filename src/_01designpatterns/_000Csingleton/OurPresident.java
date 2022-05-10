package _01designpatterns._000Csingleton;

public class OurPresident {
private static OurPresident president;

static{{synchronized(OurPresident.class){
	president = new OurPresident();}}}

private OurPresident() {
}

public static OurPresident getOurPresident() {
	return president;
}
}
