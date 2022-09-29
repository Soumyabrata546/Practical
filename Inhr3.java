package PallabiMaam;

//hierarchical inheritance
class Vehicle3{//parent class A
	void running() {
		System.out.println("running mode is on");
	}
}
	class Bike2 extends Vehicle3{//child class b
		void run() {
			System.out.println("Bike run mode on");
		}
	}
	class Car2 extends Vehicle3{//child class c
		void speed() {
			System.out.println("Car is running");
		}
	}

public class Inhr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1=new Car2();//object of child class
		c1.speed();//child class method
		c1.running();//parent class
		Bike2 b1=new Bike2();
		b1.run();
		b1.running();
	}

}
