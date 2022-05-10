package javatest.core.javadeclarations.staticmethods_fields;
// showing how instance of object can be
// used to call static method; even when null.

public class _03KoalaTester {
public static void main(String[] args) {
	_01Koala koala = new _01Koala();
	System.out.println(koala.count);
	koala = null;
	System.out.println(koala.count);

	_01Koala.count =4;
	_01Koala koala1 = new _01Koala();
	_01Koala koala2 = new _01Koala();
	koala1.count = 6;
	koala2.count = 5;
	System.out.println(_01Koala.count);
}
}
