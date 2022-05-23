package _01designpatterns._01VaskaranSarcarVScwm._21mediator_B.simple;

/**
 * Created by Gra_m on 2022 05 23
 */

public interface Mediator {
	void register(Employee employee);
	void sendMessage(Employee employee, String message) throws InterruptedException;
}
