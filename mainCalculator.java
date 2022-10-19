package PallabiMaam;
//class calculator
class Calculator{
	void addition(int... number){//Using VARARGS that can accept any no of arguments
		int sum=0;
		for(int i:number) {
			sum+=i;
		}
		System.out.println("Addition ="+sum);
	}
	void subtraction(int... number){//Using VARARGS that can accept any no of arguments
		int sub=0;
		for(int i:number) {
			sub=i-sub;
		}
		System.out.println("Subtractio ="+sub);
	}
	void multiplication(int... number){//Using VARARGS that can accept any no of arguments
		int mul=1;
		for(int i:number) {
			mul=i*mul;
		}
		System.out.println("Multiplication ="+mul);
	}
	
}
public class mainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.addition(3, 5);
		c.subtraction(3, 10);		
		c.multiplication(4, 5);
	}

}
