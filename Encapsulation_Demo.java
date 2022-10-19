package PallabiMaam;

import java.util.Scanner;

class encap_d{//fully encapsulated class
	private//private data members
		String Student_name;
		private int Studentuser_id;
		private int password;
		int total,percentage;
		public String getStudent_name() {
			return Student_name;
		}
		public void setStudent_name(String student_name) {
			Student_name = student_name;
		}
		public int getStudentuser_id() {
			return Studentuser_id;
		}
		public void setStudentuser_id(int studentuser_id) {
			Studentuser_id = studentuser_id;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public void calc(int sub1,int sub2,int sub3,int sub4,int sub5) {
			total=sub1+sub2+sub3+sub4+sub5;
			percentage=total/5;
			if(percentage>=35&&percentage<=45)
				System.out.println("D grade");
			else if(percentage>=45&&percentage<=55)
				System.out.println("B grade");
			else if(percentage>=60&&percentage<=75)
				System.out.println("A  grade");
			else if(percentage>=75&&percentage<100)
				System.out.println("O grade");
			else
				System.out.println("Fail/Absent");
		}
}
public class Encapsulation_Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String stuname;
	int stupass,sid;
	int sub1,sub2,sub3,sub4,sub5;
	//user input using scanner
	System.out.println("Enter your name=");
	stuname=sc.nextLine();
	System.out.println("Enter your user_id=");
	sid=sc.nextInt();
	System.out.println("Enter your password=");
	stupass=sc.nextInt();
	System.out.println("Enter marks of 5 subjects=");
	System.out.println("Marks of sub1=");
	sub1=sc.nextInt();
	System.out.println("Marks of sub2=");
	sub2=sc.nextInt();
	System.out.println("Marks of sub3=");
	sub3=sc.nextInt();
	System.out.println("Marks of sub4=");
	sub4=sc.nextInt();
	System.out.println("Marks of sub5=");
	sub5=sc.nextInt();
	encap_d ob=new encap_d();
	ob.setStudent_name(stuname);
	ob.setPassword(stupass);
	ob.setStudentuser_id(sid);
	System.out.println("Name:"+ob.getStudent_name());
	System.out.println("User id:"+ob.getStudentuser_id());
	System.out.println("Password="+ob.getPassword());
	ob.calc(sub1, sub2, sub3, sub4, sub5);
	System.out.println("Percentage="+ob.percentage+"\nTotal marks="+ob.total);
	sc.close();
}
}
