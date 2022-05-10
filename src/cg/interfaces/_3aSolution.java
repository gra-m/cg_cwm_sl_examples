package cg.interfaces;

class _3aSolution {

public static void main(String[] args) throws Exception {
}

interface SimpleObject<T> {
	SimpleObject<T> getInstance();
}

class StringObject implements SimpleObject {

	@Override
	public SimpleObject<String> getInstance() {
		return new StringObject();
	}
}
}


/*
Make the StringObject class implement the SimpleObject interface using a String parameter.
Requirements:

    •
    The StringObject class must implement the SimpleObject interface.
    •
    The SimpleObject interface in the StringObject class must be implemented using a String parameter.
    •
    The StringObject class must implement the SimpleObject interface's getInstance method.
    •
    Don't create additional classes or interfaces.

//Original

package com.codegym.task.task13.task1307;

Parameterized interface


public class Solution {
public static void main(String[] args) throws Exception {
}

interface SimpleObject<T> {
	SimpleObject<T> getInstance();
}

class StringObject //write your code here
{
}
}

*/

