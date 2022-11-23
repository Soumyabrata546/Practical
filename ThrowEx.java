package PallabiMaam;

public class ThrowEx {
	public static void eligable(int a) throws ArithmeticException{
		//throw arithmetic excep if age <18
		if(a>=0&&a<=35) {
			throw new ArithmeticException("Value can't be less than 35");
		}
		else
			System.out.println("You are Pass");
	}
public static void main(String[] args) {
	eligable(35);
	System.out.println("done");
}
}


