package _01designpatterns._000Asingleton;

// region SINGLETON_PROBLEM

/**
 * We cannot have multiple places for storing application settings.
 */

// endregion

public class Main {
public static void main(String[] args) {
	ConfigManager manager = new ConfigManager();
	manager.set("name", "Mosh");

	ConfigManager other = new ConfigManager();
	System.out.println(other.get("name"));

}
}
