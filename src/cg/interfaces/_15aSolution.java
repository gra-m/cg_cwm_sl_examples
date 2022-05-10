package cg.interfaces;

class _15aSolution {
public static void main(String[] args) throws Exception {
}
interface Selectable {
	void onSelect();
}
interface Updatable extends Selectable {
	void refresh();
}
class Screen implements Updatable {
	public void onSelect(){};
	public void refresh(){};
}
}

/*
Make the Screen class implement the Updatable interface.
Requirements:

    •
    The Updatable interface must inherit the Selectable interface (use extends).
    •
    The Screen class must implement the Updatable interface.
    •
    The Selectable interface's onSelect method must be implemented in the Screen class.
    •
    The Updatable interface's refresh method must be implemented in the Screen class.

package com.codegym.task.task13.task1323;

//Updatable interface in the Screen class


public class Solution {
public static void main(String[] args) throws Exception {
}

interface Selectable {
	void onSelect();
}

interface Updatable extends Selectable {
	void refresh();
}

class Screen {

}
}

 */