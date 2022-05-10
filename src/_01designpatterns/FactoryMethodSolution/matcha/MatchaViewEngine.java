package _01designpatterns.FactoryMethodSolution.matcha;

// region 1. FACTORY METHOD -> THE SOLUTION

// endregion

// region 3 FACTORY METHOD -> Extract Interface

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {

	@Override
	public String render(String viewName, Map<String, Object> context){
		return "View rendered by Matcha";
	}

}
