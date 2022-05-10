package abstractFactorySolution.ant;

import abstractFactorySolution.Button;

public class AntButton implements Button {
@Override
public void render() {
	System.out.println("Ant Button");
}
}
