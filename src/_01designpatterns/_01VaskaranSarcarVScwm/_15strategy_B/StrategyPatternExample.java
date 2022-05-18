package _01designpatterns._01VaskaranSarcarVScwm._15strategy_B;

/**
 * Created by Gra_m on 2022 05 18
 *
 * GOF:
 *
 * IN A NUTSHELL:
 *
 * CONCEPT:
 *
 **/
/**
 * Created by Gra_m on 2022 05 18
 *
 * GOF: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm
 * vary independently of the clients that use it.
 *
 * IN A NUTSHELL: A number of task performing 'strategies/behaviours' are implemented within separate classes.
 * The client dynamically chooses the strategy that matches its current need.
 *
 * REAL-WORLD-EXAMPLE: Client object 'team B' is 1-0 down its football match. Client object 'team A' is 1-0 up. Each
 * team chooses the relevant strategy based on their position. Team B = class AllOutAttack. Team A = class HitOnTheBreak.
 *
 * OtherConsiderations:
 * SP says: Use object composition instead of sub-classing. So, no overriding of parent class behaviours, instead,
 * behaviours/strategies are in different classes that share a common interface.
 * SP says: Client class decides which strategy to use, not the context class.
 * SP says: A context object contains reference variables for the strategy objects interface type, you obtain different
 * strategies by changing the strategy in the context.
 *
 *
 **/

// Client Code
public class StrategyPatternExample {

	public static void main(String[] args) {
		System.out.println("***Strategy Pattern Demo***");
		Vehicle vehicleContext = new Boat();
		vehicleContext.showMe();
		vehicleContext.showTransportMedium();
		System.out.println("+++++++++++++++++");
		vehicleContext = new Aeroplane();
		vehicleContext.showMe();
		vehicleContext.showTransportMedium();

	}
}
