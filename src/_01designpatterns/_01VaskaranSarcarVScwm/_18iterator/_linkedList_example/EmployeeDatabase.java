package _01designpatterns._01VaskaranSarcarVScwm._18iterator._linkedList_example;

import java.util.LinkedList;

/**
 * Created by Gra_m on 2022 05 21
 */

public class EmployeeDatabase implements Database{
	private LinkedList<Employee> employeeList;

	public EmployeeDatabase(){
		employeeList = new LinkedList<>();
		employeeList.add(new Employee("Ron", 1, 1000.25));
		employeeList.add(new Employee("Jock", 2, 2000.5));
		employeeList.add(new Employee("Ambrose", 3, 3000.76));
		employeeList.add(new Employee("Jian", 4, 2550.0));
		employeeList.add(new Employee("Alex", 5, 753.84));
	}

	@Override
	public EmployeeIterator createIterator() {
		return new EmployeeIterator(employeeList);
	}
}
