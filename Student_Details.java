package HandsOn_Lab;

public class Student_Details {
int Student_no;
String Student_name,Student_mail_id,Student_add;
static double increasedFess;
double fees;
//creating constructor
Student_Details(int sn,String name,String mail,String address){
	this.Student_no=sn;
	this.Student_name=name;
	this.Student_add=address;
	this.Student_mail_id=mail;
}
void fees(double f) {
	fees=f;
}
void display() {
	this.fees=this.fees+increasedFess;//updating the fees before printing
	System.out.println("Id-"+this.Student_no+"  Name-"+this.Student_name+" Mailid-"+Student_mail_id+" Address-"+Student_add+" Fees-"+fees);
}
static void increaseFees(int n,double f) {
	if(f<200)//condition
		f=10*f/100;//logic for incresing fees
		increasedFess=f;//assigning the value 
}
public static void main(String[] args) {
//Instantiating student type of array and declaring size
	Student_Details[] st=new Student_Details[3];
	st[0]=new Student_Details(101, "Soumya", "name@gmail.com", "Somewhere, bihar");
	st[1]=new Student_Details(102, "Nisha", "nisha@gmail.com", "Somewhere, bihar");
	st[2]=new Student_Details(103, "John", "john@gmail.com", "Somewhere, up");
	//adding fees value
	st[0].fees(1054);
	st[1].fees(20054);
	st[2].fees(40054);
	//incresing fees whose feess is less than 2000
	increaseFees(100,1054);
//	st[0].display();
	//traversing the array of student object
	System.out.println("__________________Details  of students___________");
	for(Student_Details i:st)
		i.display();
}
}
