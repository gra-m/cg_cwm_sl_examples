package abstractFactory.app;

import abstractFactory.Theme;
import abstractFactory.ant.AntButton;
import abstractFactory.ant.AntTextBox;
import abstractFactory.material.MaterialButton;
import abstractFactory.material.MaterialTextBox;
// 1 Open close principle new theme == modify this method.
// 2. Errors can creep in if many items.
// SO USE Abstract Factory to provide an interface for creating families of related objects.
public class ContactForm {
	public void render(Theme theme) {
		if (theme == Theme.ANT) {
			new AntTextBox().render();
			new AntButton().render();
		} else if (theme == Theme.MATERIAL) {
			new MaterialTextBox().render();
			new MaterialButton().render();
		}


	}
}
