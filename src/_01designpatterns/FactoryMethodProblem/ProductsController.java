package FactoryMethodProblem;

import FactoryMethodProblem.matcha.Controller;
import FactoryMethodProblem.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;


// Class in someone's application
public class ProductsController extends Controller {
	public void listProducts() {
		// Get products from a database

		// Then we create a context object to pass to our view:
		Map<String, Object> context = new HashMap<>();
		// context.put(products)
		render("products.html", context, new MatchaViewEngine());

	}
}
