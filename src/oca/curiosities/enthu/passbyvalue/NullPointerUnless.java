package oca.curiosities.enthu.passbyvalue;

public class NullPointerUnless {

	public void initData(String[] arr){
		int ind = 0;
		for(String str : arr){
			str.concat(str+" "+ind); // calling method on null value
			ind++;
		}
	}




	public void printData(String[] arr){
		for(String str : arr){
			System.out.println(str);
		}
	}



	public static void main(String[] args) {
		NullPointerUnless npu = new NullPointerUnless();


		String[] arr = new String[2];
		//arr[0] = "notnull";
		//arr[1] = "notnull";
		npu.initData(arr);
		npu.printData(arr);


	}
}
