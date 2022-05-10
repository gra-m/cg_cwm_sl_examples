package _01designpatterns._01VaskaranSarcarVScwm._11Composite_S;

/**
 * Created by Gra_m on 2022 03 17
 */

public class SimpleEmployee implements Employee{
    private String name;
    private String dept;
    private int employeeCount = 0;

    public SimpleEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " works in " + this.dept);
    }

    public int getEmployeeCount() {
       return this.employeeCount;
    }


}
