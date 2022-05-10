package _01designpatterns.FactoryMethodSolution.matcha;


// region  FACTORY METHOD -> THE SOLUTION

/*
1. New abstract method createViewEngine
 */
// endregion


import java.util.Map;

public abstract class Controller {

	public void render(String viewName, Map<String, Object> context) {
		var engine = createViewEngine();
		var html = engine.render(viewName, context);
		System.out.println(html);
	}

// protected abstract ViewEngine createViewEngine(); No default
// ViewEngine make extending classes override their way.

// Default implementaion:
protected ViewEngine createViewEngine() {
		return new MatchaViewEngine();
}

}
