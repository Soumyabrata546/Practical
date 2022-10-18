package PallabiMaam;
abstract class Testabstract{//abstract class --parent class
	abstract  void display();
	void show() {
		System.out.println("Non abstract method");
	}
}
class Demo1 extends Testabstract {//1st child class
	void display() {
		System.out.println("Demo 1 method");
	}
}
class Demo2 extends Testabstract {//1st child class
	void display() {
		System.out.println("Demo 2 method");
	}
}

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testabstract ob1=new Demo1();//upcasting
		Testabstract ob2=new Demo2();
		ob1.display();
		ob2.display();
		ob1.show();
	}

}
