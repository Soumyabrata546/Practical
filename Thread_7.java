package PallabiMaam;



public class Thread_7 extends Thread{
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
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		
	}
}