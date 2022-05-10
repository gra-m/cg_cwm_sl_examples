package cg.interfaces;

class _12aInterfaceWithGeneric {
public static void main(String[] args) throws Exception {
	SimpleObject<String> stringObject = new StringObject();
}

interface SimpleObject<T> {
	SimpleObject<T> getInstance();
}

public static  class StringObject implements SimpleObject<String> {

	public StringObject getInstance() {
		return this;
	}
}

}

/*
SimpleObject interface
1. Create a StringObject class.
2. Make the StringObject class implement the SimpleObject interface using a String parameter.
3. The program must compile.


Requirements:
1. The StringObject class must implement the SimpleObject interface.
2. The SimpleObject interface in the StringObject class must be implemented using a String parameter.
3. The StringObject class must implement the SimpleObject interface's getInstance method.
4. The Solution class must have a StringObject class.
5. The StringObject class must be static.

package com.codegym.task.task13.task1322;

SimpleObject interface

public class Solution {

public static void main(String[] args) throws Exception {
	SimpleObject<String> stringObject = new StringObject();
}

interface SimpleObject<T> {
	SimpleObject<T> getInstance();
}
}






 */