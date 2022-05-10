package _01designpatterns._01VaskaranSarcarVScwm._13z_visitor_in_composite.b_aftervisitor;

/**
 * Created by Gra_m on 2022 03 28
 *
 *
 */

public class ConcreteVisitor implements Visitor{

    @Override
    public void visitTheElement(CompositeEmployee compositeEmployee) {
        System.out.println("I'm CompositeEmployee: " + compositeEmployee.getName()  + " and I have " +
                compositeEmployee.getYearsOfExperience() + " years of experience myself." );

        boolean promotionTime = compositeEmployee.getYearsOfExperience() > 15;

        if(promotionTime)
            System.out.println("And I am eligible for promotion");

    }

    @Override
    public void visitTheElement(SimpleEmployee simpleEmployee) {
        System.out.println("I'm SimpleEmployee: " + simpleEmployee.getName()  + " and I have " +
                simpleEmployee.getYearsOfExperience() + " years of experience myself." );
        boolean promotionTime = simpleEmployee.getYearsOfExperience() > 12;

        if(promotionTime)
            System.out.println("And I am eligible for promotion");

    }
}
