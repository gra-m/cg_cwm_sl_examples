package javatest.core.oop.overloading;

public class _02Glider2 {
public static String glide(String s) {
	return "1";
}

public static String glide(String... s) {
	return "2";
}

public static String glide(Object o) {
	return "3";
}

public static String glide(String s, String t) {
	return "4";
}

public static String glide(long... l) {
	return "5";
}

public static String glide(Long l) {
	return "6";
}

public static void main(String[] args) {
	System.out.println(glide("a")); //1
	System.out.println(glide("a", "b")); //4
	System.out.println(glide("a", "b", "c")); //2
	System.out.println(glide(4L, 5L)); //5
	System.out.println(glide(4L)); //6
	System.out.println(glide(4)); //3
}
}