package cg.designPatterns.SingletonReinforced;
//Lazy Loading Singleton, no need for null check everytime.

public class Sun implements Planet{

private Sun(){}

private static class LazyHolder {
static final Sun INSTANCE  = new Sun();
}

public static Sun getInstance() {
	return LazyHolder.INSTANCE;
}

}
