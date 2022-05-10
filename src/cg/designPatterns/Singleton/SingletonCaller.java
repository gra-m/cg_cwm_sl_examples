package cg.designPatterns.Singleton;

// region SINGLETON BRIEF:
/*
Singleton
A class is a singleton if it lets you create just one object of its type.

Implement the Singleton pattern:
1. Create a Singleton class in a separate file.
2. Add a static getInstance() method to it.
3. The getInstance method must return the same Singleton object any time the getInstance method is called.
4. Think about how you can prevent the creation of additional instances of this class.
5. Make all the constructors of the Singleton class private.
6. As a result, it should ONLY be possible to create an object (instance of this class) using the getInstance method.


Requirements:
1. The Singleton class must be in a separate file.
2. The Singleton class should prevent Singleton objects from being created outside the class.
3. The Singleton class must have a private static Singleton field instance.
4. The Singleton class must implement the public static getInstance method, which returns the value of the field instance.
5. The getInstance method must ALWAYS return the same object.*/

// endregion




public class SingletonCaller {

public static void main(String[] args) {

	Singleton singleton = Singleton.getInstance("Once initiated, this is it");
	Singleton singleton1 = Singleton.getInstance("This does not matter and is as irrelevant as Brandon");

	System.out.println(singleton.equals(singleton1));;
	System.out.println(singleton.getData());
	System.out.println(singleton1.getData());


}
}
