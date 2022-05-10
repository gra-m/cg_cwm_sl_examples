package _01designpatterns._01VaskaranSarcarVScwm._13z_visitor_in_composite.b_aftervisitor;

/**
 * Created by Gra_m on 2022 03 17
 */

public class SimpleEmployee implements Employee {
    private String name;
    private String dept;
    private int employeeCount = 0;
    private int yearsOfExperience;

    public SimpleEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " works in " + this.dept + " with this many years experience: "
        + this.yearsOfExperience);
    }

    public int getEmployeeCount() {
       return this.employeeCount;
    }

    @Override
    public int getTotalYearsExperienceToLevel() {
       return yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
