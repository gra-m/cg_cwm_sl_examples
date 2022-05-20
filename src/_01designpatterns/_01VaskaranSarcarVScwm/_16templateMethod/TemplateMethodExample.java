package _01designpatterns._01VaskaranSarcarVScwm._16templateMethod;

import _01designpatterns._01VaskaranSarcarVScwm._15strategy_B.differentPackage.*;
/**
 * Created by Gra_m on 2022 05 20
 *
 * GOF: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets
 * subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 *
 * IN A NUTSHELL:
 * The basic flow of an algorithm is defined in the structure of a superclass. Certain steps of this algorithm can then
 * be redefined in subclasses allowing customisation.
 *
 **/

public class TemplateMethodExample {
	public static void main(String[] args) {
		System.out.println("***Template Method Pattern Demo***\n");
		BasicEngineering preferrredCourse = new ComputerScience();
		System.out.println("Computer Sc. course verification:");
		preferrredCourse.completeCourse();
		System.out.println();
		preferrredCourse = new Electronics();
		System.out.println("Electronics course verification:");
		preferrredCourse.completeCourse();
		System.out.println();
		preferrredCourse = new WigWamScience();
		System.out.println("WigwamScience course verification:");
		preferrredCourse.completeCourse();

	}

	}
