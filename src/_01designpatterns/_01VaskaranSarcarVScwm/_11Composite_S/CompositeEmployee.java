package _01designpatterns._01VaskaranSarcarVScwm._11Composite_S;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gra_m on 2022 03 17
 */

public class CompositeEmployee implements Employee{
    private List<Employee> controls;
    private String name;
    private String dept;
    private int employeeCount = 0;

    public CompositeEmployee(String n, String d) {
        this.name = n;
        this.dept = d;
        controls = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        controls.add(e);
    }

    public void removeEmployee(Employee e) {
        controls.remove(e);
    }

    public void printStructures() {
        System.out.println("\t" + this.name + " works in " + this.dept);
        for(Employee e: controls)
            e.printStructures();

        System.out.println();
    }

    public int getEmployeeCount() {
        employeeCount = controls.size();

        for(Employee e: controls)
            employeeCount += e.getEmployeeCount();

        return employeeCount;
    }

}
