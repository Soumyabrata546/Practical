package PallabiMaam;

public class Thread_ex6 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
public static void main(String[] args) {
	Thread_ex6 t1=new Thread_ex6();
	Thread_ex6 t2=new Thread_ex6();
	t1.start();
	t2.start();
	t2.setName("Anudip");
//	System.out.println(t1.getName());
//	System.out.println(t2.getName());
}
}
