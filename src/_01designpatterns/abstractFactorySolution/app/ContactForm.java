package abstractFactorySolution.app;

import abstractFactorySolution.WidgetFactory;

// New theme?? Create a new factory and pass it here.

public class ContactForm {
	public void render(WidgetFactory factory) {
		factory.creatTextBox().render();
		factory.createButton().render();
	}
}
