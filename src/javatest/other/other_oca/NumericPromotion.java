package javatest.other.other_oca;

import java.io.File;

public class NumericPromotion {
public static void main(String[] args) {
	short x = 10;
	short y = 3;

	short z = (short) (x / y); // both promoted to int have to be recast to short.

	double a = 39.21;
	float b = 23.452f;

	float c = (float) (a + b); // float is promoted to double

	short e = 14; // promoted to int first as short, then float for * e f result then promoted to double.
	float f = 13;
	double g = 30;

	double hi = e * f / g;

	// and just because it's been a while and I got this so wrong..:

	int h = 3;
	int i = ++h * 5 / h-- + --h;
	System.out.println("h is " + h);
	System.out.println("i is " + i);

	// Not just shorthand

	long j = 10;
	int k = 5;
	j = j * k; // does not compile in Java 8

	j *= k;

	// Short Circuit ll is never incremented

	int ll = 6;
	boolean m = (ll >= 6) || (++ll <= 7);
	System.out.println(ll);

	// == equality operator

	File n = new File("myFile.txt");
	File o = new File("myFile.txt");
	File p = n;
	System.out.println(n == o); // Outputs false
	System.out.println(n == p); // Outputs true

	//Ternary
	int q = 10;
	final int r;
	if(q > 5) {
		r = 2 * q;
	} else {
		r = 3 * q;
	}


	int r1 = (q > 5) ? (2 * q) : (3 * q);








}
}
