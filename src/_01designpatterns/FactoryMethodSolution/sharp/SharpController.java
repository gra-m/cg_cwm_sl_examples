package _01designpatterns.FactoryMethodSolution.sharp;

import _01designpatterns.FactoryMethodSolution.matcha.Controller;
import _01designpatterns.FactoryMethodSolution.matcha.ViewEngine;

public class SharpController extends Controller {

@Override
protected ViewEngine createViewEngine() {
	return new SharpViewEngine();
}
}
