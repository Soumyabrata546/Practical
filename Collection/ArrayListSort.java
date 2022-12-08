package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
public static void main(String[] args) {
	List<String>al=new ArrayList<String>();//generic introduced after java 5 
	al.add("Rose");
	al.add("Sunflower");
	al.add("Lily");
	al.add("David");
	al.add("Maria");
	al.add("Fluid");
System.out.println("String sorted list:");
Collections.sort(al);
for(String s:al)
	System.out.println(s);
Collections.reverse(al);//in col with help of revrerse method we can easily reverse the list
System.out.println(al);

List<Integer>al1=new ArrayList<Integer>();//generic intriduced after java 5 onward
al1.add(12);
al1.add(18);
al1.add(15);
al1.add(20);
al1.add(22);
System.out.println("Integer sorted list:");
Collections.sort(al1);
for(int s:al1)
	System.out.println(s);
Collections.reverse(al1);
System.out.println(al1);
}
}
