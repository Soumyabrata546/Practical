package PallabiMaam;
interface Multiple{//interface 1
	abstract void show();//abstract method
	
}
interface Multiple2{//interface 2
	abstract void show2();//abstract method 
}

class demo123 implements Multiple,Multiple2{//child class
	public void show() {//ovveridng of interface 1 method show
		System.out.println("hi");
	}
	public void show2() {//ovveridng of interface 2 method show2
		System.out.println("hello");
	}
}
public class Multi_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo ob=new demo();
//		ob.show();
		demo123 obj=new demo123();		
		obj.show2();
		//obj.display();
			
	}

}
