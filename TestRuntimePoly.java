package PallabiMaam;
class Runtimepoly{
	int value=50;
	void show() {
		System.out.println("show anything");
	}
}
class TestRuntimePoly extends Runtimepoly{
int value12=70;//in upcasting we cant access the instance var of child class
void show() {
	System.out.println("show nothing");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runtimepoly ob=new TestRuntimePoly();
ob.show();
System.out.println("value="+ob.value);
	}

}
