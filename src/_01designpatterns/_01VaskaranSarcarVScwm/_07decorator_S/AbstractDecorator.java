package _01designpatterns._01VaskaranSarcarVScwm._07decorator_S;
// Attach additional responsibilities to an object dynamically.
// Decorators provide a flexible alternative to subclassing for extending functionality.
// There is no abstract method in this abstract class, this is obv possible though impossible to have abs method and not mark abs.
// This means Abstract Dec cannot be instantiated
abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setTheComponent(Component component) {
        this.component = component;
    }

    public void makeHouse() {
        if (component != null) {
            component.makeHouse(); //Delegating the task
        }
    }
}
