package oca.curiosities.exceptions;

// unlike the original q I have added try catch to main so 6 printed.
public class Cat_MainCatch_q11 {
public String name;
public void parseName() {
	System.out.print("1");
	try{
		System.out.print("2");
		int x = Integer.parseInt(name);
		System.out.print("3");
	} catch (NullPointerException npe) {
		System.out.print("4");
	}
	System.out.print("5");
}

//public static void main(String[] args)  {
public static void main(String[] args) throws NumberFormatException {
	Cat_MainCatch_q11 leo = new Cat_MainCatch_q11();
		leo.name = "Leo";
		try {leo.parseName();} catch (NumberFormatException npe) {
			System.out.println("6");
		}

}
}
