package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.extended;

/**
 * Created by Gra_m on 2022 05 23
 */

public interface Mediator {
	void register(Employee employee);
	void sendMessage(Employee fromEmployee, Employee toEmployee, String message) throws InterruptedException;
}
