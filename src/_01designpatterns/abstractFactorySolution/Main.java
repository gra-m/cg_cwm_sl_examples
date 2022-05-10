package abstractFactorySolution;

import abstractFactorySolution.ant.AntWidgetFactory;
import abstractFactorySolution.app.ContactForm;
import abstractFactorySolution.material.MaterialWidgetFactory;

public class Main {
public static void main(String[] args) {
	new ContactForm().render(new MaterialWidgetFactory());
	new ContactForm().render(new AntWidgetFactory());
}
}
