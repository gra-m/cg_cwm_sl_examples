package javatest.other.genericsandcollections._01generics._03_comparable;

class AppClass {
public static void main(String[] args) {

	//GenericList<UserComparable> list = new GenericList<>();
	var list = new GenericList<UserComparable>();
	list.add(new UserComparable(5));
	list.add(new UserComparable(20));
	list.add(new UserComparable(13));

	var userComparable1 = list.get(0);
	var userComparable2 = list.get(1);
//	var userComparable3 = list.get(2);

	if(userComparable1.compareTo(userComparable2) < 0)
		System.out.println("user1 < user2");
	else if(userComparable1.compareTo(userComparable2) == 0)
		System.out.println("user1 == user2");
	else
		System.out.println("user1 > user2");




//	UserComparable[] userComparables = list.getItems();
}
}
