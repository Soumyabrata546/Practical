package PallabiMaam;

import java.util.ArrayList;

public class Autoboxingeg {
public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<Integer>();
	
	a1.add(1);//adding the int primtive type value by using add method
	a1.add(2);
	a1.add(3);//autoboxing
	System.out.println("Arraylist:"+a1);
}
}
