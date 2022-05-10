package javatest.core.javadeclarations.static_vs_instance;

class _02Gorilla {
public static int count;

public static void addGorilla() {
	count++;
}

public static void announceBabiesToEveryone() {
	addGorilla();
//	babyGorilla(); // DOES NOT COMPILE
}

public void babyGorilla() {
	count++;
}

public void announceBabies() {
	addGorilla();
	babyGorilla();
}
public int total;
// public static float average = total /count; // DOES NOT COMPILE

}
