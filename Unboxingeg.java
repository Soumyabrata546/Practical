package PallabiMaam;

import java.util.ArrayList;

public class Unboxingeg {
public static void main(String[] args) {
ArrayList<Integer>a1=new ArrayList<Integer>();
	
	a1.add(1);//adding the int primtive type value by using add method
	a1.add(2);
	System.out.println("Arraylist:"+a1);
	//unboxing
	int a=a1.get(0);//returns 
	int b=a1.get(1);
	System.out.println(a+" "+b);
}
}
