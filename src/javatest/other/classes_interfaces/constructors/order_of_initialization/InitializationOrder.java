package javatest.other.classes_interfaces.constructors.order_of_initialization;

public class InitializationOrder {
private static final String VEGETABLE = "Potato";
static{System.out.println(VEGETABLE);}
private String name = "Torchie";
{ System.out.println(name); }
private static int COUNT = 0;
static { System.out.println(COUNT); }
{ COUNT++; System.out.println(COUNT); }
public InitializationOrder() {
System.out.println("constructor");
}
public static void main(String[] args) {
System.out.println("ready to construct");
new InitializationOrder();
}
}
