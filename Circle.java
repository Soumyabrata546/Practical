package PallabiMaam;
//Area of the circle pi*r*r
//Aggregation has a relationship
//we have created the reference entity of aggregation class in circle class
class Aggregation{
	int square(int r) {
		return r*r;
	}
}
public class Circle {
Aggregation ag;
double pi=3.14;
double area(int radius) {
	ag=new Aggregation();
	int psq=ag.square(radius);
	return pi*psq;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		double res=c.area(5);
		System.out.println(res);
}

}
