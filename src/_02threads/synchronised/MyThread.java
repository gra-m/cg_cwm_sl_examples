package _02threads.synchronised;

class MyThread extends Thread {

	@Override
	public void run(){
		display();
	}

	synchronized static void display(){
		int x = 0;

		while(x<10) {
			System.out.println(x);
			x++;
			try{
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


