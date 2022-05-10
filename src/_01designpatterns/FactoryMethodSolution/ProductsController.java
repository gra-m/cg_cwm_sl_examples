package _01designpatterns.FactoryMethodSolution;

import _01designpatterns.FactoryMethodSolution.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;


// Change to extend Controller for default Matcha  render, or
// extend SharpController to render with Sharp.
public class ProductsController extends SharpController {
	public void listProducts() {
		// Get products from a database
		Map<String, Object> context = new HashMap<>();
		// context.put(products)
		render("products.html", context);

	}
}
