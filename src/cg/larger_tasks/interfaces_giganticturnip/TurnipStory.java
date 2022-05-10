package cg.larger_tasks.interfaces_giganticturnip;

import java.util.List;

public class TurnipStory {
static void tell(List<Person> items) {
	Person first;
	Person second;
	for (int i = items.size()-1; i > 0 ; i--) {
		first = items.get(i);
		second = items.get(i - 1);
		first.pull(second);
	}
}
}

/*
package com.codegym.task.task13.task1327;

import java.util.List;

public class TurnipStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            first.pull(second);
        }
    }
}

 */