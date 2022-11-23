package PallabiMaam;
//by implementing runnable
public class Thread_ex2 implements Runnable{
public void run() {
	System.out.println("I am a thread....thread is running");
}
public static void main(String[] args) {
	Thread_ex2 ri=new Thread_ex2();
	Thread t=new Thread(ri);//passing runnable object to thred class
	//threads run method will invoke the run of runnable
	t.start();
}
}
