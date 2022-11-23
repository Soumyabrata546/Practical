package PallabiMaam;



public class Thread_5 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread_ex5 t=new Thread_ex5();
		Thread_ex5 t1=new Thread_ex5();
		Thread_ex5 t2=new Thread_ex5();
		
		t.start();
		
		try {
			t.join();
		}catch (InterruptedException e) {
			System.out.println(e);// : handle exception
		}
		t1.start();
		t2.start();
	}
}