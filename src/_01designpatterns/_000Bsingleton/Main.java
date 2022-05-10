package _01designpatterns._000Bsingleton;

// region SINGLETON_SOLUTION

/**
 * We cannot have multiple places for storing application settings.
 * NOW -> we can only ever have one instance of ConfigManager
 */

// endregion

public class Main {
public static void main(String[] args) {
	// 4. Use getInstance to only ever return the single instance of our ConfigManager settings
	ConfigManager manager = ConfigManager.getInstance();
	manager.set("name", "Mosh");

	ConfigManager other = ConfigManager.getInstance();
	System.out.println(other.get("name"));

}
}
