package abstractFactory.ant;

import abstractFactory.Button;

public class AntButton implements Button {
@Override
public void render() {
	System.out.println("Ant Button");
}
}
