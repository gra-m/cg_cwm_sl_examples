package _01designpatterns._01VaskaranSarcarVScwm._23interpreter_B;

/**
 * Created by Gra_m on 2022 05 24
 */

public class EmployeeBuilder {

	public Employee buildExpression(Employee emp1, String operator, Employee emp2) {

		switch (operator.toLowerCase()) {
			case "or":
				return new OrExpression(emp1, emp2);
			case "and":
				return new AndExpression(emp1, emp2);
			case "not":
				return new NotExpression(emp1);
			default:
				System.out.println("Only AND OR and NOT operators are currently available");
				return null;
		}

	}
}
