package PallabiMaam;
class Bank{
float rateofInterest() {
	return 0;
}
}
class Axis extends Bank{
float rateofInterest() {
	return 2.3f;
}
}
class Sbi extends Bank{
	float rateofInterest() {
		return 7.3f;
	}
}
class Icici extends Bank{
	float rateofInterest() {
		return 5.4f;
	}
}
class MainBank{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank obj;
	obj=new Axis();
	System.out.println("Axis"+obj.rateofInterest());
	obj=new Sbi();
	System.out.println("Sbi"+obj.rateofInterest());
	obj=new Icici();
	System.out.println("Icic"+obj.rateofInterest());
	}
}
