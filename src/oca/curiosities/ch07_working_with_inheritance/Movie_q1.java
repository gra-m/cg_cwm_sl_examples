package oca.curiosities.ch07_working_with_inheritance;

class Cinema {
String name; // second compilation error (was private)
public Cinema(String name) {this.name = name;}
}
public class Movie_q1 extends Cinema {
public Movie_q1(String movie) {
	super(movie); // first compilation error (without super)
}
public static void main(String[] showing) {
	System.out.print(new Movie_q1("Another Trilogy").name);
}
}
