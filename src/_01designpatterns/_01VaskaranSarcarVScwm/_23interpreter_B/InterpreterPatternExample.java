package _01designpatterns._01VaskaranSarcarVScwm._23interpreter_B;

/**
 * Created by Gra_m on 2022 05 24
 *
 * GOF:
 * Given a language, define a representation for its grammar along with an interpreter that uses the
 * representation to interpret sentences in the language.
 *
 * IN A NUTSHELL:
 * 1. Grammar should be simple. A complex grammar means many rules and classes.
 * 2. Elements of grammar should be different but have the same basic rules. E.g. arithmetic expressions in a
 *    calculator program, they are in the same family, but each differs.
 *
 * See img.png:
 * AbstractExpression I -> pass context object to its interpret(context) method.
 * TerminalExpression -> Leaf node, does not need other expressions to interpret.
 * NonTerminalExpression -> Branch node, calling interpret on this calls it on all of it's children too.
 * Context -> Holds the global info that the interpreter needs
 * Client -> Calls the interpret method, optionally builds a syntax tree based on rules of the language
 *
 *
 *
 *
 *
 */

public class InterpreterPatternExample {
	public static void main(String[] args) {
		System.out.println("***Interpreter Pattern Example***");
		//Criteria for promotion:
		//Minimum 10 yrs. expr
		//Employee grade either G2 or G3
		Context context=new Context(10,"G2","G3");

		//Different employees with grades
		Employee emp1 = new IndividualEmployee(5,"G1");
		Employee emp2 = new IndividualEmployee(10,"G2");
		Employee emp3 = new IndividualEmployee(15,"G3");
		Employee emp4 = new IndividualEmployee(20,"G4");

		EmployeeBuilder builder=new EmployeeBuilder();

		System.out.println("emp1 is eligible for promotion. " + emp1.
				interpret(context));
		System.out.println("emp2 is eligible for promotion. " + emp2.
				interpret(context));
		System.out.println("emp3 is eligible for promotion. " + emp3.
				interpret(context));
		System.out.println("emp4 is eligible for promotion. " + emp4.
				interpret(context));

		System.out.println("Are either emp1 or emp3 eligible for promotion? " +
				builder.buildExpression(emp1,"Or",emp3).
		interpret(context));
		System.out.println("Are both emp2 and emp4 eligible for promotion? " +
				builder.buildExpression(emp2,"And" ,emp4).
		interpret(context));
		System.out.println("The statement 'emp3 is NOT eligible for promotion' is true? " +
				builder.buildExpression(emp3, "Not",null).
		interpret(context));
	}
}
