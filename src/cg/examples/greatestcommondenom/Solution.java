package cg.examples.greatestcommondenom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Integer input1 = null;
	Integer input2 = null;

		input1 = Integer.valueOf(reader.readLine()); // no autoboxing String -> Integer
		input2 = Integer.parseInt(reader.readLine()); // String -> Int autoboxed to Integer


	List<Integer> list1 = getDivisors(input1);
	List<Integer> list2 = getDivisors(input2);

	for(Integer i: list1)
		System.out.println(i);
	System.out.println();
	for(Integer i: list2)
		System.out.println(i);

	List<Integer> commonDenominators = streamComparison(list1, list2);

	System.out.println();
	for(Integer i: commonDenominators)
		System.out.println("common" + i);

	System.out.println("GCD == " + getGreatest(commonDenominators));

	List<Integer> list3 = getDivisors(input1);
	List<Integer> list4 = getDivisors(input2);

	List<Integer> commonDenominators1 = manualComparison(list3, list4);

	System.out.println();
	for(Integer i: commonDenominators1)
		System.out.println("common" + i);

	System.out.println("GCD == " + getGreatest(commonDenominators));



}

private static List<Integer> getDivisors(Integer value) {
	List<Integer> passedValuesDivisors= new ArrayList<>();
	passedValuesDivisors.add(1);
	int maximum = (value / 2) + 1;

	for (int i = 2; i <= maximum; i++) {
		if(value % i == 0)
			passedValuesDivisors.add(i);
	}
	return passedValuesDivisors;
}

private static List<Integer> streamComparison(List<Integer> list1, List<Integer> list2) {

	return list1.stream()
		       .distinct() // remove duplicated elements
		       .filter(list2::contains) // look at lambda of this == select only elements that are contained in other list
		       .sorted()
		.collect(Collectors.toList());
}


private static List<Integer> manualComparison(List<Integer> list1, List<Integer>list2) {
	//List<Integer> sortedList1 = list1.stream().sorted().collect(Collectors.toList());
	//list2.sort(Comparator.naturalOrder());
	//Collections.sort(list1, Collections.reverseOrder());

	List<Integer>	returnList = new ArrayList<>();
	list1 = sortList(list1);
	list2 = sortList(list2);

	for (int i = 0; i < list1.size(); i++) {
		for (int x = 0; x < list2.size(); x++) {
			if (list1.get(i) == list2.get(x)) {
				returnList.add(list2.get(x));
			}
		}
	}
	return sortList(returnList);
}

private static List<Integer> sortList(List<Integer> list) {
		list.sort(Comparator.naturalOrder());
	return list;
}

private static Integer getGreatest(List<Integer> commonDenominators){
	return commonDenominators.get(commonDenominators.size()-1);
}


}
