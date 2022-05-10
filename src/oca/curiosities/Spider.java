package oca.curiosities;
class Arthropod {
public void printName(double input) {
	System.out.print("Arthropod");
}
}

public class Spider extends Arthropod {
	public String printName(int input) {
		System.out.print("Spider");
		return "Spider";
	}

	public static void main(String[] args) {
		Spider spider = new Spider();
		spider.printName(4);
		spider.printName(9.0);

	}
}


