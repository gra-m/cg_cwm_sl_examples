package cg.interfaces._10_Computer;

public class Mouse implements CompItem{

@Override
public String getName(){
	return this.getClass().getSimpleName();
}
}
