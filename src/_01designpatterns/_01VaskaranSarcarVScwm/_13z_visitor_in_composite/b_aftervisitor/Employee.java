package _01designpatterns._01VaskaranSarcarVScwm._13z_visitor_in_composite.b_aftervisitor;

/**
 * Created by Gra_m on 2022 03 17
 */

public interface Employee {
    void acceptVisitor(Visitor visitor);
    void printStructures();
    int getEmployeeCount();
    int getTotalYearsExperienceToLevel();
}
