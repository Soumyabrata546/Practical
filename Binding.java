package PallabiMaam;
//class Binding{
//	private void display() {//static binding(private,final and static)
//		System.out.println("samjhe??");
//	}
//	public static void main(String args[]) {
//		Binding obj=new Binding();
//		obj.display();
//	}
//}
class TestBinding{
	int num=10;
	void show() {//Dynamic binding
		
		System.out.println("ab samjhe??");
	}
}
class Binding extends TestBinding{
	int num=12;//instance variable can't be overriden
	void show() {
	System.out.println("override");	
	}
	public static void main(String args[]) {
		TestBinding obj=new Binding();
		obj.show();
		System.out.println(obj.num);
	}
}