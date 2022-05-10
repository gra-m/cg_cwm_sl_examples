package cg.designPatterns.SingletonReinforced;

public class Moon implements Planet {

private Moon(){}

private static class LazyHolder{
	static final Moon INSTANCE = new Moon();
}

public static Moon getInstance() {
	return LazyHolder.INSTANCE;
}

}
