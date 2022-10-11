package HandsOn_Lab;
class shape{//parents class
	String name="circle";
}
class size extends shape{
	String name="triangle";
	
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size s=new size();
		s.print();
	}

}
