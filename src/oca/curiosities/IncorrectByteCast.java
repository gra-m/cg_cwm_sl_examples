package oca.curiosities;

//

class IncorrectByteCast {
public static void main(String[] args) {
	byte a = 40, b = 50;
	//byte sum = (byte) a + b;
	// corrected =
	byte sum = (byte) (a + b);

	System.out.println(sum);

	char one = '1', two ='2';

	char sum1 = (char) (one + two);

	System.out.println(sum1);

}
}
