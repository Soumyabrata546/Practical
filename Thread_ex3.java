package PallabiMaam;

public class Thread_ex3 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
public static void main(String[] args) {
	Thread t1=new Thread("Pallabi");
	t1.start();
	Thread t2=new Thread();
	t2.start();
	t2.setName("Anudip");
//	System.out.println(t1.getName());
//	System.out.println(t2.getName());
}
}
