package abstractFactorySolution.ant;

import abstractFactorySolution.Button;
import abstractFactorySolution.TextBox;
import abstractFactorySolution.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
@Override
public Button createButton() {
	return new AntButton();
}

@Override
public TextBox creatTextBox() {
	return new AntTextBox();
}
}
