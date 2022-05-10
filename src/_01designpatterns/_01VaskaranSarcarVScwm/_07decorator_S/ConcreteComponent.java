package _01designpatterns._01VaskaranSarcarVScwm._07decorator_S;

class ConcreteComponent extends Component {
    static int count = 0;
    public void makeHouse() {
        count++;
        System.out.println("Original House is complete. It is closed for modification. Original Functionality: " + count);
    }
}
