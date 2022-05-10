package cg.designPatterns.Singleton;

import static java.util.Objects.isNull;

public class Singleton {

private static Singleton onlyInstance;
private String data = "";


private Singleton(String stringData) {
	this.data = stringData;
}

public String getData() {
	return this.data;
}

public static Singleton getInstance(String stringData) {
	return (isNull(onlyInstance)) ? onlyInstance = new Singleton(stringData) : onlyInstance;

}


}
