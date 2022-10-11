package HandsOn_Lab;
class shape1{//parents class
	void print() {//parent class method
		System.out.println("print circle");
	}
}
class size1 extends shape1{
	void print() {//same method of parent class
		System.out.println("print triangle");
	}
	void display() {//new method of child class
		System.out.println("print nothing");
	}
	void show() {//final method
		super.print();//refer immediate parent method
		display();
		print();
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size1 obj=new size1();
		obj.show();
	}

}
