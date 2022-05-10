package FactoryMethodProblem.matcha;

// region 1. FACTORY METHOD -> THE PROBLEM
/**
 * We have created a new framework called Matcha, within our framework we
 * have a baseclass for all controllers called 'Controller' and a
 * ViewEngine.
 *
 * Someone is going to use our framework to create a products page, so in
 * their application they create a 'Products Controller'
 *
 * The problem is their controller is extending our Controller
 * (continued there)...
 */
// endregion



import java.util.Map;

public class MatchaViewEngine implements ViewEngine {

	@Override
	public String render(String viewName, Map<String, Object> context){
		return "View rendered by Matcha";
	}

}
