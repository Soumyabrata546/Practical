package PallabiMaam;

public class Thread_ex4 implements Runnable{
public void run() {
	System.out.println("hi");
}
	public static void main(String[] args) {
		Thread_ex4 th4=new Thread_ex4();
		Thread t=new Thread(th4,"Hello");
		t.start();
		String s=t.getName();
		System.out.println(s);
}
}
