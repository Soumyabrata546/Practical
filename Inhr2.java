package Fresh;


class vehicle1{//parent class A
	void running() {
		System.out.println("running mode is on");
	}
}
	class Bike1 extends vehicle1{//child class b
		void run() {
			System.out.println("Bike run mode on");
		}
	}
	class Car1 extends Bike1{//child class c
		void speed() {
			System.out.println("Car is running");
		}
	}

public class Inhr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1=new Car1();//object of child class
		c1.run();//child class method
		
		c1.running();//parent class
		c1.speed();//child c class method
	}

}
