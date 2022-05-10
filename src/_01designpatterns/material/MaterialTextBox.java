package abstractFactory.material;

import abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
@Override
public void render() {
	System.out.println("Material TextBox");
}
}
