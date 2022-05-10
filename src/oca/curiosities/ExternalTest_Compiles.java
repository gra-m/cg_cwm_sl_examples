package oca.curiosities;

public class ExternalTest_Compiles {

int x = 5;

public static void main(String[] args) {
	 //public int x = 6;
	int x = 6;
	ExternalTest_Compiles b = new ExternalTest_Compiles();
	System.out.println(b.x);
}

}
