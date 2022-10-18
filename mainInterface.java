package PallabiMaam;
interface Test{//interface
	void show();
}
class demo implements Test{
	public void show() {
		System.out.println("hello i am show in demo1");
	}
}
class demo12 implements Test{
	public void show() {
		System.out.println("hello i am show in demo 2");
	}
}
public class mainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo ob=new demo();
//		ob.show();
		Test obj=new demo12();		
		obj.show();
			
	}

}
