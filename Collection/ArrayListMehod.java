package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMehod {
public static void main(String[] args) {
	List<String>al=new ArrayList<String>();//generic intriduced after java 5 onward
	al.add("Rose");
	al.add("Sunflower");
	al.add("Lily");
	al.add("David");
	al.add("Maria");
	al.add("Fluid");
String element=al.get(2);
System.out.println("Get index"+element);
System.out.println("Is array emplty"+al.isEmpty());
String el2=al.remove(4);
System.out.println("Removed elemnet"+el2);
System.out.println("Traversing");
for(String s:al)
	System.out.println(s);
List<Integer>al=new ArrayList<Integer>();//generic intriduced after java 5 onward
al.add(12);
al.add(15);
al.add(18);
al.add(20);
al.add(22);

}
}
