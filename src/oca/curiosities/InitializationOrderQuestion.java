package oca.curiosities;

public class InitializationOrderQuestion {
static String result = "";

{
	result += "c";
}

static {
	result += "u";
}

{
	result += "r";
}

	public static void main(String[] args) {  // _ == space
		System.out.print(InitializationOrderQuestion.result + " "); //u_    // static call1
		System.out.print(InitializationOrderQuestion.result + " "); //u_u_  // static call2
		new InitializationOrderQuestion(); // u_u_ucr
		//System.out.print(InitializationOrderQuestion.result + " ");
		new InitializationOrderQuestion(); // u_u_ucrcr // cr and not ucr because static block ONLY EVER CALLED once
		System.out.print(InitializationOrderQuestion.result + " ");
	}





}
