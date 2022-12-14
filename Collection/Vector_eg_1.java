package Collection;

import java.util.Vector;

public class Vector_eg_1 {
public static void main(String[] args) {
	//creating vector
	Vector <String>vc=new Vector<String>(2);
	//adding element to vector
	vc.add("Dog");
	vc.add("Cat");
	vc.add("Human");
	vc.add("Bat");
	vc.add(1,"Pokemon");
	//checking size & capacity
	System.out.println("Size="+vc.size());
	System.out.println("Capacity="+vc.capacity());
//add more elements
	vc.addElement("Cow");
	vc.addElement("Goat");
	System.out.println("After adding elements="+vc.size());
	System.out.println("Size="+vc.size());
	System.out.println("Size="+vc.capacity());
//checking cat is present in the vector or not
	System.out.println(vc);
	if(vc.contains("Cat")) {
	System.out.println("Elements present");
	}else {
		System.out.println("Element not present");
	}//getting first element
	System.out.println("1st element is"+vc.firstElement());
	//checking index of specified element
	System.out.println("index"+vc.indexOf("cat"));
}
}
