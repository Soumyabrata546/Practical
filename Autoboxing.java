package PallabiMaam;

public class Autoboxing {
public static void main(String[] args) {
	int a=10;
	Integer i=Integer.valueOf(a);//converting int into Integer
	Integer j=a;//now compiler will write Integer.valueof(a)autoboxing
	System.out.println(a+" "+i+" "+j);
}
}
