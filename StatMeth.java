package Fresh;

public class StatMeth {
	int roll;
	String name;
	float fee;
	static String clg="SRM";
	 StatMeth(int roll, String name, float fee) {
	this.roll=roll;
	this.name=name;
	this.fee=fee;
		 // TODO Auto-generated constructor stub
	}
	 static void change() {
		 clg="BBC";
	 }
	 void diplay() {
		 System.out.println(roll+" "+name+ " "+ fee+ " "+ clg);
	 }
class StatMeth1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		StatMeth.change();
				StatMeth ob1=new StatMeth(100,"Soumya",500);
				ob1.diplay();
	}

}
}
