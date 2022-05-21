package _01designpatterns._01VaskaranSarcarVScwm._18iterator._linkedList_example;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Gra_m on 2022 05 21
 *
 *
 */

class EmployeeIterator implements Iterator<Employee> {
	private LinkedList<Employee> employeeList;
	private int position;

	public EmployeeIterator(LinkedList<Employee> employeeList) {
		this.employeeList = employeeList;
		position = 0;
	}

	public void first() {
		position = 0;
	}

	public Employee currentItem() {
		return employeeList.get(position);
	}

	@Override
	public boolean hasNext() {
		return position < employeeList.size();
	}

	@Override
	public Employee next() {
		return employeeList.get(position++);
	}


}
