package cg.designPatterns.SingletonReinforced;

public class Earth implements Planet {

private Earth(){}

private static class LazyHolder{
public static final Earth INSTANCE = new Earth();
}

public static Earth getInstance(){
	return LazyHolder.INSTANCE;
}
}
