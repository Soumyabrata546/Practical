package PallabiMaam;

public class Thread_ex5 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		try {
			Thread.sleep(800);
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
		
		t2.start();
		t.start();
//		try {
//			t.join();
//		}catch (InterruptedException e) {
//			System.out.println(e);// : handle exception
//		}
//		t1.run();
//		try {
//			t1.join();
//		}catch (InterruptedException e) {
//			System.out.println(e);// : handle exception
//		}
//		t2.start();
	}
}
