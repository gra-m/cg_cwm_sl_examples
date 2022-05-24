package _01designpatterns._01VaskaranSarcarVScwm._23interpreter_B;

/**
 * Created by Gra_m on 2022 05 24
 */

public class NotExpression implements Employee{
	private Employee emp;

	public NotExpression(Employee expr) {
		this.emp = expr;
	}

	@Override
	public boolean interpret(Context context) {
		return !emp.interpret(context);
	}
}
