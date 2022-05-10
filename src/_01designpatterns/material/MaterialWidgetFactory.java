package abstractFactorySolution.material;

import abstractFactorySolution.TextBox;
import abstractFactorySolution.Button;
import abstractFactorySolution.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
@Override
public Button createButton() {
	return new MaterialButton();
}

@Override
public TextBox creatTextBox() {
	return new MaterialTextBox();
}
}
