package _01designpatterns._01VaskaranSarcarVScwm._13z_visitor_in_composite.a_beforevisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gra_m on 2022 03 17
 */

public class CompositeEmployee implements Employee {
    private List<Employee> controls;
    private String name;
    private String dept;
    private int yearsOfExperience;
    private int employeeCount = 0;

    public CompositeEmployee(String n, String d, int i) {
        this.name = n;
        this.dept = d;
        this.yearsOfExperience = i;
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

    @Override
    public int getEmployeeCount() {
        employeeCount = controls.size();

        for(Employee e: controls)
            employeeCount += e.getEmployeeCount();

        return employeeCount;
    }

    @Override
    public int getTotalYearsExperienceToLevel() {
       int totalExperienceToLevel = this.yearsOfExperience;
            for(Employee e: controls)
                totalExperienceToLevel+= e.getTotalYearsExperienceToLevel();

        return totalExperienceToLevel;
    }


    public List<Employee> getControls() {
        return controls;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
