package _01designpatterns._01VaskaranSarcarVScwm._13z_visitor_in_composite.a_beforevisitor;

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
    public void printStructures() {
        System.out.println("\t" + this.name + " works in " + this.dept);
    }

    public int getEmployeeCount() {
       return this.employeeCount;
    }

    @Override
    public int getTotalYearsExperienceToLevel() {
       return yearsOfExperience;
    }

}
