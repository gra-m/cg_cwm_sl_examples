package oca.curiosities.enthu;

public class CovariantReturns {
	public short getValue(){ return 1; } //1
}
class Base2 extends CovariantReturns{
	//public byte getValue(){ return 2; } //2 // Not possible to have covariant of primitive

   public short getValue(){ return 2; } //2
}

class TestClass{
	public static void main(String[] args){
		CovariantReturns b = new Base2();
		System.out.println(b.getValue()); //3
	}
}
