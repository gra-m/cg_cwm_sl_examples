package _01designpatterns._01VaskaranSarcarVScwm._13z_visitor_in_composite.b_aftervisitor;

/**
 * Created by Gra_m on 2022 03 28
 */

public interface Visitor {
    void visitTheElement(CompositeEmployee compositeEmployee);
    void visitTheElement(SimpleEmployee simpleEmployee);
}
