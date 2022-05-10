package _01designpatterns.FactoryMethodSolution.sharp;


import _01designpatterns.FactoryMethodSolution.matcha.ViewEngine;
import java.util.Map;

public class SharpViewEngine implements ViewEngine {

@Override
public String render(String viewName, Map<String, Object> context) {
	return "View rendered by Sharp";
}
}
