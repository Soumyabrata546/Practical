package PallabiMaam;

public class FinalMethod {
	final void display() {
			System.out.println("hello");
		}
//	class test extends FinalMethod{
//		final void display() {
//			System.out.println("ovveriding");
//		}
//		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethod f=new FinalMethod();
		f.display();
	}

}//we can't override final method in child class
