package _01designpatterns._000Bsingleton;

import java.util.HashMap;
import java.util.Map;
// not thread safe two people on diff threads could call this --> Object blocking  429  Synchronisation of threads.

class ConfigManager {
	private Map<String, Object> settings = new HashMap<>();
	// 2. Instantiate our Single instance of this class.
	private static ConfigManager instance = new ConfigManager();

	// 1. Make private constructor
	private ConfigManager() {}

// 3. Create getter for instance
public static ConfigManager getInstance() {
	return instance;
}

public Object get(String key) {
	return settings.get(key);
}

public void set(String key, Object value) {
	settings.put(key, value);
}
}
