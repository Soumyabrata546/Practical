package Fresh;

class Staticvar{
	int roll;
	String name;
	float fee;
	static String clg="SRM";
	 Staticvar(int roll, String name, float fee) {
	this.roll=roll;
	this.name=name;
	this.fee=fee;
		 // TODO Auto-generated constructor stub
	}
	 void diplay() {
		 System.out.println(roll+" "+name+ " "+ fee+ " "+ clg);
	 }
}
public class Stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvar ob1=new Staticvar(100,"Soumya",500);
		ob1.diplay();
	}

}
