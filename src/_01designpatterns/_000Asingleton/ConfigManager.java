package _01designpatterns._000Asingleton;

import java.util.HashMap;
import java.util.Map;

class ConfigManager {
	private Map<String, Object> settings = new HashMap<>();


public Object get(String key) {
	return settings.get(key);
}

public void set(String key, Object value) {
	settings.put(key, value);
}
}
