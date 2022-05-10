package abstractFactorySolution.ant;

import abstractFactorySolution.TextBox;

public class AntTextBox implements TextBox {

@Override
public void render() {
	System.out.println("Ant TextBox");
}
}
