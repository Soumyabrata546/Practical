package PallabiMaam;
//Method overloading
public class Moverload {
static int sum(int a,int b) {
	return a+b;
	
}
static int sum(int a,int b,int c) {
	return a+b+c;
}
static double sum(double a,double b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(5,6));
System.out.println(sum(7.2,6.3));
System.out.println(sum(5,6,7));
	}

}
