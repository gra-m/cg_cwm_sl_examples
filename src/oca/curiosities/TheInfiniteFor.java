package oca.curiosities;



public class TheInfiniteFor {
public static void main(String[] args) {
	final char a = 'A', d = 'D';
	final int one = 1, two = 2;
	final int hexa = 0x5;
	final double hexa2 = 0xA7;
	final int binary = 0b111000;
	final int binary2 = 0B101;
	final double binary3 = 0B101;
	String asif[] = new String[]{"one"};
	String[] asif2 = new String[]{"two", "three"};
	String[] asif3 = new String[0];

	for (int i =0; i < 10 ;) {
		// i must be incremented first, otherwise just assigned old value i++
		i = ++i;
		System.out.println("Hello World");
	}
}
}
