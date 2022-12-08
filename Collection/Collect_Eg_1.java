package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collect_Eg_1 {
public static void main(String[] args) {
	List<String>al=new ArrayList<String>();
	al.add("Rose");
	al.add("Sunflower");
	al.add("Rose");//Can also add duplicate values as well
	//we can add element in any specified location
	al.add(0,"Lilly");
	al.add(2,"Daisy");
	al.add("MarieGold");
	al.add(6,"Tulip");
	al.add("Orchid");
	al.add("Lotus");
	al.add(5,"lavender");
	//add the elemet at tge last
	al.add("Pallabi");
	System.out.println(al);
	System.out.println("Size of array list: "+al.size());
	System.out.println("element of index value 6 is: "+al.get(6));
	al.remove(6);
	System.out.println(al);
	System.out.println("Size of array list: "+al.size());
}
}
