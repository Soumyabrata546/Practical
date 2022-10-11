package HandsOn_Lab;
class shape2{//parents class
	shape2() {//parent class method
		System.out.println("print circle");
	}
}
class size2 extends shape2{
	size2(){//constructor of child class
		//super();//will call the parent class constructor
		System.out.println("hello i am child class");
	}
}
public class SuperCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size2 obj=new size2();
		//this will call size2() constructor
	}

}
//in this program if we don't use super()keyword ,still the constructor will be called implicitly.
