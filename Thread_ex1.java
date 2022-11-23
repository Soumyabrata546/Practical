package PallabiMaam;
//by extending thread class
public class Thread_ex1 extends Thread{
public void run() {
	System.out.println(Thread.currentThread().getName());
}
public static void main(String[] args) {
	Thread_ex1 t=new Thread_ex1();
	//t.setName("Soumya");//sets the thread name
	//t.start();//invokes run method
	t.run();/* if we directly call the 
	run() method then no new thread will be created and run() method will be executed as 
	a normal method call on the current calling thread itself and 
	no multi-threading will take place.
	*/
	t.start();/*
	When a program calls the start() method, a new thread is created 
	and then the run() method is executed.
	*/
	
	//System.out.println(t.getName());//returns the thread name
}
}
