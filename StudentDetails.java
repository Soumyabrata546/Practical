package PallabiMaam;

public class StudentDetails {
int id;
String name;
StudentAddress add;
public StudentDetails(int id,String name,StudentAddress add) {
	this.id=id;
	this.name=name;
	this.add=add;
	// TODO Auto-generated constructor stub
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(add.area+" "+add.city+" "+add.district);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAddress a1=new StudentAddress("workshop", "Andal", "Paschim bardhaman");
		StudentDetails d1=new StudentDetails(1, "Soumya", a1);
		d1.show();
	}
//addded description
}
