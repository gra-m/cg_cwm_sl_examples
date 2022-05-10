package oca.curiosities.enthu;
// The only way I can get my head round this inconsistency is that the if statement is temporal, ie, assess values at this specific time
// whereas line 16 is insisting on a resolution before the initialization can take place.
// Whatever it is it is fucking annoying.
class Embarassing {

public static void main(String[] args) throws Exception {
	int i = 1, j = 10;
	do {
		if (i++ > --j) continue; // first time check is 1/10 not 1/9 the pre decrement does not show
	} while (i < 5);
	System.out.println("i=" + i + " j=" + j);


	int x = 10, y = 10;

	int z = y - --x; // Whereas here it fucking does.
	System.out.println(z);

	System.out.println();
	int a = 6;
	int b = (++a) + (a++) + (a++);
	System.out.println(b);


}



}
