package oca.curiosities.enthu;

public class ANullStringActuallyContainsNull {

public static void main(String[] args) {
	String myStr = "good";
	char[] myCharArr = {'g', 'o', 'o', 'd' };

	String newStr = null;
	for(char ch : myCharArr){
		newStr = newStr + ch;
	}

	System.out.println(newStr + " " + myStr);
	System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

}
}
