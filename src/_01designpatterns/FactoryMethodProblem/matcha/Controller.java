package FactoryMethodProblem.matcha;


// region 2. FACTORY METHOD -> THE PROBLEM

/**
 * Our Controller and so our users controller is tightly coupled to
 * the MatchaViewEngine, what if they want to use a better one??
 *
 * We solve this part of the problem by extracting our controller to an ]
 *
 */

// endregion


import java.util.Map;

public class Controller {

	public void render(String viewName, Map<String, Object> context, ViewEngine engine) {
		//var engine = new MatchaViewEngine();	NOT needed once interface extracted.
		var html = engine.render(viewName, context);
		System.out.println(html);
	}
}
