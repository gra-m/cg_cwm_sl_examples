package oca.curiosities.enthu;

public class BooleanShortCircuit {
	public static void main(String args[ ] ){
		int i = 0 ;
		boolean bool1 = true ;
		boolean bool2 = false;
		boolean bool  = false;
		bool = ( bool2 &  method1(i++) ); //1 false false
		System.out.println(bool);
		bool = ( bool2 && method1(i++) ); //2 shortCircuits only ever true if both true, first isnt
		System.out.println(bool);
		bool = ( bool1 |  method1(i++) ); //3
		System.out.println(bool);
		bool = ( bool1 || method1(i++) ); //4 shortCircuits only ever true if either are true first is
		System.out.println(bool);

		System.out.println(i);
	}
	public static boolean method1(int i){
		return i>0 ? true : false;
	}
}


