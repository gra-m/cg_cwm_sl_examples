package _01designpatterns._01VaskaranSarcarVScwm._18iterator._linkedList_example;

/**
 * Created by Gra_m on 2022 05 21
 *
 * Why not public? Automatic completion in IDE gets awkward with multiple duplicate classes in different packages
 *
 */

class Employee {
	private String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Name: " + this.getName() + "\nID: " + this.getId() + "\nSalary: $" + this.getSalary();
	}
}
